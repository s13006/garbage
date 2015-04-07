class For06{
       public static void main(String[] args){
	int i;
	int j;
	 for(i = 10; i >= 1; i--){
		for(j = 10; j >= 1; j--){
			if(j <= i){
				System.out.print("*");
				}else{
				System.out.print(" ");}
		}
		System.out.println();
	 }
   } 
}

