import java.util.Random;
import java.util.Scanner;

class jankenn{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    Random rand = new Random();
    //0〜9までのランダムな数値
    int n = rand.nextInt(100);
    //nの数値を当てるまで入力させるループ文を繰り返す
    //入力された値がnより小さいか大きいかのヒントも出す
    while(true){
	System.out.println("じゃんｗｗｗｗｗけんｗｗｗ");
	System.out.println("1.グー　2.チョキ  3.パー");
	int str = stdIn.nextInt();
	if(str == 1){
	  if(n >= 1 && n <= 33){
	    System.out.println("グーｗｗｗ、あいｗｗｗこでｗｗｗｗ");continue;
	  }else if(n >= 34 && n <= 66){
	    System.out.println("チョキｗｗｗｗまｗｗけｗｗたｗｗ");break;
	  }else if(n >= 67 && n <= 99){
	    System.out.println("パーｗｗｗｗｗ雑魚ｗｗｗｗｗｗ乙ｗｗｗｗ");break;
	  }else{
	    System.out.println("エターナルフォースブリザード、相手は死ぬ                 〜fin〜");break;
	  }
	}else if(str == 2){
	  if(n >= 1 && n <= 33){
	    System.out.println("グーｗｗｗｗｗ弱すぎわろたｗｗｗｗｗｗ");break;
	  }else if(n >= 34 && n <= 66){
	    System.out.println("チョキｗｗｗｗあいｗｗｗこでｗｗｗｗ");continue;
	  }else if(n >= 67 && n <= 99){
	    System.out.println("パーｗｗｗｗｗおまｗｗｗ強すぎｗｗｗｗ");break;
	  }else{
	    System.out.println("ちょき？なにそれ、はさみ？もぅぃみゎヵんなぃ・・・・・・リスカしょ・・・・　　　　　　〜Bad End〜");break;
	  }
	}else if(str == 3){
	  if(n >= 1 && n <= 33){
	    System.out.println("グーｗｗｗｗオワタｗｗｗｗｗｗ");break;
	  }else if(n >= 34 && n <= 66){
	    System.out.println("チョキｗｗｗｗｗ勝ったｗｗｗｗｗｗうはｗｗｗおｋｗｗｗ");break;
	  }else if(n >= 67 && n <= 99){
	    System.out.println("パーｗｗｗあいｗｗｗこでｗｗｗｗ");continue;
	  }else{
	    System.out.println("萎えた、やっぱやめるわ");break;
	  }
	}else{
	  System.out.println("１〜３までの数字を入力してください");continue;
	}
    }
  }
}
