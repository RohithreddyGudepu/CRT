package Day9;

public class Interfaces {
    public static void main(String[] args) {
        Vehicle mycar = new Car();
        mycar.start();
        mycar.stop();
    }
}
interface Vehicle{
    void start();
    void stop();
        }
        class Car implements Vehicle{
    public void start(){
        System.out.println("Car is starting");
    }
    public void stop(){
        System.out.println("Car is stopping....");
    }
        }

