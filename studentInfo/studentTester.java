
class studentTester{
  public static void main(String[] args){
    student student = new student();

    
    student.setFirstName("tanaka");
    student.setLastName("tarou");
    student.setCourse("hoge");
    student.setGender("男");
    student.setHeight(175.7);
    student.setWeight(70.8);

    
    student.getFullName();
    student.getCourse();
    student.getGender();
    student.getHeight();
    student.getWeight();
  }
}
