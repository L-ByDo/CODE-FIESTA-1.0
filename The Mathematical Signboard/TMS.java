package CodeFiesta;

import java.util.*;

public class TMS {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner sc = new Scanner(System.in);
            float a1[]=new float[2];
            int a2[]=new int[2];
            
            for(int i=0;i<2;i++)
                a1[i]=sc.nextFloat();
            for(int i=0;i<2;i++)
                a2[i]=sc.nextInt();
            
            float p=a1[0];
            float q=a1[1];
            int n=a2[0];
            int m=a2[1];
            int arr[][]=new int[n][m];
            
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int ro=Math.round(Math.abs(p-q));
            ro = ro % m;
            
            if( p == q ){
                for( int i=0; i<n; i++){
                    for( int j=0; j<m; j++){
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println("");
                }
            }

            if( p > q ){
                for( int i=0; i<n; i++){
                    for( int j=0; j<m; j++){
                       if( i == 0 || i == n-1 ){
                           System.out.print(arr[i][(j+ro)%m] + " ");
                        }else{
                            System.out.print(arr[i][j]+" ");
                        }
                    }
                    System.out.println("");
                }
            }

            if( p < q ){
                for( int i=0; i<n; i++){
                    for( int j=0; j<m; j++){
                        if( i == 0 || i == n-1 ){
                            System.out.print(arr[i][(m-ro+j)%m]+" ") ;
                        }else{
                            System.out.print(arr[i][j]+" ") ;
                        }
                    }
                    System.out.println("");
                }
            }
            sc.close();
    
    }
}