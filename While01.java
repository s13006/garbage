import java.util.Scanner;

class While01{
    public static void main(String[] args){
       Scanner stdIn = new Scanner(System.in);
//while文
       int i;
       do {
	i = stdIn.nextInt();
       //}while(i < 1 || i > 12);
	}while(!(i > 0 && i <13));
	System.out.println(i);
/*
//iの値が１〜１２までならwhile文を終了する
       int i = stdIn.nextInt();
       while(i < 1 || i > 12){
	i = stdIn.nextInt();
   }
	System.out.println(i);
*/
/*
//1〜10までの合計を求めて表示
       int i = 1;
       int sum = 0;
       while(i <= 10){
	sum += i ;	
	i++;
       }
	System.out.println(sum);
*/
    }
}
