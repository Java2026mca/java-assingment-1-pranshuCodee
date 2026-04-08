
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        String[] tokens = line.split(" ");
        
        // Array-based stack
        int[] stack = new int[tokens.length];
        int top = -1;
        
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || 
                token.equals("*") || token.equals("/")) {
                
                int b = stack[top--];
                int a = stack[top--];
                int result = 0;
                
                switch (token) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": result = a / b; break;
                }
                
                stack[++top] = result;
            } else {
                stack[++top] = Integer.parseInt(token);
            }
        }
        
        System.out.println(stack[top]);
    }
}
        // TODO: Evaluate a postfix (Reverse Polish Notation) expression
        //       Operands are non-negative integers, operators are: + - * /
        //       Use a stack to evaluate
        //       Input: single line, tokens separated by spaces
        //       Output: integer result
        //
        // Input: 5 1 2 + 4 * + 3 -
        // Output: 14
        //
        // Explanation: 5 + ((1+2)*4) - 3 = 5 + 12 - 3 = 14

        
