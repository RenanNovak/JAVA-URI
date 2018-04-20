import java.io.IOException ; 

import java.util.Scanner;  

public class Main { 

    public static void main(String[] args) throws IOException { 

        Scanner s = new Scanner(System.in); 

        double a = Double.parseDouble(s.next()); 

        double d = ((a*a)*3.14159); 

        System.out.printf("A=%.4f\n",d); 

     } 

 } 