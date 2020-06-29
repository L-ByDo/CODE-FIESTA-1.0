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
    int even = 0, odd = 0;
    for( int i=1; i<n-1; i++){
        if( arr[i] > arr[i-1] && arr[i] > arr[i+1]){
            if( arr[i] % 2 == 0 ){
                even += 1;
            }else{
                odd += 1;
            }
        }
    }
    cout << "even " << even << "\n";
    cout << "odd " << odd;
    return 0;
}

