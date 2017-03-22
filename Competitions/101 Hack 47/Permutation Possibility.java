import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Permutation Possibility{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        HashSet<Integer> h = new HashSet<Integer>();
        int x;
        for(int i =0; i< m; i++){
            if(h.contains(x = in.nextInt())){
                System.out.println("NO");
                System.exit(0);
            }else{
               h.add(x); 
            }               
        }
        System.out.println("YES");        
    }
}
