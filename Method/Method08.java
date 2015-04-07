import java.util.Scanner;
import java.util.Random;

class Method08{
	static Scanner stdIn = new Scanner(System.in);
	static Random rand = new Random();
	//--続行の確認--//
	static boolean confirmRetry(){
	   int cont;
	   do {
	      System.out.print("もう一度？<Yes...1/No...0> : ");
	      cont = stdIn.nextInt();
	   }while (cont != 0 && cont != 1);
	   return cont == 1;
	}
	static void quiz(int x, int y, int z){
	   int i = rand.nextInt(4);
	   int ans = 0;
	   switch(i){
		case 0:ans = x + y + z;System.out.println("x + y + z");
		case 1:ans = x + y - z;System.out.println("x + y - z");
		case 2:ans = x - y + z;System.out.println("x - y + z");
		case 3:ans = x - y - z;System.out.println("x - y - z");
	   }
	      while(true){
	   int k = stdIn.nextInt();
	   if (k == ans) break;
	   System.out.println("違いますよ！");
	      }
	}

	public static void main(String[] args){
	
	   System.out.println("暗算力トレーニング!!");
	   do {
	      int x = rand.nextInt(900) + 100;
	      int y = rand.nextInt(900) + 100;
	      int z = rand.nextInt(900) + 100;
	
	      quiz(x,y,z);
	   } while(confirmRetry());
	}
}
