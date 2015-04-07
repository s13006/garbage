class For01{
     public static void main(String[] args) {

       for(int i = 0; i < 10; i++){
	 for(int j = 0; j < 10; j++){
	   System.out.print(" " + j);
	 }
	 System.out.println();
       }
/*
       for(int i = 0, j = 10; i < 10; i++,j++){
	System.out.println(i);
	System.out.println(j);
       }
*/
/*
//1〜10までの合計値を求めて表示
	int sum = 0;
        for(int i = 1; i < 11; i++){
	  sum += i;
	}
	System.out.println(sum); 
*/
/*
//1〜10までの間の奇数のみ表示
        for(int i = 1; i < 10;   i+=2){
           System.out.println(i);
    } 
*/
  }
}
