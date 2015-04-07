import java.util.Scanner;

class Method04{
	static int sumUp(int n){
		//int sum = 0;
		//for(int i = 1; i <= n; i++) sum += i;
		
		int sum = n;
		while(n-- > 0) sum += n;

		return sum;
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();
		System.out.println(sumUp(a));
	}
}
