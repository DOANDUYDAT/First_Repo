#include <bits/stdc++.h>
#include "changepage.h"

using namespace std;

//queue<int> fifout, tempo;

void fifo(iterable_queue<int> &int_queue, PCB pcb[],int k)
{
   int h;
//   iterator:: it;

    h = int_queue.front();
    pcb[h].mark = 0;
    int_queue.pop();
    int_queue.push(k);
    pcb[k].mark = 1;
//    cout << "PAGE" << endl;
//    tempo = fifout;

//    while(!fifout.empty()){
//        int q = fifout.front();
//        fifout.pop();
//        cout << q << "\n";
//    }

}

