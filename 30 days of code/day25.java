import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int total = scanner.nextInt();
        int num = 0;
        boolean isPrime = true;
    
        for (int i = 0; i < total; i++){
            num = scanner.nextInt();
            
            if (num <= 1) {
                System.out.println("Not prime");
            } else {
               isPrime = true;
            
                for (int j = 2; j <= Math.sqrt(num); j++){
                    if (num%j == 0){
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not prime");
                } 
            }
        }
        scanner.close();
    }
}