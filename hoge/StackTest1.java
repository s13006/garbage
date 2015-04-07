import java.util.LinkedList;
import java.util.NoSuchElementException;

public class StackTest1{
  public static void main(String[] args){
    LinkedList<String> stack = new LinkedList<String>();

    stack.addFirst("Alice");
    System.out.println("addFirst 後のstack = " + stack);
    stack.addFirst("Bob");
    System.out.println("addFirst 後のstack = " + stack);
    stack.addFirst("Chris");
    System.out.println("addFirst 後のstack = " + stack);
    stack.addFirst("Elmo");
    System.out.println("addFirst 後のstack = " + stack);

    try{
      while(true){
        String name = stack.removeFirst();
        System.out.println("removeFirst の戻り値 = " + name);
        System.out.println("addFirst 後のstack = " + stack);
      }
    }catch(NoSuchElementException e){
      System.out.println("stack は空になりました");
    }
  }
}
