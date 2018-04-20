import java.util.Scanner; 

public class URICaraOuCoroa { 

    public static void main(String[] args) { 

        Scanner scan = new Scanner(System.in); 

        int R, N=0; 

        boolean continua = true; 

        while(continua) { 

            int X=0, Y=0; 

            N=scan.nextInt(); 

            if (N==0) { 

                break; 

            } 

            for (int i=0;i<N;i++) { 

                R = scan.nextInt(); 

                if (R==0) { 

                    X++; 

                }else { 

                    Y++; 

                } 

            } 

            System.out.printf("Mary won %d times and John won %d times\n", X, Y); 

        } 

        scan.close(); 

    }  

} 