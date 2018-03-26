#include <bits/stdc++.h>
using namespace std;

#define len(a) sizeof(a)/sizeof(a[0])
char text[] = "coca like cocacola, cocala very like cocacola";
char pattern[] = "cocacola";
int *pref;

int* compute_Prefix(char pattern[]);
int KMP(char pattern[], char text[]);

int main()
{
    cout << len(pattern);
    pref = compute_Prefix(pattern);

    cout << KMP(pattern, text) << endl;
    return 0;
}

int* compute_Prefix(char pattern[])
{
    int m = len(pattern);
    int prefix[m];
    prefix[0] = -1;
    int i = -1;
    for (int j = 1; j < m; j++){
        while ((i > -1) && (pattern[j] != pattern[i + 1])){
            i = prefix[i];
        }
        if (pattern[j] == pattern[i + 1]){
            i++;
        }
        prefix[j] = i;
    }
    return prefix;
}

int KMP(char pattern[], char text[])
{
    int m = len(pattern);
    int n = len(text);
    int i, j, k;
    i = j = k = 0;
    while (n >= m){
        while ((j <= m) && (pattern[j] == text[i])){
            i++;
            j++;
        }
        if (j > m) return k;
        if (pref[j - 1] > -1){
            k = i - pref[j - 1];
        }
        else{
            if (i == k){
                i = i + 1;
            }
            k = i;
        }
        if (j > 0){
            j = pref[j - 1] + 1;
        }
    }
}
