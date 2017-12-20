import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int da = s.nextInt();
        int ma = s.nextInt();
        int ya = s.nextInt();
        s.nextLine();
        int de = s.nextInt();
        int me = s.nextInt();
        int ye = s.nextInt();
        
        if(ya > ye){
            System.out.println(10000);
        }
        else if(ya == ye && ma > me){
            System.out.println((ma - me) * 500);
        }
        else if(ya == ye && ma == me && da > de){
            System.out.println((da - de) * 15);
        }
        else{
            System.out.println(0);
        }
        
        s.close();
    }
}