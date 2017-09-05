/*
    Input Format - Input begins with an integer n representing the number of test cases following. Each of the n lines after will contain a single integer x followed by x integers. Your output will be n integers, one on each line, indicating the sum of the x integers for that test case.

    Constraints - 0 < n < 50 0 < x < 10
    
    Output Format - n integers representing sums.
    
    Sample Input 0 - 
                2
                3 5 2 3
                1 1
    Sample Output 0 -
                10
                1

    Sample Input 1 - 
                1
                1 2
    Sample Output 1
                2
*/

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
