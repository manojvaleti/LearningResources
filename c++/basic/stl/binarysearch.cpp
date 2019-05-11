#include<bits/stdc++.h>
using namespace std;

int main(){
    int n,i,z=10;
    cin>>n;
    int a[n];
    for(i = 0 ; i < n ; i++)
        cin >> a[i];
    sort(a,a+n);
    if(binary_search(a,a+n,z))
        cout<<"10 is present in the given array\n";
    else
        cout<<"10 is not found\n";}
