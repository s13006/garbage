import java.util.Scanner;

class Method06{
	static boolean tof(int a, int b){
	  if(a == b) return true;
	  else return false;
	}

	static double ave(int a, int b, int c){
	  double sum = a;
	  sum += b; sum += c;
	  return sum/3;
	}

	static int sumUp(int a, int b){
	  int sum = a;
	  if(a > b) while(a-- > b) sum += a;
	  else if(a < b) while(a++ < b) sum += a;
	  else return 0;
	  return sum;
	}
	
	static void square(int d){
	  for(int i = 0; i < d; i++){
	    for(int j = 0; j < d; j++){
	      System.out.print("* ");
	    }
	    System.out.println();
	  }
	}
	public static void main(String[] args){
	  Scanner stdIn = new Scanner(System.in);

	  System.out.print("aの値を入れてください：");
	  int a = stdIn.nextInt();
	  System.out.print("bの値を入れてください：");
	  int b = stdIn.nextInt();
	  System.out.print("cの値を入れてください：");
	  int c = stdIn.nextInt();
	  System.out.print("dの値を入れてください：");
	  int d = stdIn.nextInt();
	    System.out.println();

	  System.out.println(tof(a,b));
	  System.out.println(ave(a,b,c));
	  System.out.println(sumUp(a,b));
	  square(d);
	  
	}
}
