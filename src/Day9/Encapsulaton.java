package Day9;

public class Encapsulaton {
    public static void main(String[] args) {
        Student3 std = new Student3();
        std.setName("Rohith");
        std.setAge(22);
        System.out.println("Name is: "+ std.getName());
        System.out.println("Age is : "+std.getAge());
    }
}
class Student3{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;

    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if(newAge>0){
            age= newAge;
        }
        else{
            System.out.println("Age must be positive");
        }
    }
}
