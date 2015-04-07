class asobi{
	public static void main(String[] args){
		int i;
		int j;
		for(i = 1; i <= 20; i++){
			if(i < 10){
				for(j = 10; j > 1; j--){
					if(j <= i){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
		    }else{
				for(j = 19; j > 10; j--){
				 	if(j > i){
			  			System.out.print("*");
				 	}
			    }
				System.out.println();
			}
		}
		System.out.println();
    }
}
