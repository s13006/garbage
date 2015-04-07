import java.util.Scanner;

class SquareRectanngle{
	//文字cをn個連続で表示
	static void putChars(char c,int n){
		while(n-- > 0)
			System.out.print(c);
	}

	//文字'+'を並べて一辺の長さnの正方形を表示
	static void putSquare(int n){
		for(int i = 1;i <= n; i++){
			putChars('+', n);
			System.out.println();
		}
	}
	//文字'*'を並べて高さhで幅wの長方形を表示
	static void putRectangle(int h,int w){
		for(int i = 1; i <= h; i++){
			putChars('*',w);
			System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("正方形を表示します。");
		System.out.print("一辺は："); int n = stdIn.nextInt();
		putSquare(n);

		System.out.println("長方形を表します。");
		System.out.print("高さは："); int h = stdIn.nextInt();
		System.out.print("横幅は："); int w = stdIn.nextInt();
		putRectangle(h,w);
	}
}
