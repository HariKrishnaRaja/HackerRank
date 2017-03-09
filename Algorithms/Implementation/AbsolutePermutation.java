import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AbsolutePermutation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int []n = new int [t];
        int []k = new int [t];
        for(int i = 0; i < t; i++){
            //System.out.println("Reading "+i); 
            n[i] = in.nextInt();
            k[i] = in.nextInt();
            //print(n,k);
        }
        for(int i = 0; i < t; i++){
           print(n[i],k[i]);
        }
    }
    public static void print(int n, int k){
        //System.out.println(n+" "+k);
        int []a = new int[n+1];
        for(int i = 0; i < n+1; i++)
            a[i] =i;
        if(k!=0){
            if((n%2==0) && (n%(2*k)) == 0){
                for(int i =1; i<n+1; i=i+(2*k)){
                    for(int j = 0; j < k; j++){
                        swap(a,i+j,i+j+k);
                    }
                }
                for (int i =1; i<n+1; i++){
                    System.out.print(a[i]+" ");
                }
                System.out.println();
            }
            else{
                System.out.println("-1");
            }
        }
        else{
            for (int i =1; i<n+1; i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
    
    public static void swap(int []a, int i, int j){
        int t = a[i];
        a[i] = a [j];
        a[j] = t;
    }
}
