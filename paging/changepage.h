/************************************/
/** cac chien luoc doi trang **/

#include <bits/stdc++.h>

using namespace std;

//extern int LOGICPAGE, PHYSICFRAME, MAXN;
typedef struct pageControlBlock {
    int mark;
    int location;
    int loadTime;
} PCB;

/** first in first out **/
void fifo(int temp[], PCB pcb[], int PHYSICFRAME, int k, int cnt);
/** **/
void opt();
/** least recently used **/
void lru(int temp[], PCB pcb[], int PHYSICFRAME, int k, int cnt);
/** least frequently used **/
void lfu();
/** most frequently used **/
void mfu();
