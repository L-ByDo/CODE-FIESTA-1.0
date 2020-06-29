#include <bits/stdc++.h>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int n;
    cin >> n;
    int arr[n];
    for( int i=0; i<n; i++){
        cin >> arr[i];
    }
    int offerMoney;
    cin >> offerMoney;
    sort(arr, arr+n);
    int totalAmount = 0;
    for( int i=0; i<n; i++){
        if( totalAmount < offerMoney ){
            totalAmount += arr[i];
        }else{
            break;
        }
    }
    if( totalAmount < offerMoney ){
        cout << "You cannot avail offer";
    }else{
        float payableAmout = totalAmount - (totalAmount * 30)/100.0;
        cout << fixed << setprecision(2) << payableAmout;
    }
    return 0;
}

