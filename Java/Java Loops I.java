import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0, i;
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for(i=1; i<=10 ; i++) {
            
            sum = N*i;
            System.out.println(N+" x "+i+" = "+sum);
           
        }

        scanner.close();
    }
}
