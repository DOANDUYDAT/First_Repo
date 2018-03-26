#include <bits/stdc++.h>
using namespace std;

char text[] = "coca like cocacola, cocala very like cocacola";
char pattern[] = "cocacola";
int *pre;

int* compute_Prefix(char pattern[]);
int KMP(char pattern[], char text[]);

int main()
{
    KMP(pattern, text);
    return 0;
}

int* compute_Prefix(char pattern[])
{
    int len = strlen(pattern);
    int a, b;
    pre[0] = 0;
    a = 0;
    for (b = 1; b < len; b++){
        while ((a > 0) && (pattern[b] != pattern[a + 1])){
            a = pre[a];
        }
        if (pattern[b] == pattern[a + 1]){
            a = a + 1;
        }
        pre[b] = a;
    }
    return pre;
}

int KMP(char pattern[], char text[])
{
    int i, j, k;
    int len = strlen(pattern);
    int n = strlen(text);
    i = j = k = 0;
    while ((n - k) >= len){
        while ((j <= len) && (pattern[j] == text[i])){
            i++;
            j++;
        }
        if (j > len) return k;
        if (pattern[j - 1] > 0){
            k = i - pre[j - 1];
        }
        else{
            if (i == k){
                i++;
            }
            k = i;
        }
        if (j > 1){
            j = pre[j - 1] + 1;
        }
    }
}
