#include <bits/stdc++.h>
#include "trie.h"
#include "mapped.h" /// anh xa

void in_put();
void goi_y();

int main()
{
//    ios_base::sync_with_stdio(0); /// ham tang toc do cho iostream
    int choice;
    string key, value;
//    string typing;
    cout << "0. thoat" << endl
         << "1. them tu" << endl
         << "2. xoa tu" << endl
         << "3. tim tu" << endl;
    in_put();
    while (choice != 0){
        cout << "\nlua chon chuc nang: " << endl;
        setbuf(stdin, NULL);
        cin >> choice;
        switch(choice)
        {
            case 0: break;
            case 1:
                setbuf(stdin, NULL); /// xoa bo nho dem
                cout << "tu can them: ";
                cin >> key;
                cout << "nghia cua tu: ";
                setbuf(stdin, NULL);
                getline(cin, value);
                insert(root, key);
                them_tu(key, value);
                break;

            case 2:
                setbuf(stdin, NULL); /// xoa bo nho dem
                cout << "tu can xoa:";
                key = SearchInput();
                xoa_tu(key);
                deleteKey(root, key);
                break;
            case 3:
                setbuf(stdin, NULL); /// xoa bo nho dem
                cout << "tu can tim: ";
                key = SearchInput();
                cout << key << ':' << tim_tu(key);
                break;
        }
    }
    return 0;
}

void in_put()
{
    fstream FIN;
    string key, value;
//    string name;
//    cout << "nhap ten file: ";
//    setbuf(stdin, NULL); /// lam sach bo dem ban phim
//    cin >> name;
//    FIN.open(&name[0], ios:: in);
    FIN.open("input1.txt", ios:: in);
    if(FIN.fail()){
        cout << "ko mo duoc file" << endl;
        exit(0);
    }
    while (getline(FIN, key, '=')){ /// doc du lieu tu file input vao bien key cho den gap '='
        getline(FIN, value);        /// doc phan on lai vao bien value
        them_tu(key, value);        ///
        insert(root, key);
    }
    FIN.close();
}
