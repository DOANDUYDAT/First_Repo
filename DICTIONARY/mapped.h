#include <map>
#include <string>
using namespace std;

map<string, string> keys;

void them_tu(string &key, string &value);
void xoa_tu(string &key);
string tim_tu(string &key);

void them_tu(string &key, string &value)
{
    keys[key]= value;
}

void xoa_tu(string &key)
{
    keys.erase(key);
}
string tim_tu(string &key)
{
    return keys[key];
}



