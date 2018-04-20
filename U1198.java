import java.util.Scanner; 

import java.io.IOException ; 

public class Main {  

    public static void main(String[] args) throws IOException { 

         Scanner s = new Scanner(System.in); 

        float A, B, X=0; 

        A = Integer.parseInt(s.next()); 

        B = Integer.parseInt(s.next()); 

        X = A-B; 

        if (X<0){ 

          X=X*-1; 

        } 

        System.out.printf("X = %.0f\n", X); 

    }  

} 