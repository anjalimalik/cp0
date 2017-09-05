import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        
        for(int i = 0; i < n; i++){
            int a = in.nextInt();
            int[] arr = new int[a];
            int sum = 0;
            for (int j = 0; j < a; j++){
                arr[j] = in.nextInt();
                sum += arr[j];
            }
            System.out.println(sum);
        }
      
    }
}
