import java.util.Scanner;

class MaxHwa{
	int max(int [] args){
		int tmp = args[0];
		for(int i = 1; i < args.length; i++){
			if(args[i] > tmp)tmp = args[i];
			}
		return tmp;
	}
	int min(int [] args){
		int tmp = args[0];
		for(int i = 1; i < args.length; i++){
			if(args[i] < tmp)tmp = args[i];
			}
		return tmp;
	}
	int sum(int [] args){
		int sum = args[0];
		for(int i = 1; i <args.length; i++)sum += args[i];
		return sum;
	}
	double ave(int [] args){
		int sum = args[0];
		int ave;
		for(int i = 1; i < args.length; i++)sum += args[i];
		ave = sum/args.length;
		return ave;
	}
	public static void main(String[] args){
		MaxHwa test = new MaxHwa();
		int[] array = {1,2,3,4,5};
		//String[] messages = {"最大値","最小値"," 合計","平均"}
		System.out.println(/*messages[0]*/ + test.max(array));
		System.out.println(/*messages[1]*/ + test.min(array));
		System.out.println(/*messages[2]*/ + test.sum(array));
		System.out.println(/*messages[3]*/ + test.ave(array));
/*		MaxHwa test1 = new MaxHwa();
		System.out.println(
				test1.min(1,2,3)
				);
*/
	}
} 
