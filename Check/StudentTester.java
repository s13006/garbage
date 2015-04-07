import java.util.Calendar;

class Student{

		private String id;
		private String name;
		private String department;
		private String cource;
//		private Calendar birthday;
//		private Calendar expiration;
		
		//コンストラクタ
		Student(String i,String n,String d,String c){
			id = i;
			name = n;
			department = d;
			cource = c;
		}
		
		//ゲッター
		String getName(){
			return name;
		}
		String getId(){
			return id;
		}
		String getDepartment(){
			return department;
		}
		String getCource(){
			return cource;
		}

		//セッター
		void setName(String name){
			name = this.name;
		}
		void setId(String id){
			id = this.id;
		}
		void setDepartment(String department){
			department = this.department;
		}
		void setCource(String cource){
			cource = this.cource;
		}
}

class StudentTester{
	public static void main(String[] args){
		Student shimabukuro = new Student("s13006","島袋　完誉","ITスペシャリスト科","システムコース");
//		Calendar calendar = Calendar.getInstance();

/*
		shimabukuro.setId		= "s13006";
		shimabukuro.setName	= "島袋　完誉";
		shimabukuro.setDepartment	= "ITスペシャリスト科";
		shimabukuro.setCource 	= "システムコース";
*/
//		calendar.set(1995,01,25);
//		shimabukuro.birthday	= calendar; 
//		calendar.set(2016,03,31);
//		shimabukuro.expiration	= calendar;
		
		System.out.println(shimabukuro.getId());
		System.out.println(shimabukuro.getName());
		System.out.println(shimabukuro.getDepartment());
		System.out.println(shimabukuro.getCource());
//		System.out.println(shimabukuro.birthday);
//		System.out.println(shimabukuro.expiration);
	}
}
