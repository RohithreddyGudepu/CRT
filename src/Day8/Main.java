package Day8;

class Student {
    String name;
    int age;
    public void getInfo(){
        System.out.println("The name of the student is : " + this.name);
        System.out.println("The age of the student is :"+ this.age);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rohith";
        s1.age = 21;
        s1.getInfo();
    }
}
