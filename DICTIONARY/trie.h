// C implementation of search and insert operations
// on Trie
#include <stdio.h>
#include <stdlib.h>
//#include <string.h>
#include <stdbool.h>
#include <conio.h>
#include <string>

#define ARRAY_SIZE(a) sizeof(a)/sizeof(a[0])

// Alphabet size (# of symbols)
#define ALPHABET_SIZE (26)
//xoa nut
#define FREE(p) \
    free(p);    \
    p = NULL;

// Converts key current character into index
// use only 'a' through 'z' and lower case
#define CHAR_TO_INDEX(c) ((int)c - (int)'a')
#define INDEX_TO_CHAR(c) ((char)(c + (int)'a'))

using namespace std;

//char typing[30];
// trie node
struct TrieNode
{
  struct TrieNode *children[26];
  bool isEndOfWord;
};

// Returns new trie node (initialized to NULLs)
struct TrieNode *getNode() {
    struct TrieNode *pNode = NULL;
    pNode = (struct TrieNode *)malloc(sizeof(struct TrieNode));
    if (pNode)
    {
        int i;
        pNode->isEndOfWord = false;
        for (i = 0; i < ALPHABET_SIZE; i++)
            pNode->children[i] = NULL;
    }
    return pNode;
}
TrieNode *root = getNode();
// If not present, inserts key into trie
// If the key is prefix of trie node, just marks leaf node
void insert(struct TrieNode *root, const string &key)
{
    int level;
    int length = key.size();
    int index;

    struct TrieNode *pCrawl = root;

    for (level = 0; level < length; level++)
    {
        index = CHAR_TO_INDEX(key[level]);
        if (!pCrawl->children[index])
            pCrawl->children[index] = getNode();

        pCrawl = pCrawl->children[index];
    }

    //// mark last node as leaf
    pCrawl->isEndOfWord = true;
}

// Returns true if key presents in trie, else false
bool search(struct TrieNode *root, const string &key)
{
    int level;
    int length = key.size();
    int index;

    struct TrieNode *pCrawl = root;

    for (level = 0; level < length; level++)
    {
        index = CHAR_TO_INDEX(key[level]);

        if (!pCrawl->children[index])
            return false;

        pCrawl = pCrawl->children[index];
    }

    return (pCrawl != NULL && pCrawl->isEndOfWord);
}

void List(char* hint, int cnt, struct TrieNode *lastNode, char typing[]) { /// Dua ra goi y
    int i;
    for (i = 0; i < 26; ++i) {
        if (lastNode->children[i] == NULL) continue;
        hint[cnt] = INDEX_TO_CHAR(i);
        List(hint, cnt + 1, lastNode->children[i], typing);
    }
    if (lastNode->isEndOfWord) {
        hint[cnt] = '\0';
        printf("%s%s\n", typing, hint);
    }
}

struct TrieNode *GetLastNode(char typing[]) {
    struct TrieNode *lastNode = root;
    int i;
    int cnt = strlen(typing);
    for (i = 0; i < cnt; ++i) {
        if (lastNode->children[CHAR_TO_INDEX(typing[i])] == NULL)
            return NULL;
        lastNode = lastNode->children[CHAR_TO_INDEX(typing[i])];
    }
    return lastNode;
};

string SearchInput() {
    char c, hint[30];
    char typing[30];
    int cnt = 0;
    while((c = getch())!= '\r') {
        system("cls");
        fflush(stdin);
        if (cnt != 0 && c == '\b') { /// neu cnt != 0 tuc la typing khong rong, va c la ky tu backspace
            typing[--cnt] = '\0'; /// giam do dai xau typing & gan ky tu cuoi bang NULL
        }
        else {
            typing[cnt++] = c; /// nguoc lai, them ky tu vao cuoi & noi rong xau typing
        }
        puts(typing);
        if (cnt == 0) continue; /// xau rong thi khong dua ra goi y, de khi ban dau chi nhap backspace thi no ko ghi ca file ra

        struct TrieNode *lastNode = GetLastNode(typing); /// Lay TrieNode cua ky tu cuoi trong xau typing
        if (lastNode != NULL) { /// neu ky tu cuoi co ton tai tren cay Trie thi dua ra goi y
            List(hint, 0, lastNode,typing);
        }
    }
    return string(typing); /// chuyen char* sang string
}

int leafNode(struct TrieNode *root)
{
    return (root->isEndOfWord != 0);
}

int isItFreeNode(struct TrieNode *root)
{
    int i;
    for(i = 0; i < ALPHABET_SIZE; i++)
    {
        if( root->children[i] )
            return 0;
    }

    return 1;
}

bool deleteHelper(struct TrieNode *root, string key, int level, int len)
{
    if( root )
    {
        // Base case
        if( level == len )
        {
            if( root->isEndOfWord )
            {
                // Unmark leaf node
                root->isEndOfWord = 0;

                // If empty, node to be deleted
                if( isItFreeNode(root) )
                {
                    return true;
                }

                return false;
            }
        }
        else // Recursive case
        {
            int index = CHAR_TO_INDEX(key[level]);

            if( deleteHelper(root->children[index], key, level+1, len) )
            {
                // last node marked, delete it
                FREE(root->children[index]);

                // recursively climb up, and delete eligible nodes
                return ( !leafNode(root) && isItFreeNode(root) );
            }
        }
    }

    return false;
}

void deleteKey(struct TrieNode *root, string key)
{
    int len = key.size();

    if( len > 0 )
    {
        deleteHelper(root, key, 0, len);
    }
}
