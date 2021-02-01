import java.util.*;

public class Stone{
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        System.out.println((kbd.nextInt() % 2 == 1)?"Alice":"Bob");
    }
}