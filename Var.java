class Var{
   static public void main(String[] args) {
//変数の宣言
//     int a;
//代入
     int a = 10;
     int b = 2;
//   a = "Hello Java!";整数型に文字列型は代入できない
//表示
     System.out.println("a+=b " + (a += b)); // a +=b , a = a + b;
     System.out.println(a);
/*
     System.out.println("a+a=" + (a + a));
     System.out.println("a-a=" + (a - a));
     System.out.println("a*a=" + a * a);
     System.out.println("a/a=" + a / a);
     System.out.println(a);
*/
   }
}
