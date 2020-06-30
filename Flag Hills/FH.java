package CodeFiesta;


import java.util.*;

public class FH {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxEven=0;
        int maxOdd=0;
        
        for(int i=1;i<n-1;i++){
            if(arr[i]%2==0){
                if(arr[i]>arr[i-1]  && arr[i]>arr[i+1])
                    maxEven++;  
            }
            else{
                if(arr[i]>arr[i-1]  && arr[i]>arr[i+1])
                    maxOdd++; 
            }
        }
        sc.close();
        System.out.println("even "+maxEven);
        System.out.println("odd "+maxOdd);
    }
}