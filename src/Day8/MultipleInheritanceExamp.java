package Day8;

public class MultipleInheritanceExamp {
    public static void main(String[] args) {
        GraduateStudent mystd = new GraduateStudent();
        mystd.name = "Rohith";
        mystd.age = 21;
        mystd.rollNum = 22;
        mystd.degree= "B.TECH";
        mystd.displayPerson();
        mystd.displayStudent();
        mystd.displayDegree();

    }
}
class Person{
    String name;
    int age;
    public void displayPerson(){
        System.out.println("Name is : "+ this.name);
        System.out.println("Age is : "+ this.age);
    }
}
class Student2 extends Person{
    int rollNum;
    public void displayStudent(){
        System.out.println("Roll Number is : "+ this.rollNum);
    }
}
class GraduateStudent extends Student2{
    String degree;
    public void displayDegree(){
        System.out.println("Degree : "+this.degree);
    }
}

