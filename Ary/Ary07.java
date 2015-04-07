import java.util.Scanner;
import java.util.Random;

class Ary07{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for(int i = 0; i < n; i++)
			a[i] = 1 + rand.nextInt(10);

		for(int i = 10; i >= 0; i--){
			for(int z = 0; z < n; z++){
				if(a[z] >= i) System.out.print("* ");
				else System.out.print("  ");
			} 
			System.out.println();
		}
		for(int i = 0; i < n; i++)System.out.print("--");
		System.out.println();
		for(int i = 0; i < n; i++)System.out.print((i%10) + " ");
		System.out.println();
	}
}
