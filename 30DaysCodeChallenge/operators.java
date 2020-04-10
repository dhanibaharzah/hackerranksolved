import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble();
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();

        //kalkulasi
        double tip = mealCost * (double)tipPercent / 100;
        double tax = mealCost * (double)taxPercent / 100;
        double total = mealCost + tip + tax;

        //pembulatan hasil
        int totalCost = (int) Math.round(total);

        System.out.println(totalCost);
    }
}
