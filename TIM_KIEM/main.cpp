#include <bits/stdc++.h>
using namespace std;

#define n 10000

int key;
int keys[10005];
fstream fileInPut;

void InPut();
int nhap_key();
int tim_kiem_tuan_tu(int key);
int tim_kiem_nhi_phan1(int key); ///cai dat voi vong lap
int tim_kiem_nhi_phan2(int key, int l, int r); ///cai dat voi de quy

int main()
{
    clockid_t start;
    string f1, f2;

    f1 = "input.txt";

    fileInPut.open(&f1[0], ios::in);
    if(fileInPut.fail()){
        cout << " khong mo duoc " << endl;
        exit(1);
    }

    InPut();
    nhap_key();

    start = clock();
    cout << " vi tri " << tim_kiem_tuan_tu(key);
    cout << " thoi gian chay ";
    printf("%.6f\n", (float)(clock() - start)/CLOCKS_PER_SEC);

    start = clock();
    cout << " vi tri " << tim_kiem_nhi_phan1(key);
    cout << " thoi gian chay ";
    printf("%.6f\n", (float)(clock() - start)/CLOCKS_PER_SEC);

    start = clock();
    cout << " vi tri " << tim_kiem_nhi_phan2(key, 0, n);
    cout << " thoi gian chay ";
    printf("%.6f\n", (float)(clock() - start)/CLOCKS_PER_SEC);

    fileInPut.close();
    return 0;
}

void InPut()
{
    for (int i = 0; i < n; i++){
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
        if (keys[i] == key) return i + 1;
    }
    return -1;
}

int tim_kiem_nhi_phan1(int key)
{
    int l = 0;
    int r = n - 1;
    while (l <= r ) {
        int m = (l + r) / 2;
        if (keys[m] == key)
            return m + 1;
        else if (keys[m] > key){
            r = m - 1;
        }
        else l = m + 1;
    }
    return -1;
}

int tim_kiem_nhi_phan2(int key, int l, int r)
{
    int m = (l + r) / 2;
    if (keys[m] == key)
        return m + 1;
    if (l > r)
        return -1;
    else if (keys[m] > key)
        return tim_kiem_nhi_phan2(key, l, m - 1);
    else
        return tim_kiem_nhi_phan2(key, m + 1, r);
}
