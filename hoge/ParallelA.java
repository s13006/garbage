public class ParallelA{
  public static void main(String[] args){
    ParallelASub sub = new ParallelASub();
    sub.start();

   for(int a = 0; a < 10000; a++){
      System.out.println("main: " + a);
    }
  }
}

class ParallelASub extends Thread{
  @Override
  public void run(){
    for(int a = 0; a < 10000; a++){
      System.out.println("-sub: " + a);
    }
  }
}
