import java.util.Scanner;

class C6{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int a = 0;
		System.out.print("回数？:");
		int b = stdIn.nextInt();
		
		for(int i = 0; i < b; i++){
			System.out.print("+");
		}

/*
		while(a < b){
			System.out.print("+");
			a++;
		}
*/
	}
}
