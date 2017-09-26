import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isBalanced(String s) {
        Stack<String> stack = new Stack<String>(); 
        
       for(int i = 0; i < s.length(); i++){
           if(s.charAt(i) == '{') {
               stack.push("{");
           } else if(s.charAt(i) == '(') {
               stack.push("(");
           } else if(s.charAt(i) == '[') {
               stack.push("[");
           } else if(s.charAt(i) == '}'){
               if(stack.isEmpty()){ return "NO"; }
               if(stack.pop() != "{"){ return "NO" ; }
           } else if(s.charAt(i) == ')'){
               if(stack.isEmpty()){ return "NO"; }
               if(stack.pop() != "("){ return "NO" ; }
           } else if(s.charAt(i) == ']'){
               if(stack.isEmpty()){ return "NO"; }
               if(stack.pop() != "["){ return "NO" ; }
           }
       }
        if(stack.isEmpty()){ return "YES"; } else { return "NO"; }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
