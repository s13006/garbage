import java.util.Scanner;

class Ary04{
   public static void main(String[] args){
   Scanner stdIn = new Scanner(System.in);
    int[][] a = new int[6][2];
    int[] stdsum = new int[6];
    int sum = 0;
    int sum1 = 0;
    for(int i = 0; i < a.length; i++){
	  System.out.println("===================================================");
	for(int j = 0; j < a[i].length; j++){
	  System.out.println(i+1 + "人目");
	  if(j == 0){
	   System.out.println("国語");
	   a[i][j]=stdIn.nextInt();
	   sum += a[i][j];
	  }else{
	   System.out.println("数学");
	   a[i][j]=stdIn.nextInt();
	   sum1 += a[i][j];
	  }
	}
	  stdsum[i] += a[i][0] + a[i][1];
    }
	  System.out.println("===================================================");
	  System.out.println("国語の平均点：" + sum/a.length);
	  System.out.println("数学の平均点：" + sum1/a.length);
	  for(int i = 0; i < a.length; i++)
		System.out.println(i+1 + "人目の平均：" + stdsum[i]/2);
	  System.out.println("===================================================");
/*
    int [][] a = new int[2][6];
    int w = 1;
    int sum = 0;
    int sum1 = 0;
    for(int i = 0; i < a.length; i++){
	for(int j = 0; j < a[i].length; j++){
	  System.out.println();
	  System.out.println("国語の点数");
	  a[0][j] = stdIn.nextInt();
	  System.out.println("数学の点数");
	  a[1][j] = stdIn.nextInt();
	  System.out.println();
	  System.out.println(w + "人目の平均点 " + (a[0][j]+a[1][j])/2);
	  sum += a[0][j];
	  sum1 += a[1][j];
	  w++;
	}
    System.out.println();
    System.out.println("国語の平均点：" + sum / a[i].length);
    System.out.println("数学の平均点：" + sum1 / a[i].length);//break;
    }
*/
/*
     int [][] a = new int[2][6];
     int sum = 0;
     int sum1 = 0;
     int sum2 = 0;
     for(int i = 0; i < a.length; i++){
     int z = 1;
	for(int j = 0; j < a[i].length; j++){
	   if(i == 0){
	     System.out.println("６人の国語の点数を入れてください");
	     System.out.println(z + "人目");
	     a[i][j] = stdIn.nextInt();
	     z++;
		sum += a[i][j];
	   }else{
	     System.out.println("６人の数学の点数を入れてください");
	     System.out.println(z + "人目");
	     a[i][j] = stdIn.nextInt();
	     z++;
	       sum1 += a[i][j];
	   } 
 	 }
	}
	for(int x = 0; x < a[i].length; x++){
	  for(int y = 0; y < a.length; y++){
	     sum2 += a[y][x];
	  }
	     System.out.print("の平均点数" + sum2/2);
	}
	  System.out.println("国語の平均"+ sum/a[i].length);
	  System.out.println("数学の平均" + sum1/a[i].length);
*/
   }
}

