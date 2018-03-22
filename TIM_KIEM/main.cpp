#include <bits/stdc++.h>
using namespace std;

#define n 1000

int key;
int keys[10000];
fstream fileInPut;

void InPut();
int nhap_key();
int tim_kiem_tuan_tu(int key);
int tim_kiem_nhi_phan1(int key); ///cai dat voi vong lap
//int tim_kiem_nhi_phan2(int key, int l, int r); ///cai dat voi de quy

int main()
{
    clockid_t start, finish;
    string f1, f2;

    f1 = "input.txt";

    fileInPut.open(&f1[0], ios::in);
    if(fileInPut.fail()){
        cout << "cannot open this file" << endl;
        exit(1);
    }

    InPut();
    nhap_key();

    start = finish = clock();
    cout << tim_kiem_tuan_tu(key);
    cout << finish - start << endl;

    start = finish = clock();
    cout << tim_kiem_nhi_phan1(key);
    cout << finish - start << endl;

//    start = finish = clock();
//    cout << tim_kiem_nhi_phan2(key, 0, n - 1);
//    cout << clock() - start << endl;

    fileInPut.close();
    return 0;
}

void InPut()
{
    for (int i = 0; i < 1000; i++){
        fileInPut >> keys[i];
    }
}
int nhap_key()
{
    cout << "key = ";
    cin >> key;
    return key;
}

int tim_kiem_tuan_tu(int key)
{
    for (int i = 0; i < n; i++){
        if (keys[i] == key) return i;
    }
    return -1;
}

int tim_kiem_nhi_phan1(int key)
{
    int l = 0;
    int r = n - 1;
    while (l <= r){
        int m = (l + r) / 2;
        if (keys[m] == key)
            return m;
        else if (keys[m] < key){
            r = m - 1;
        }
        else l = m + 1;
    }
    return -1;
}

//int tim_kiem_nhi_phan2(int key, int l, int r)
//{
//    int m = (l + r) / 2;
//    if (keys[m] == key)
//        return m;
//    else if (keys[m] < key)
//        return tim_kiem_nhi_phan2(key, l, m-1);
//    else
//        return tim_kiem_nhi_phan2(key, m + 1, r);
//    return -1;
//}
