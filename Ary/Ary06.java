import java.util.Scanner;

class Ary06{
   public static void main(String[] args){
   Scanner stdIn = new Scanner(System.in);
	
	System.out.print("クラス数:");
	int x = stdIn.nextInt();
	System.out.println();

	int[][] a = new int[x][];
	int[] b = new int[x];
	int c = 0;
	int sum = 0;
	for(int i = 0; i < a.length; i++){
	        System.out.print(i+1 + "組の人数：");
	        int n = stdIn.nextInt();
		sum += n;
		a[i] = new int[n];
		System.out.println("=================================");
	   for(int j = 0; j < a[i].length; j++){
		System.out.print(j+1 +"人目の点数:");
		a[i][j] = stdIn.nextInt();
		b[i] += a[i][j];
	   }
		System.out.println("=================================");
	}
	System.out.println("  組 |     合計    平均　");
	System.out.println("-----+--------------------");
	for(int i = 0; i < a.length; i++){
	   double ave = (double)b[i]/a[i].length;
	   System.out.println(" " + (i+1) + "組 |      " + b[i] + "     " + ave);
	   c += b[i];
	}
	   System.out.println("-----+--------------------");
	   double ave1 = (double)c/sum;
  	   System.out.println("  計 |       " + c + "    " + ave1);
   }
}
