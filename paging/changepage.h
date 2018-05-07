/************************************/
/** cac chien luoc doi trang **/

#include <bits/stdc++.h>
#include "dequeue.h"

using namespace std;

//extern int LOGICPAGE, PHYSICFRAME, MAXN;
typedef struct pageControlBlock {
    int mark;
    int location;
    int loadTime;
} PCB;

/** first in first out **/
void fifo(iterable_queue<int> &int_queue, PCB pcb[], int k);
/** **/
void opt();
/** least recently used **/
void lru(int temp[], PCB pcb[], int PHYSICFRAME, int k, int cnt);
/** least frequently used **/
void lfu();
/** most frequently used **/
void mfu();
