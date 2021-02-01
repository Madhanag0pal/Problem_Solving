import java.util.Scanner;
class harshadnumbers{
  public static void main(String args[]){
    Scanner kbd = new Scanner(System.in);
    int n = kbd.nextInt();
    boolean c;
    do{
        String num = String.valueOf(n);
        int sum = 0;
        for(int i=0;i<num.length();i++){
            sum += num.charAt(i) - 48;
        }
        c = n % sum != 0;
        n++;   
    }while(c);
    System.out.println(n-1); 
  } 
}