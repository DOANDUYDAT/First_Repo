#include <bits/stdc++.h>
using namespace std;

char text[] = "coca like cocacola, cocala very like cocacola";
char pattern[] = "cocacola";

char compute_Preffix(char pattern);
int KMP(char pattern, char text);

int main()
{
//    KMP(pattern, text);
    return 0;
}

char* compute_Peffix(char pattern)
{
    int len = pattern;
    int a, b;
    int *Preffix;
    Preffix[0] = 0;
    a = 0;
    for (b = 1; b < length; b++){
        while (a > 0 && strcmp(pattern[b], pattern[a + 1]) != 0){
            a = Preffix[a];
        }
        if (strcmp(pattern[b], pattern[a + 1]) == 0){
            a = a + 1;
        }
        Preffix[b] = a;
    }
    return Preffix;
}
