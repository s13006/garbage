import java.util.ArrayList;

public class ArrayListTest1{
  public static void main(String[] args){
    ArrayList<String> list = new ArrayList<String>();

    list.add("Alice");
    list.add("Bob");
    list.add("Chris");

    list.add("Diana");
    list.add("Elmo");

    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}
