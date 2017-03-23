import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PickingNumbers{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int [] c = new int[100];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int i =0; i < 100; i++){
            c[i] = 0;
        }
        for(int i =0; i < n; i++){
            c[a[i]]++;
        }
        for(int i =0; i<99; i++){
            c[i] +=c[i+1]; 
        }
        Arrays.sort(c);
        System.out.println(c[99]);
    }
}
