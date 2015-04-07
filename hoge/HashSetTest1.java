import java.util.Set;
import java.util.HashSet;

public class HashSetTest1{
  public static void main(String[] args){
    Set<String> set = new HashSet<String>();

    set.add("Alice");
    set.add("Bob");
    set.add("Chris");
    set.add("Diana");
    set.add("Elmo");

    for(String name : set){
      System.out.println(name);
    }

    if(set.contains("Alice")){
      System.out.println("set に Alice は含まれます");
    }else{
      System.out.println("set に Aliace は含まれていません");
    }
  }
}
