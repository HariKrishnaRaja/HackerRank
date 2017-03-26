import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ClimbingTheLeaderboard{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        // your code goes here
        int[] rank = new int[n];
        rank[0] = 1;
        for(int i = 1; i < n; i++){
            if(scores[i-1] == scores[i])
                rank[i] = rank[i-1];
            else
                rank[i] = rank[i-1]+1;
        }
        //int aliceRank = rank[n-1]+1;
        //System.out.println(Arrays.toString(rank));
        
        int npos = n-1;
        
        for(int aliceScore: alice){
            //System.out.println(aliceScore+" "+ scores[npos]);
            while(npos >= 0 && aliceScore>=scores[npos]){    
                npos--;
            }
            //System.out.println(npos);
            if(npos >= 0 && npos< n-1)
                System.out.println(rank[npos+1]);
            else if(npos >= n-1)
                System.out.println(rank[npos]+1);
            else{
                System.out.println("1");
                //System.out.println(rank[npos]);
                }
        }
    }
}
