class C7{
	public static void main(String[] args){
		for(int i = 10; i <= 20;i+=2){
			if(i == 10){
				System.out.print("   ");
				for(int j = 11; j <= 19; j+=2){
					System.out.print( " " +j + "|");
				}
				System.out.println();
			}
			System.out.print(i + "|");
			for(int j = 11; j <= 19; j+=2){
				System.out.print(i*j + "|");
			}
			System.out.println();
		}
	}
}
