import java.util.Scanner; 

import java.io.IOException ; 

public class Main {  

    public static void main(String[] args) throws IOException { 

        Scanner s = new Scanner(System.in); 

        float A, B; 

  

        A = Integer.parseInt(s.next()); 

        B = Integer.parseInt(s.next()); 

        float sumA=1, sumB=1, X; 

        while(A > 0){ 

            sumA=sumA*A; 

            A=A-1; 

        }         

        while(B > 0){ 

            sumB=sumB*B; 

            B=B-1; 

        } 

        X = sumA+sumB; 

        System.out.printf("X = %.0f\n", X); 

    } 

} 