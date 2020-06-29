#include <bits/stdc++.h>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    float p, q;
    cin >> p >> q;
    int n, m;
    cin >> n >> m;
    int matrix[n][m];
    for( int i=0; i<n; i++){
        for( int j=0; j<m; j++){
            cin >> matrix[i][j];
        }
    }
    int rotation = round(abs( p - q ));
    rotation = rotation % m;
    if( p == q ){
        for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){
                cout << matrix[i][j] << " ";
            }
            cout << "\n";
        }
    }
    
    if( p > q ){
        for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){
               if( i == 0 || i == n-1 ){
                    cout << matrix[i][(j+rotation)%m] << " ";
                }else{
                    cout << matrix[i][j] << " ";
                }
            }
            cout << "\n";
        }
    }
    
    if( p < q ){
        for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){
                if( i == 0 || i == n-1 ){
                    cout << matrix[i][(m-rotation+j)%m] << " ";
                }else{
                    cout << matrix[i][j] << " ";
                }
            }
            cout << "\n";
        }
    }
    
    return 0;
}


