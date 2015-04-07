import java.util.Scanner;
import java.util.Random;

class Method07{
	static void putChars(char c, int n){
		while(n-- > 0) System.out.print(c);
	}
	static void putStars(int j){
		putChars('*', j);
	}
	static int random(int a, int b){
		Random rand = new Random();
		if(a >= b) return a;
		return rand.nextInt(b-a) + a;

	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("左下直角の三角形を表示します。");
		System.out.print("段数は：");
		int j = stdIn.nextInt();

		for(int i = 1; i <= j; i++){
			putStars(i);
			System.out.println();
		}
		System.out.print("ランダムの数値の下限："); int a = stdIn.nextInt();
		System.out.print("ランダムの数値の上限："); int b = stdIn.nextInt();
		System.out.println();
		System.out.println(random(a,b));
	}
}
