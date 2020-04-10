/*
    Given an integer, , perform the following conditional actions:

    If n is odd, print Weird
    If n is even and in the inclusive range of 2 to 5, print Not Weird
    If n is even and in the inclusive range of 6 to 20, print Weird
    If n is even and greater than 20, print Not Weird
    Complete the stub code provided in your editor to print whether or not  is weird.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution { 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        String ans = " ";

        //kondisi 1
         if ( N % 2 == 1){
             ans = "Weird";
         }
         //kondisi 2, 3 dan 4
         if (N % 2 == 0 && ((N >= 2 && N <= 5) || N > 20)){
             ans = "Not Weird";
         }else if(N % 2 == 0 && N >= 6 && N <= 20){
             ans = "Weird";
         }

         System.out.println(ans);
    }
}
