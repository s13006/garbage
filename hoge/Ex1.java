class Ex1{
  public static void main(String[] args){
    int a = 10;

    System.out.println("a = " + a);

    decrement(a);

    System.out.println("a = " + a);
  }

  public static void decrement(int a){
    while(a-- > 0){
      System.out.println("[decrement]a = " + a);
    }
  }
}
