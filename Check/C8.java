class C8{
	public static void main(String[] args){
		int x = 3;
		int z = 5;
		int y = 1;
		
		System.out.println(max(x,z,y));
		System.out.println(min(x,z,y));
		System.out.println(avg(x,z,y));
	}
	
	static double max(double x,double z, double y){
		double max = x;
		if(max < z){
			max = z;
		}
		if(max < y){
			max = y;
		}
		return max;
	}
	static double min(double x,double z, double y){
		double min = x;
		if(min > z){
			min = z;
		}
		if(min > y){
			min = y;
		}
		return min;
	}
	static double avg(double x,double z,double y){
		double avg = x;
		avg += z+y;
		avg /= 3;
		return avg;
	}
}
