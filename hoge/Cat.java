import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Cat{
  public static void main(String[] args){
    for(int i = 0; i < args.length; i++){
      System.out.println("ファイル名:" + args[i] + "====");
      try{
        BufferedReader reader = 
          new BufferedReader(new FileReader(args[i]));
        while(true){
          String line = reader.readLine();
          if(line == null){
            break;
          }
          System.out.println(line);
        }
        reader.close();
      }catch(FileNotFoundException e){
        System.out.println("ファイルが見つかりません:" + e);
      }catch(IOException e){
        System.out.println("I/Oエラーです:" + e);
      }
    }
    System.out.println("終了します");
  }
}
