
public class ParallelB{
  public static void main(String[] args){
  ParallelBSub sub = new ParallelBSub();
  Thread t = new Thread(sub);
  t.start();

    for(int b = 0; b < 1000; b++){
      System.out.println("main: " + b);
    }
  }
}

class ParallelBSub implements Runnable{
  @Override
  public void run(){
    for(int b = 0; b < 1000; b++){
      System.out.println("+sub: " + b);
    }
  }
}
