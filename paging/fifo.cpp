#include <bits/stdc++.h>
#include "changepage.h"

using namespace std;

void fifo(int temp[], PCB pcb[], int PHYSICFRAME, int k, int cnt)
{
    int i, h, min;
    min = pcb[temp[0]].loadTime;
    /// tim page duoc nap vao dau tien trong bang quan ly trang temp[]
    for (i = 1; i < PHYSICFRAME; ++i){
        if (min > pcb[temp[i]].loadTime){
            min = pcb[temp[i]].loadTime;
            h = i;
        }
    }
    pcb[temp[h]].mark = 0;
    temp[h] = k;
    pcb[k].mark = 1;
    pcb[k].loadTime = cnt;
}

