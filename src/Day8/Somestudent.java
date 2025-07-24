package Day8;

class Details{
    String name;
    int rollNum;
    char grade;
    public Details(String name, int rollNum, char grade){
        this.name = name;
        this.rollNum = rollNum;
        this.grade = grade;
    }
    public void displayDetails(){
        System.out.println("Name is : " + name);
        System.out.println("Roll Number is: "+ rollNum);
        System.out.println("Grade is : "+grade);
    }
}
public class Somestudent {
    public static void main(String[] args) {
        Details std = new Details("Rohith", 22, 'A');
        std.displayDetails();
    }
}
