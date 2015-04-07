import java.util.Scanner;

class Method09{
	static int readPlusInt(){
		Scanner stdIn = new Scanner(System.in);
		int i = 0;
		while(i <= 0){
			System.out.print("正の整数値：");
			i = stdIn.nextInt();
		}
		return i;
	}
	public static void main(String[] args){
		System.out.println(readPlusInt());
	}
}
