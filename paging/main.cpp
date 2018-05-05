#include <bits/stdc++.h>
#include "changepage.h"

using namespace std;

#define LOGICPAGE 5
#define PHYSICFRAME 3
#define MAXN 20
//typedef struct pageControlBlock{
//    int mark;
//    int location;
//    int loadTime;
//}PCB;

//int LOGICPAGE = 5, PHYSICFRAME = 3, MAXN =15;
int implement[MAXN] = {}; /// chuoi thuc hien hien
int temp[PHYSICFRAME] = {}; /// bang luu tru cac page dang duoc nap
PCB pcb[LOGICPAGE] = {}; /// bang quan ly cac trang

int main()
{
//    int logicpage, physicframe;
//    cout << "number of logical pages: ";
//    cin >> logicpage;
//    cout << "number of allocated physical frames: ";
//    cin >> physicframe;
    int i, j, k, cnt;

    /** random a implement serie **/
//    for (i = 0; i < MAXN; ++i){
//        implement[i] = rand() % LOGICPAGE;
//    }
    freopen("input.txt", "r", stdin);
    for(i = 0; i< 20; i++) {
        cin >> implement[i];
    }
    for (i = 0; i< MAXN; ++i) {
        cout << implement[i] << " ";
    }
    /** first, all page are not loaded **/
    for (i = 0; i < LOGICPAGE; ++i) {
        pcb[i].mark = 0;
    }
    /** allocate memory for the first n pages in the implement(with n = physicframe)**/
    cnt = 0;
    for (i = 0; i < PHYSICFRAME; ++i) {
        k = implement[i];
        cnt++;
        temp[i] = k;
        pcb[k].mark = 1;
        pcb[k].loadTime = cnt;

//        cout << "\t";
    }
    cout << "\nPAGE\n";
    for (j = 0; j < PHYSICFRAME; ++j) {
        cout << temp[j] << "\n";
    }
//    cout << "\n\n\n";
    /** allocate memory for the other pages in the implement **/
//    cout << "PAGE" << endl;
    for (i = PHYSICFRAME; i < MAXN; ++i) {

        k = implement[i];
        if(pcb[k].mark == 0) {
            cnt++;
            fifo(temp, pcb, PHYSICFRAME, k, cnt);
        } else if (pcb[k].mark == 1) {
            cnt++;
            pcb[k].loadTime = cnt; /** neu co dong nay thi fifo chay giong lru**/
        }
        cout << "PAGE" << endl;
        for (j = 0; j < PHYSICFRAME; ++j) {
            cout << temp[j] << "\n";
        }
//        cout << "\t";
    }
    return 0;
}
