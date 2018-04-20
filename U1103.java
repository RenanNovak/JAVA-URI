import java.util.Scanner; 

public class URIDespertador { 

    public static void main(String[] args) { 

        int H1, H2, M1, M2, a, b; 

        boolean continua = true; 

        Scanner scan = new Scanner(System.in); 

        while(continua) { 

            H1 = scan.nextInt(); 

            M1 = scan.nextInt(); 

            H2 = scan.nextInt(); 

            M2 = scan.nextInt(); 

            if (H1==0 && M1==0 && H2 == 0 && M2 == 0) { 

                continua = false; 

                break; 

            } 

            else if(H1<H2) { 

                if(M1<M2) { 

                    a = H1*60+M1; 

                    b = H2*60+M2; 

                    System.out.printf("%d\n", b-a); 

                } 

                else { 

                    a=(H1*60)+M1; 

                    b=(H2*60)+M2; 

                    System.out.printf("%d\n", b-a); 

                } 

            } 

            else if(H1>H2) { 

                a = (24*60)-(H1*60+M1); 

                b= H2*60+M2; 

                System.out.printf("%d\n", a+b); 

            } 

            else if(H1==H2) { 

                if (M1<M2) { 

                    a = M2-M1; 

                    System.out.printf("%d\n", a); 

                } 

                else { 

                    a = (24*60)-(H1*60+M1); 

                    b= H2*60+M2; 

                    System.out.printf("%d\n", a+b); 

                } 

            } 

        } 

        scan.close(); 

    }  

} 