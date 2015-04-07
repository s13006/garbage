import java.util.LinkedList;

public class LinkedListTest1{
  public static void main(String[] args){
    LinkedList<String> list = new LinkedList<String>();

    list.add("Bob");
    list.add("Chrie");
    list.add("Diana");
    list.add("Elmo");

    System.out.println(list);

    list.addFirst("Alice");

    System.out.println(list);
  }
}
