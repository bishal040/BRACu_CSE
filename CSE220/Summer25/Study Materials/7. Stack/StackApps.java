public class StackApps {

    // Method to chcek Parenthesis
    public static void parenthesisChecker(String expression) {
        LinkedListStack stk = new LinkedListStack();
        for (int i = 0; i < expression.length(); i++) {
            
            Character ch = expression.charAt(i);
            // If it's an opening bracket, push it to the stack
            if (ch == '{' || ch == '[' || ch == '(') {
                stk.push(ch);
            }
            // If it's a closing bracket, pop the stack and check for matching pair
            else if (ch == '}' || ch == ']' || ch == ')') {
                if (stk.isEmpty()) {
                    System.out.println("Error");
                    return;
                }
                
                //typecasting Object into Character
                Character opening = (Character)stk.pop();
                
                // Check if the popped opening bracket matches the closing bracket
                if ((opening == '(' && ch == ')') ||
                    (opening == '{' && ch == '}') ||
                    (opening == '[' && ch == ']')) {
                    continue; // valid match, continue
                } else {
                    System.out.println("Error");
                    return; // mismatched brackets
                }
            }
        }
        
        // If stack is empty after processing, it's balanced; otherwise, it's an error
        if (stk.isEmpty()) {
            System.out.println("Ok 👍");
        } else {
            System.out.println("Error");
        }
    }

}
