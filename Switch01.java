import java.util.Scanner;

class Switch01{
  public static void main(String[] args){
     Scanner stdIn = new Scanner(System.in);
     int i = stdIn.nextInt();
     switch(i%2){
	case 1:System.out.println("奇数");
	    break;
	case 0:System.out.println("偶数");
	    break;
  }

/*
     switch(i){
	case 3:
	case 4:
	case 5:System.out.println("春");
	break;
	case 6:
	case 7:
	case 8:System.out.println("夏");
	break;
	case 9:
	case 10:
	case 11:System.out.println("秋");
	break;
	case 12:
	case 1:
	case 2:System.out.println("冬");
	break;
	default:System.out.println("１〜１２までの数字を入れてください");
	break;
  }
*/
/*
     //switch文
     switch(i) {
	case 1:System.out.println("1 です");
	   break;
	case 2:System.out.println("2 です");
	   break;
	case 3:System.out.println("3 です");
	   break;
	default:System.out.println("default です");
	   break;
	}
*/
  }
}
