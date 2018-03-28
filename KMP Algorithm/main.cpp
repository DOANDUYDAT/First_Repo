#include <bits/stdc++.h>
using namespace std;

#define len(a) strlen(a)/sizeof(a[0])
char text[] = "coca like cocacola, cocala very like cocacola";
char pattern[] = "cocacola";
int *prefix;

int* compute_Prefix(char pattern[], int *prefix);
int KMP(char pattern[], char text[]);

int main()
{
    cout << len(pattern);
//    pref = compute_Prefix(pattern);
    compute_Prefix(pattern, prefix);
    cout << KMP(pattern, text) << endl;
    return 0;
}

int* compute_Prefix(char pattern[], int *prefix)
{
    int m = len(pattern);
//    int prefix[m];
    prefix[0] = -1;
    prefix[1] = 0;
    int i = -1;
    for (int j = 2; j < m; j++){
        while ((i > -1) && (pattern[j] != pattern[i + 1])){
            i = prefix[i];
        }
        if (pattern[j] == pattern[i + 1]){
            i++;
        }
        prefix[j] = i;
    }
    return prefix;
}

int KMP(char pattern[], char text[])
{
    int m = len(pattern);
    int n = len(text);
    int i, j, k;
    i = j = k = 0;
    for (j = 0; j < n; j++){
        while ((i > -1) && (pattern[i + 1] != text[j])){
            i = prefix[i];
        }
        if (pattern[ i+ 1] == text[j]){
            i++;
        }
        if (i == m - 1){
            return j - m + 1;
            i = prefix[i];
        }
    }
}
