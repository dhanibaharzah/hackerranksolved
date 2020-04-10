import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int inputInt = scan.nextInt();
        System.out.println(inputInt + i);

        double inputDouble = scan.nextDouble();
        System.out.println(inputDouble + d);

        scan.nextLine();
        String sa = scan.nextLine();
        System.out.println(s + sa);

        scan.close();
    }
}
