#include <bits/stdc++.h>
using namespace std;

int key;

int nhap_key();
int tim_kiem_tuan_tu(int key);
int tim_kiem_nhi_phan1(int key); ///cai dat voi vong lap
int tim_kiem_nhi_phan2(int key); ///cai dat voi de quy

int main()
{
    clockid_t start, finish;
    fstream fileInPut;
    string f1, f2;
    f1 = "input.txt";
    f2 = "input1.txt";
    fileInPut.open(&f1, ios::out);
    if(fileInPut.fail()){
        cout << "cannot open this file" << endl;
    }
    nhap_key();
    tim_kiem_tuan_tu(key);

    fileInPut.close();
    return 0;
}
//Hi I'm Truong
