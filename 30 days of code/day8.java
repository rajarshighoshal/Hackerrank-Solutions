//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        // declaring hashmap function
        Map<String, Integer> PhoneBook = new HashMap<String, Integer>();
        
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            // getting input
            PhoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // checking if key is present
            if(PhoneBook.containsKey(s))
                System.out.println(s+"="+PhoneBook.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
