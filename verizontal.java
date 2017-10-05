import java.io.*;
import java.util.*;

public class verizontal {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashSet<Integer> xset = new HashSet<Integer>();
        HashSet<Integer> yset = new HashSet<Integer>();
        //int checkx = 0;
        //int
        
        for(int a0 = 0; a0 < n; a0++){
           xset.add(in.nextInt());
           yset.add(in.nextInt());
           
        }
        if(xset.size() == 1 || yset.size() == 1){
            System.out.println("YES\n");
        } else {
            System.out.println("NO\n");
        }
        
    }
    
}
