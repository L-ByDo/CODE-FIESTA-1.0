#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n;
    cin >> n;
    int arr[n];
    for( int i=0; i<n; i++){
        cin >> arr[i];
    }
    sort(arr, arr+n);
    for( int i=1; i<n; i++){
        if( arr[i] != arr[i-1]+1 ){
            cout << arr[i] - 1;
            return 0;
        }
    }
    cout << arr[0]-1;
    return 0;
}

