class C9{
	public static void main(String[] args){
		double a[] = {1,6,3,7,9,4,2};
		
		System.out.println(max(a));
		System.out.println(min(a));
		System.out.println(avg(a));
	}
	static double max(double a[]){
		double max = Integer.MIN_VALUE;
		
		for(double i : a){
			if(max < i){
				max = i;
			}
		}
		return max;
	}
	static double min(double a[]){
		double min = Integer.MAX_VALUE; 

		for(double i : a){
			if(min > i){
				min = i;
			}
		}
		return min;
	}
	static double avg(double a[]){
		double avg = 0;
		for(double i : a){
			avg += i;
		}
		avg /= a.length;
		return avg;
	}
}
