import java.util.Scanner;
class tarifa{
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        int x = kbd.nextInt(),n = kbd.nextInt();
        int bl = x;
        for(int i=0;i<n;i++){
            bl += x - kbd.nextInt();
        }
        System.out.println(bl);
        
    }
}