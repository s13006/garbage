
public class student{
  private String firstName;
  private String lastName;
  private String course;
  private String gender;
  private double height;
  private double weight;

  public student(){
    setFirstName("ひろき");
    setLastName("かめはま");
    setCourse("無所属");
    setGender("その他");
    setHeight(140);
    setWeight(40);
  
  }

  public student(String firstName,String lastName,String course,
         String gender, double height, double weight){
    setFirstName(firstName);
    setLastName(lastName);
    setCourse(course);
    setGender(gender);
    setHeight(height);
    setWeight(weight);
                 
  }


  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public void setFullName(String firstName,String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void setCourse(String course){
    this.course = course;
  }

  public void setGender(String gender){
    if(gender.equals("男") || gender.equals("女")){
      this.gender = gender;
    }else{
      this.gender = "その他";
    }
  }

  public void setHeight(double height){
    if(height > 100)
    this.height = height;
  }

  public void setWeight(double weight){
    if(weight > 40)
    this.weight = weight;
  }

  public void getFirstName(){
    System.out.println(firstName);
  }

  public void getLastName(){
    System.out.println(lastName);
  }

  public void getFullName(){
    System.out.println(lastName + firstName);
  }

  public void getCourse(){
    System.out.println(course);
  }

  public void getGender(){
    System.out.println(gender);
  }

  public void getHeight(){
    System.out.println(height);
  }

  public void getWeight(){
    System.out.println(weight);
  }

}
