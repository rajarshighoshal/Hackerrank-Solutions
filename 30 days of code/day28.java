import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        s.nextLine();
        // creating hashmap for database
        Map<String, String> dict = new HashMap<String, String>();
        for(int i = 0; i < n; i++){
            String value = s.next();
            String key = s.nextLine();
            String[] valArray = key.split("@");
            if(valArray[1].equals("gmail.com")){
                dict.put(key, value);
            }
        }
        s.close();
        // getting only value list 
        ArrayList<String> valueList = new ArrayList<String>();
        for(Map.Entry<String,String> map : dict.entrySet()){
            valueList.add(map.getValue());
        }
        // sorting valuelist
        Collections.sort(valueList);
        
        for(int i = 0; i < valueList.size(); i++){
            System.out.println(valueList.get(i));
        }
    }
}