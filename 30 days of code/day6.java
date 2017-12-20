import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for(int i = 0; i < T; i++){
            String s = scanner.next();
            
            String evenIndexed = "";
            String oddIndexed = "";
            
            for(int j = 0; j < s.length(); j++){
                if(j%2 == 0){
                    evenIndexed += s.charAt(j);
                }
                else{
                    oddIndexed += s.charAt(j);
                }
            }
            
            System.out.println(evenIndexed + " " + oddIndexed);
        }
        
    }
}