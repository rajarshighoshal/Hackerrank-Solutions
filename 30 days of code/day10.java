import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int oneCount = 0;
        while(n != 0){
            n = (n &(n << 1));
            oneCount++;
        }
        
        System.out.println(oneCount);
        }
    }
