
class Hoge {

  static {
    System.loadLibrary("Hoge");
  }
  public static void main(String[] args) {
    Hoge hoge = new Hoge();
    System.out.println(hoge.getNumber());
  }

  public native int getNumber();

}
