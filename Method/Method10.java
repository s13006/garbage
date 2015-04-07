//最もセガ高い人の身長と最も太っているhとの体重を求める。
import java.util.Scanner;

class Method10{
	//--配列aの最大値を求めて返却--//
	static int maxOf(int[] a){
	   int max = a[0];
	   for(int i = 1; i < a.length; i++)
		if (a[i] > max)
		   max = a[i];
		return max;
	}
	public static void main(String[] args){
	   Scanner stdIn = new Scanner(System.in);

	   System.out.print("人数は：");
	   int ninzu = stdIn.nextInt();

	   int[] heigth = new int[ninzu];
	   int[] weigth = new int[ninzu];

	   System.out.println(ninzu + "人の身長と体重を入力せよ。");

	   for(int i = 0; i < ninzu; i++){
		System.out.print((i + 1) + "番目の身長：");
		heigth[i] = stdIn.nextInt();
		System.out.print((i + 1) + "番目の体重：");
		weigth[i] = stdIn.nextInt();
	   }
	   System.out.println();
	   System.out.println("最も背が高い人の身長：" + maxOf(heigth) + "cm");
	   System.out.println("最も太っている人の体重：" + maxOf(weigth) + "kg");
	}
}
