import java.util.Scanner; 

import java.io.IOException ; 

public class Main { 

     public static void main(String[] args) throws IOException { 

        Scanner s = new Scanner(System.in); 

        int A, B, X; 

        A = Integer.parseInt(s.next()); 

        B = Integer.parseInt(s.next()); 

        X = A * B; 

        System.out.printf("PROD = %d\n", X); 

     } 

 } 