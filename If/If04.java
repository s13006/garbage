import java.util.Scanner;

class If04 {
	public static void main(String[] args){
	  Scanner stdIn = new Scanner(System.in);
//キーボードから入力
	  System.out.println("1〜12までの数値を入力してください");
int i = stdIn.nextInt();

if(i >= 3 && i <= 5){
	System.out.println("春");
}else if(i >= 6 && i <= 8){
	System.out.println("夏");
}else if(i >= 9 && i <= 11){
	System.out.println("秋");
}else if(i== 1 || i ==2 || i == 12){
	System.out.println("冬");
}else{
	System.out.println("ﾆﾎﾝｺﾞﾖﾒﾏｽ?");
}
  }
}
