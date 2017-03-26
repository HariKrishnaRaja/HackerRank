import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SequenceEquation{
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n+1];
        for(int i = 1; i <= n; i++){
            p[i] = sc.nextInt();
        }
        int[] x = new int[n+1];
        for(int i = 1; i <= n; i++){
            x[p[p[i]]] =  i;
        }
        for(int i=1; i <= n; i++){
            System.out.println(x[i]);
        }
    }
}
