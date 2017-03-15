import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CandyReplishingRobot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] c = new int[t];
        for(int c_i=0; c_i < t; c_i++){
            c[c_i] = in.nextInt();
        }
        int count =0;
        int cur = n;
        for(int c_i=0; c_i < t-1; c_i++){
            cur = cur - c[c_i];
            if(cur < 5){
                count+=n-cur;
                cur = n;
            }                
        }
        System.out.println(count);
        
        // your code goes here
    }
}