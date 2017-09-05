/*
Input Format - The input contains multiple test cases. The number of test cases T is in the first line of the input file.
For each test case, there are 10 lines, describing the web page and the relevance. Each line contains a character string without any blank characters denoting the URL of this web page and an integer v denoting the relevance of this web page. The length of the URL is between 1 and 100 inclusively.

Constraints - 1 <= v <= 100

Output Format - For each test case, output several lines which are the URLs of the web pages which are possible to be chosen. The order of the URLs is the same as the input. Please look at the sample output for further information of output format.

Sample Input -
        2
        www.youtube.com 1
        www.google.com 2
        www.google.com.hk 3
        www.alibaba.com 10
        www.taobao.com 5
        www.bad.com 10
        www.good.com 7
        www.fudan.edu.cn 8
        www.university.edu.cn 9
        acm.university.edu.cn 10
        www.youtube.com 1
        www.google.com 2
        www.google.com.hk 3
        www.alibaba.com 11
        www.taobao.com 5
        www.bad.com 10
        www.good.com 7
        www.fudan.edu.cn 8
        acm.university.edu.cn 9
        acm.university.edu.cn 10

Sample Output -
        Case #1:
        www.alibaba.com
        www.bad.com
        acm.university.edu.cn
        Case #2:
        www.alibaba.com
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        String[] strarr = new String[10];
        int[] arr = new int[10];
        try{
        for(int j = 1; j <= n; j++){
            
            for(int i = 0; i < 10; i++){
                String url = in.next();
                int a = in.nextInt();
                if(max <= a){
                    max = a;
                }
                strarr[i] = url;
                arr[i] = a;
            }
            List<Integer> foundat = new ArrayList<Integer>();
            foundat = find(max, arr);
            if(!foundat.isEmpty()){
                System.out.println("Case #" + j +":");
                int len = foundat.size();
                
                for(int k = 0; k < len; k++){
                    System.out.println(strarr[foundat.get(k)]);
                }
            }   
        }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
      
   public static List<Integer> find(int num, int[ ] arr){
       List<Integer> foundat = new ArrayList<Integer>();
       for (int i = 0; i < arr.length; i++){
          if (arr[i] == num) 
                foundat.add(i);
       }
       return foundat;        
   }
        
}
