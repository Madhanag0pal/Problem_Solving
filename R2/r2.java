import java.util.Scanner;
class R2{
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        System.out.println(-(kbd.nextInt() - 2*kbd.nextInt()));
    }
}