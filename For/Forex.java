class Forex{
       public static void main(String[] args){
	int i;
	int j;
	 for(i = 1; i <= 20; i++){
		if(i <= 10){
		  for(j = 1; j <= 10; j++){
			if(j <= i){
				System.out.print("*");
				}else{
				System.out.print(" ");}
		  }
		}else{
		  for(j = 20; j > 10; j--){
			if(j > i){
				System.out.print("*");
				}else{}
		  }
		}
		System.out.println();
	 }
   } 
}

