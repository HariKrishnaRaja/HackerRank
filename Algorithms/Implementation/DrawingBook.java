import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DrawingBook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        // your code goes here        
        int front = (int)(p/2);
        int back ;
        if(n%2==0)
            back = (int)Math.ceil((n-p+1)/2);
        else
            back = (int)Math.ceil((n-p)/2);
        //System.out.println(front+" "+back);
        System.out.println(Math.min(front,back));
        
    }
}
