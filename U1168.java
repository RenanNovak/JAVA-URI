import java.util.Scanner; 

public class URILED { 

    public static void main(String[] args) { 

        Scanner scan = new Scanner(System.in); 

        int N = scan.nextInt(); 

         

        for (int i=0;i<N;i++) { 

            int contaled = 0; 

            String V = scan.next(); 

            int VL = V.length(); 

            int[] leds = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6}; 

            for (int j=0;j<VL;j++) { 

                contaled += leds[Integer.parseInt(""+V.charAt(j))]; 

            } 

            System.out.printf("%d leds\n", contaled); 

        } 

    } 

} 