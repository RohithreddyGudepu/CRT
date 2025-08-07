package Recursions;
public class TOH {

    // Recursive method to solve Tower of Hanoi
    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source to auxiliary
        solveHanoi(n - 1, source, destination, auxiliary);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move n-1 disks from auxiliary to destination
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3; // You can change this to any number
        System.out.println("Solving Tower of Hanoi for " + numberOfDisks + " disks:");
        solveHanoi(numberOfDisks, 'S', 'H', 'D');
    }
}