import java.util.Map;
import java.util.HashMap;

public class HashMapTest1{
  public static void main(String[] args){
    Map<String, Integer> map = new HashMap<String , Integer>();

    map.put("Alice" , 100);
    map.put("Bob" , 57);
    map.put("Chris" , 85);
    map.put("Diana", 85);
    map.put("Elmo" , 92);

    //エントリに基づいてあれ
    for(Map.Entry<String , Integer> entry : map.entrySet()){
      System.out.println(entry.getKey() + " => " + entry.getValue());
    }
    System.out.println();

    //キーに基づいてのアレ
    for(String name : map.keySet()){
      System.out.println(name);
    }

    //値に基づいてのアレ
    for(int value : map.values()){
      System.out.println(value);
    }
      System.out.println();

    //Bobの値を得る
    System.out.println(map.get("Bob"));

    //Fred の値を得る
    System.out.println(map.get("Fred"));
  }
}
