public class StackAssgnTaskTester1 {
    
    // You have to write this method
    // YOU MUST SUBMIT THIS METHOD
    // Hint: You need to traverse each characters of the String



    public static Stack segregate(Stack temp) {
        Stack odd = new Stack();
        Stack even = new Stack();
            while(!temp.isEmpty()){
                int value = (int)temp.pop();
                if(value%2==0){
                    even.push(value);
                }
                else{
                    odd.push(value);
                }
            }
            while(!odd.isEmpty()){
                temp.push(odd.pop());
            }
            while(!even.isEmpty()){
                temp.push(even.pop());
            }
            return temp;
        }
        public static void printStack(Stack s) {
            while (!s.isEmpty()) {
                System.out.println(s.pop());
            }
        }
    

        public static Stack Do_Adjacent_Swap(Stack st) {
        Stack temp = st;
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        Stack result = new Stack();
        int count = 0;
        
        while(!temp.isEmpty()){
            int value1 = (int)temp.pop();
            if (!temp.isEmpty()) {
            int value2 = (int) temp.pop();
            stack1.push(value1); // Push second one first (to be on top later)
            stack2.push(value2); // Then first one
            count = count + 2;
        }
        else{
            stack1.push(value1);
            count++;
        }

            
        }
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            if(count%2==0){
            if(!stack1.isEmpty()){
                result.push(stack1.pop());
            }
            if(!stack2.isEmpty()){
                result.push(stack2.pop());
            }
        }
        else{
            if(!stack2.isEmpty()){
                result.push(stack2.pop());
            }
            if(!stack1.isEmpty()){
                result.push(stack1.pop());
            }
        }
        }
        return result;
        }

public static void main(String[] args) {
     Stack stack = new Stack();

        // Push values from bottom to top
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        //stack.push(8);
        //printStack(stack);
        printStack(Do_Adjacent_Swap(stack));
        //printStack(stack);
}


    }

