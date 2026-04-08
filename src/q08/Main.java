 import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline after reading n
        
        // Create a stack with a reasonable initial capacity
        int[] stack = new int[1000]; // Maximum size for this problem
        int top = -1; // Points to the top element
        
        for (int i = 0; i < n; i++) {
            String operation = sc.nextLine();
            
            if (operation.startsWith("PUSH")) {
                // Extract the number after "PUSH "
                int x = Integer.parseInt(operation.substring(5));
                top++;
                stack[top] = x;
            } 
            else if (operation.equals("POP")) {
                if (top == -1) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(stack[top]);
                    top--;
                }
            } 
            else if (operation.equals("PEEK")) {
                if (top == -1) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(stack[top]);
                }
            } 
            else if (operation.equals("SIZE")) {
                System.out.println(top + 1);
            }
        }
    }
}

        // TODO: Implement a stack using an array (no Java Stack class)
        //       Process n operations:
        //         PUSH x  → push integer x
        //         POP     → pop top, print it; if empty print "EMPTY"
        //         PEEK    → print top without removing; if empty print "EMPTY"
        //         SIZE    → print current number of elements
        //
        // Input:
        // 6
        // PUSH 10
        // PUSH 20
        // PEEK
        // POP
        // POP
        // POP
        //
        // Output:
        // 20
        // 20
        // 10
        // EMPTY

    

