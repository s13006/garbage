import java.util.Scanner;

class Ary01{
	public static void main(String[] args){
	    Scanner stdIn = new Scanner(System.in);
	//数値を入力させそれを入れうtの長さとする
	//ここの配列の値も入力させて、それを表示する
	System.out.println("数値を入力してください");
	int i = stdIn.nextInt();
	int[] ary = new int[i];

	for(int j = 0; j < i; j++){
		System.out.println("値を入力して下さい");
		ary[j] = stdIn.nextInt();
		System.out.println("[" + j + "] = " + ary[j]);
	}
/*
	//var ary = new Array();
	int[] ary = new int[5];
	ary[0] = 10;
	ary[1] = 100;
	ary[2] = 1000;
	ary[3] = 10000;
	ary[4] = 100000;

	System.out.println(ary[0] + ary[1]);
*/
	}
}
