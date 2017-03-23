import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] bird = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            bird[types_i] = in.nextInt();
        }
        HashMap<Integer,Integer> type = new HashMap<Integer,Integer>();
        for(int i = 0; i < n; i++){
            if(!type.containsKey(bird[i]))
                type.put(bird[i],1);
            else
                type.put(bird[i],type.get(bird[i])+1);
        }
        int max = 0;
        int maxType =-1;
        for(Integer i: type.keySet()){
            //System.out.println(type.get(i));
            if(type.get(i)>max){
                maxType = i;
                max = type.get(i);
            }
        }
        System.out.println(maxType);
    }
}
