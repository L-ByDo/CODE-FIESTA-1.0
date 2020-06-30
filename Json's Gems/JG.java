package CodeFiesta;
import java.util.*;

public class JG {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int p=0;					
        for(int i=0;i<n-1;i++){
            if(arr[i+1]==arr[i]+1)
                continue;
            else{
                p=1;
                System.out.println(arr[i]+1);
                break;
            }
        }
        sc.close();
        if(p==0)
            System.out.println(arr[0]-1);
    }
}