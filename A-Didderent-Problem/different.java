import java.util.Scanner;
class different {  
  public static void main(String args[]) {
    Scanner kbd = new Scanner(System.in);
    boolean f = true;
    long  a,b;
    while(f){
        try{
            a = kbd.nextLong();
            b = kbd.nextLong();
            System.out.println(((a>b)?a-b:b-a)); 
        }
        catch(Exception e){
            f = false;
            continue;
        }
    }
  } 
}