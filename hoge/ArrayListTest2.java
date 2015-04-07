import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2{
  public static void main(String[] args){
    ArrayList<String> list = new ArrayList<String>();

    list.add("Alice");
    list.add("Bob");
    list.add("Chris");
    list.add("Diana");
    list.add("Elmo");

    Iterator<String> it = list.iterator();
    while(it.hasNext()){
      String name = it.next();
      System.out.println(name);
    }
  }
}
