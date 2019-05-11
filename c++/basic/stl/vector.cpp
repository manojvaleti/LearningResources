#include<bits/stdc++.h>
using namespace std;

int main(){
    vector<int> g;
    vector<int>::iterator i;
    for(int i = 0 ; i < 5 ; i++)
    g.push_back(i);
    cout<<g.max_size()<<endl<<g.capacity()<<endl;
    for (i = g.begin() ; i != g.end() ; i++)
    cout << *i << endl;}
