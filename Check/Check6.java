
class Check6{
	public static void main(String[] args){
		int x = 1;
		int y = 2;
		int z = 3;
		
		System.out.println(max(x,y,z));
		System.out.println(min(x,y,z));
		System.out.println(avg(x,y,z));
	}


	static int max(int a,int b, int c){
		int max = a;
		if(max <= b) max = b;
		if(max <= c) max = c;
		
		return max;
	}

	static int min(int a, int b, int c){
		int min = a;
		if(min >= b) min = b;
		if(min >= c) min = c;
		
		return min;
	}

	static double avg(int a,int b,int c){
		double avg = (a+b+c)/3;

		return avg;
	}
}
