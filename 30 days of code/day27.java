public class Solution {

    public static void main(String[] args) {
        //System.out.println("Test Cases: " + 5);
        System.out.println(5);
        
        /* Test case with answer Yes */
        /* 200 students, 200 threshold, only 100 ontime, Class Cancelled */
        //System.out.println("Test Case 1, n=200, k=200, answer YES");
        System.out.println("200 200");
        /* Count out 200 data elements */
        //int ctr = 0;
        for (int i=-99; i<=100; i++) {
            System.out.print(i + " ");
            //ctr++;
        }
        System.out.println();
        //System.out.println("Elements = " + ctr);

        /* Test case with answer NO */
        /* 3 students, threshold 2, 2 ontime, class not cancelled */
        //System.out.println("Test Case 2, n=3, K=2, answer NO");
        System.out.println("3 2");
        System.out.println("-1000 0 1000");
        
        /* Test case with answer Yes */
        /* 4 students, threshold 3, 2 ontime, Class cancelled */
        //System.out.println("Test Case 3, n=4, K=3, answer YES");
        System.out.println("4 3");
        System.out.println("-1 0 1 1000");
        
        /* Test case with answer NO */
        /* 5 students, threshold 2, 3 ontime, class not cancelled */
        //System.out.println("Test Case 4, n=5, k=2, answer NO");
        System.out.println("5 2");
        System.out.println("-1000 0 -1 2 1000");
        
        /* Test case with answer YES */
        /* 6 students, threshold 3, 2 ontime, class cancelled */
        //System.out.println("Test Case 5, n=6, k=3, answer YES");
        System.out.println("6 3");
        System.out.println("1 2 3 4 -1 0");
        
    }
}