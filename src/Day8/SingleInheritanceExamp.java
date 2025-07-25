package Day8;

public class SingleInheritanceExamp {
    public static void main(String[] args) {
        Student1 myStd = new Student1();
//        myStd.displayPerson("Rohith", 21);
//        myStd.displayStudent(22);
        myStd.name ="Rohith";
        myStd.age = 21;
        myStd.rollNum = 22;
        myStd.displayPerson();
        myStd.displayStudent();
    }
}
class StudentDetails{
    String name;
    int age;
    public void displayPerson(){
        System.out.println("Name is: "+ this.name);
        System.out.println("Age is: "+ this.age);
    }
}
class Student1 extends StudentDetails{
    int rollNum;
    public void displayStudent(){
        System.out.println("Roll num is :"+ this.rollNum);

    }
}
