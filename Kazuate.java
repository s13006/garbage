import java.util.Random;
import java.util.Scanner;

class Kazuate{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    Random rand = new Random();
    //0〜9までのランダムな数値
    int n = rand.nextInt(100);
    int b = 0;
    int k = 10; 
    //nの数値を当てるまで入力させるループ文を繰り返す
    //入力された値がnより小さいか大きいかのヒントも出す
    while(true){
	System.out.println("------------------------------------------------------------------------------");
    System.out.println("あと" + k + "回");
    if(k == 0){
	System.out.println("雑魚乙ｗｗｗｗｗｗｗｗ");
	System.out.println("------------------------------------------------------------------------------");
        break;
    }else{
    b++;
    int i = stdIn.nextInt();
      if(n == i) {System.out.println("おめでとう！" + b + "回目で正解しました！");
	System.out.println("------------------------------------------------------------------------------");
break;}else{
      if(n > i){
	  System.out.println("それよりも大きいよ");
      }else{
 	  System.out.println("それよりも小さいよ");
      }
    }
    }
    k--;
	System.out.println("------------------------------------------------------------------------------");
    }
  }
}
