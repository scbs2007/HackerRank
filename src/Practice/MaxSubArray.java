package Practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxSubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        long max = 0, supermax =0;
        int i;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(i=0;i<n;++i)
            arr[i] = sc.nextInt();
        for(i=0;i<n;++i)
            {
            if(arr[i]==0)
            {
                max = 0;
                continue;
            }
            max = Math.max(arr[i]+max, 0);
            supermax = Math.max(max, supermax);
        }
        System.out.println(supermax);
    }
}