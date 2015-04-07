import java.util.Scanner;

class Method12{
	static int sumOf(int[] a){
		int sum = 0;
		for(int i = 0; i < a.length; i++) sum += a[i];
		return sum;
	}
	static int minOf(int[] a){
		int min = a[0];
		for(int i = 0; i < a.length; i++) if(a[i] < min) min = a[i];
		return min; 
	}
	static int linearSearchR(int[] a,int key){
		int tmp = -1;
		for(int i = 0; i < a.length; i++) if(a[i] == key) tmp = i;
		return tmp;
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("要素数：");
		int num = stdIn.nextInt();
		int[] x = new int[num];

		for(int i = 0; i < num; i++){
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		System.out.print("探す値：");
		int ky = stdIn.nextInt();

		int idx = linearSearchR(x,ky);

		if(idx == -1)
			System.out.println("その値の要素は存在しません。");
		else
			System.out.println("その値はx[" + idx + "]にあります。");
		System.out.println("要素の値の合計値：" + sumOf(x));
		System.out.println("要素の値の最小値：" + minOf(x));
	}
}
