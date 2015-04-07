import java.util.Random;
class Ary02{
   public static void main(String[] args){
	Random rand =new Random();
	int max = 0;
	
	//配列aの値を各インデックスの値を０〜９９でうめて
	//その中から最大数を取得し表示する
	int[] a = new int[10];
	for(int i = 0; i < a.length; i++){
	   a[i] = rand.nextInt(100);
	   System.out.println("a[" + i + "] = " + a[i]);
	   if(a[i] > max){ max = a[i];}
	}
	System.out.println("最大値は" + max);
/*
	int[] a = {10,20,30,40,50,};
	
	//配列aの中身をすべて表示
	for(int i = 0; i < a.length; i++){
	   System.out.println("[" + i + "] = " + a[i]);
	}
*/
/*
	//配列の生成
	int[] a = new int[5];
	int b[] = new int[5];
	int[] c = {1,2,3,4,5};//初期化
*/
   }
}
