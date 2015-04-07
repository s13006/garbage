class Ex2{
  public static void main(String[] args){
    int[] a = new int[5];

    a[0] = 10;
    a[1] = 20;
    a[2] = 30;
    a[3] = 40;
    a[4] = 50;

    for(int i = 0; i < a.length; i++){
      System.out.println("a[" + i + "] = " + a[i]);
    }
    
    zeroIndexDecrement(a);

    for(int i = 0; i < a.length; i++){
      System.out.println("a[" + i + "] = " + a[i]);
    }
  }

  public static void zeroIndexDecrement(int[] t){
    while(t[0]-- > 0){
      System.out.println("(ZID) t[0] = " + t[0]);
    }
  }
}
