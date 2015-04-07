class Ary03{
	public static void main(String[] args){
	//二次元配列の初期化
	  int[][] a = {{10,20,30},{100,200,300},{1000,2000,3000}};
	  for(int i = 0; i < a.length; i++){
	    for(int j = 0; j < a[i].length; j++){
	      System.out.println("a["+ i +"]["+ j +"] = "+ a[i][j]);
	    }
	  }
/*
	  int[][] a = new int[2][3];
	  a[0][0] = 10;
	  a[0][1] = 20;
	  a[0][2] = 30;
	  a[1][0] = 100;
	  a[1][1] = 200;
	  a[1][2] = 300;
	  for(int i = 0; i < a.length; i++){
	    for(int j = 0; j < a[i].length; j++){
	      System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
	    }
	  }
*/
	}
}
