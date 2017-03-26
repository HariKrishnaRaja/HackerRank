import java.io.*;
import java.util.*;

public class CutTheSticks{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[1001];
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++){
            count[sc.nextInt()]++; 
        }
        for(int i = 1; i< 1000; i++){
            if(n > 0){
                if(count[i]>0){
                    System.out.println(n);
                    n-=count[i];
                }
            }else{
                break;
            }
        } 
    }
}