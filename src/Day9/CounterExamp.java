package Day9;
//Create a class Counter with;
//A static variable count(int), initialised to ).
//A constructor that increments the count by 1 each time the object is created.
//A static method getCount() that returns the current count.
//In the main() method:
//Create the instances of counter.
//Use Counter.getCount() to print how many instance have been created.
//new Counter(); <-- INSTANCE
class Counter{
    static int count = 0;
    Counter(){
        count+=1;
    }
    static void getCount(){
        System.out.println(count);
    }
}
public class CounterExamp {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
         Counter.getCount();
    }
}
