class Ary00{
   public static void main(String[] args){
     int[][] a = new int[2][3][2];
     a[0][0][0] = 10; 
     a[0][0][1] = 20; 
     a[0][1][0] = 30; 
     a[0][1][1] = 40; 
     a[0][2][0] = 50; 
     a[0][2][1] = 60; 
     a[1][0][0] = 100; 
     a[1][0][1] = 200; 
     a[1][1][0] = 300; 
     a[1][1][1] = 400; 
     a[1][2][0] = 500; 
     a[1][2][1] = 600; 
	(int i = 0; i < a.length; i++){
	  for(int j = 0; j < a[i].length; j++){
	    for(int k = 0; k < a[i][j].length; k++){
	      System.out.println("a["+ i +"]["+ j +"]["+ k +"] = "+ a[i][j][k]);
	    }
  }
}
