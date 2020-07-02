package CodeFiesta;

import java.util.*;

public class TDS {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int p=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        Arrays.sort(arr);
        double ans=0;
        int sumAns=0;
        double max1=1000000;
        if(sum<p){
            System.out.println("You cannot avail offer");
        }
        else{
            for(int i=0;i<n;i++){
                sumAns=sumAns+arr[i];
                if(sumAns>=p){
                    ans=(double)sumAns*70/100;
                    // System.out.printf("%.2f",ans);
                    if(ans<=max1){
                        max1=(float)ans; 
                    }
                }
            }
            
            System.out.printf("%.2f",max1);
        }
        sc.close();
    }
}