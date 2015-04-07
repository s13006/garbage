import java.util.Scanner;

class Method01{
//	static void put(int a){ System.out.println(a); }
	static void max(int a, int b, int c){
	 int max = a;
	 if(max < b) max = b;
	 if(max < c) max = c;
	 System.out.println(max);
	}
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);

	int  a = stdIn.nextInt();
	int  b = stdIn.nextInt();
	int  c = stdIn.nextInt();
	System.out.println();
	 max(a,b,c);
	}
/*
	static void putHello(){
	 System.out.println("Hello");
	 System.out.println("Java!");
	}

	public static void main(String[] args){
	 for(int i = 0; i < 5 ; i++){
	 putHello();
	}

	 putHello();
	 putHello();
	 putHello();
	 putHello();
	}
*/
	
}
