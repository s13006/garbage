
public class BadBankTest{
  public static void main(String[] args){
    BadBank bank = new BadBank();
    new Tester(bank).start();
    new Tester(bank).start();
  }
}

class Tester extends Thread{
  BadBank bank;

  public Tester(BadBank bank){
    this.bank = bank;
  }

  @Override
  public void run(){
    while(true){
      //100円預け入れ
      bank.addMoney(100);
      //100円引き出し
      bank.addMoney(-100);
    }
  }
}
