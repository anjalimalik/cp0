/*
A palindrome is a word that reads the same backward as forward. For e.g. "madam" or "noon". For a given string, you need to find the number of substrings that are palindromes.

Input Format

The given input will have one line containing the input string.

Constraints

Length of the string is less than 100.

Output Format

Output the number of distinct palindromic substrings of the input string.

Sample Input 0

abaaa
Sample Output 0

5
Explanation 0

Below are 5 palindrome sub-strings: a, aa, aaa, aba, b

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int length = str.length();
        int count = 0;
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
           for (int j = i+1; j <= str.length(); j++) {
               if (!list.contains(str.substring(i,j))) {
                   list.add(str.substring(i,j));
               }
           }
        }
        for (String s: list) {
            if (checkPalindrome(s)) count++;
        }
        
        System.out.println(count);
            
        
        
    }
    
    public static boolean checkPalindrome(String str){
       return str.equals(new StringBuilder(str).reverse().toString());
    }
    

}
