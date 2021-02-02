import java.util.Scanner;
class grassseed{
    public static void main(String args[]) { 
        Scanner kbd = new Scanner(System.in);
        double C = kbd.nextDouble();
        if(0 < C && C <= 100){
            int L = kbd.nextInt();
            if(0 < L && L <= 100){
                double a = 0;
                for(int i=0;i<L;i++)
                    a += kbd.nextDouble() * kbd.nextDouble();
                System.out.format("%.7f",a*C); 
            }
        }
    }
}