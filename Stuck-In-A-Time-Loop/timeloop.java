import java.util.Scanner;
class timeloop{
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        int n=kbd.nextInt();
        for(int i=1;i <= n;i++)
            System.out.println(i+" Abracadabra");
    }
}