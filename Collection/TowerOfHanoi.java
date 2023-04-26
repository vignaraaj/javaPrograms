import java.util.*;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3; // number of disks
        Stack<Integer> source = new Stack<>();
        Stack<Integer> auxiliary = new Stack<>();
        Stack<Integer> destination = new Stack<>();
        for (int i = n; i >= 1; i--) source.push(i);  // Push all the disks onto the source stack
        System.out.println("Initial State:"); // Print the initial state of the stacks
        System.out.println("Source: " + source);
        System.out.println("Auxiliary: " + auxiliary);
        System.out.println("Destination: " + destination);
        moveDisks(n, source, auxiliary, destination);  // Call the recursive method to solve the puzzle
        System.out.println("Final State:");  // Print the final state of the stacks
        System.out.println("Source: " + source);
        System.out.println("Auxiliary: " + auxiliary);
        System.out.println("Destination: " + destination);
    }
    public static void moveDisks(int n, Stack<Integer> source, Stack<Integer> auxiliary, Stack<Integer> destination) {
        if (n == 1) {  // Base case: move the top disk from source to destination
            int disk = source.pop();
            destination.push(disk);
            System.out.println("Move disk " + disk + " from " + source + " to " + destination);
        } else {
            moveDisks(n-1, source, destination, auxiliary); // Move n-1 disks from source to auxiliary using destination as auxiliary
            int disk = source.pop();  // Move the nth disk from source to destination
            destination.push(disk);
            System.out.println("Move disk " + disk + " from " + source + " to " + destination);
            moveDisks(n-1, auxiliary, source, destination); // Move the n-1 disks from auxiliary to destination using source as auxiliary

        }
    }
}