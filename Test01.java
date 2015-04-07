class Test01{
   public static void main(String[] args){
	//配列の宣言
	//int[] a; int a[];
	//int a                   [];
	//int[][] ary; int[] ary[]; int ary[][];
	//int[] x, y[];
	int[] x;
	int[][] y;

	//変数の複数宣言
	int a = 0, b = 1, c = 2;
	//{}がいらない
	if(a < 10) System.out.println("true");
	else System.out.println("false");

	for(int i = 0; i < 10; i++){
	   System.println(i);
	   System.out.println("for");
	}
   }
}
