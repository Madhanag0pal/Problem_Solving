import java.util.Scanner;
class cetvrta{
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        int x[] = new int[3],y[] = new int[3];
        for(int i=0;i<3;i++){
            x[i] = kbd.nextInt();
            y[i] = kbd.nextInt();
        }
        int a = (x[0] == x[1])? x[2]: (x[1] == x[2])?x[0]:x[1], b = (y[0] == y[1])? y[2]: (y[1] == y[2])? y[0]:y[1];
        System.out.println(a + " " + b);
            
    }
}