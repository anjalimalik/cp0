import java.io.*;
import java.util.*;

public class fcc {
    public static boolean IsTwoCylinders(int l, int c, int r1, int r2){
        if(c < (r1*2)){ return false; }
        if(l >= (r1+r2)*2){ return true; }
       
        int dia = r1+r2;
        int diff = c - dia;
        
        if(l >=(Math.pow((Math.pow(dia, 2) - Math.pow(diff, 2)), 0.5) + dia)) { return true;}
        else { return false; }   
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
    
        while(in.hasNextLine()){
            int l = in.nextInt();
            int c = in.nextInt();
            int r1 = in.nextInt();
            int r2 = in.nextInt();
            
            if(l == 0 && c == 0 && r1 == 0 && r2 == 0){ return; }
            
            if (l < c){ int swap = l; l = c; c = swap;}
            if(r1 < r2) { int swap = r1; r1 = r2; r2 = swap;}
            if(IsTwoCylinders(l,c,r1,r2)){ System.out.println("S"); }
            else { System.out.println("N"); }
        }       
        
    }
}
