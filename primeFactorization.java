import java.io.*;
import java.util.*;
import java.lang.*;

public class primeFactorization {
    
    public static void findPrimeFactorization(int n){
        int i = 0;
        while(n%2 == 0){
            i++;
            n = n/2;
        }
        if(i != 0){
            System.out.println("2 " + i);
        }
        
        
        int count = 0;
        for(i = 3; i <= Math.sqrt(n); i+=2){
            while(n%i == 0){
               count++;
                n = n/i;
            }
            if(count != 0){
                System.out.println(i + " " + count);
                count = 0;   
            }

        }
        
        if(n > 2){
            System.out.println(n + " " + "1");
        }
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        findPrimeFactorization(n);
    }
}
