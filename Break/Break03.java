import java.util.Scanner;

class Break03{
	public static void main(String[] args){
	 Scanner stdIn = new Scanner(System.in);
	int a = 0;
	//1〜10までの数値を入力するとループ文終了
	//それ以外の場合はもう一度入力させる
	  while(true) {
	  System.out.println("1〜10までの数値を入力してください");
	  a = stdIn.nextInt();
	  if(a >=1 && a <= 10) break;
	  }  
	  System.out.println(a);
	}
}
