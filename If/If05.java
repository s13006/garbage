import java.util.Scanner;

class If05{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int a;
    int b;
    System.out.println("a = ");
    a = stdIn.nextInt();
    System.out.println("b = ");
    b = stdIn.nextInt();
    //a,bに数値を入れてその差を表示しなさい
    if(a > b){
	System.out.println(("差は") + (a - b));
    }else{
	System.out.println(("差は ") + (b - a));
   }
  }
}
