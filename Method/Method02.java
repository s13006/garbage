import java.util.Scanner;

class Method02{
	 static int signOf(int n){
	 if(n > 0) return 1;
	 else if(n == 0) return = 0;
	 else return -1;
	
/*
	 int a;
	 if(n > 0) a = 1;
	 else if(n == 0) a = 0;
	 else a = -1;

	 return a;
*/
	}
	public static void main(String[] args){
	 Scanner stdIn = new Scanner(System.in);
	 //int n = stdIn.nextInt();	
	 //System.out.println(signOf(n));
	int n;
	 System.out.println(signOf( n = stdIn.nextInt()));
	}
}
