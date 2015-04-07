public class ParallelC{
  public static void main(String[] args){
    Thread t = new Thread(new Runnable() {
      @Override
      public void run(){
        for(int c = 0; c < 1000; c++){
          System.out.println("anon: " + c); 
        }
      }
    });

    t.start();

    for(int c = 0; c < 1000; c++){
      System.out.println("main: " + c);
    }
  }
}
