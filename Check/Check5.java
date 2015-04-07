
class Check5{
	public static void main(String[] args){
		int x = 0;
		int y = 0;	

		for(int i = 0; i <= 10000; i++){
			if(i % 2 == 0)	x += i;
			else y += i;
		}
		System.out.println("偶数合計：" + x);
		System.out.println("奇数合計：" + y);
	}
}
