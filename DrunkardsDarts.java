import java.io.*;
import java.util.*;

class Circle {

    public int x;
    public int y;
    public int r;

}

public class DrunkardsDarts {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        ArrayList<Circle> circles = new ArrayList<Circle>();
        for(int i = 0; i < n; i++){
            Circle temp = new Circle();
            temp.r = in.nextInt();
            temp.x = in.nextInt();
            temp.y = in.nextInt();
            circles.add(temp);
        }
        
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (checkInside(a, b, circles.get(j))) { count++; }
            }
            System.out.println(count);
        }
    }
    
    static boolean checkInside(int a, int b, Circle c) {
        return ( Math.pow((a - c.x) , 2) + Math.pow((b - c.y) , 2) < Math.pow(c.r , 2) ) ;
    }
}
