import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

        public static int[] arrayLeftRotation(int[] a, int n, int k) {

            for (int rotate = 0; rotate < k; rotate++)
            {

            int firstValue = a[0];
            for(int firstRotate = 0; firstRotate < (n-1); firstRotate++)
            {
                a[firstRotate] = a[firstRotate+1];         
            }
            a[n-1] = firstValue;

            } 
    return a;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
