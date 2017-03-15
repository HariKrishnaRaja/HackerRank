import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindTheMinimumNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(n);
    }
    public static  void print(int n){
        if(n>0){
            printMin(n);
            print(n-1);
            printBrasers(n);
        }
    }
    public static void printMin(int n){
        if(n>1){
            System.out.print("min(int, ");
        }
        if(n ==1){
            System.out.print("int");
        }
    }
    public static void printBrasers(int n){
        if(n>1){
            System.out.print(")");
        }
    }
    
}
