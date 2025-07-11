import java.util.*;

public class pract2 {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            // If the token is a number, push it to the stack
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
            }
            // If it's an operator, pop two elements and perform operation
            else {
                int b = stack.pop();  // Second operand
                int a = stack.pop();  // First operand
                int result = 0;

                switch (token) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": result = a / b; break;  // Integer division
                    case "%": result = a % b; break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }

                stack.push(result);
            }
        }

        return stack.pop();  // Final result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter postfix expression with spaces (e.g., '5 6 2 + * 12 4 / -'):");
        String input = sc.nextLine();
        try {
            int result = evaluatePostfix(input);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid expression: " + e.getMessage());
        }
    }
}
