import java.util.Scanner;

class Method05{
	static int min(int a, int b, int c){
		int min = a;
		if(min > b) min = b;
		if(min > c) min = c;
		return min;
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("aの値を入れてください");
		int a = stdIn.nextInt();
		System.out.print("bの値を入れてください");
		int b = stdIn.nextInt();
		System.out.print("cの値を入れてください");
		int c = stdIn.nextInt();
		System.out.println();
		System.out.println("最小値:" + min(a,b,c));
	}
}
