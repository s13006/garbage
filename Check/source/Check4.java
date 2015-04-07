import java.util.Scanner;

class Check4{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("年齢を入れて：");   int age = stdIn.nextInt();
		
			if(age >= 18)	System.out.println("Z");
			else	if(age == 17) System.out.println("D");
			else	if(age >= 15) System.out.println("C");
			else	if(age >= 12) System.out.println("B");
			else System.out.println("A");
		}

	
}
