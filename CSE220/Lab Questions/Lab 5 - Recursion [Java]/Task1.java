import java.util.Scanner;

public class Task1 {

    // Task 1A: Print numbers from 1 to 10 using a loop
    public static void task1A() {
        for(int i=1; i<= 10; i++){
            System.out.print(i + " ");
        }
    }

    // Task 1B: Print numbers from 1 to 10 using recursion
    public static void task1B_recursive(int i) {
        if(i==0){
            return;
        }
        
        task1B_recursive(i-1);
        System.out.print(i + " ");
    }

    // Task 1C: Print numbers from 1 to n using a loop
    public static void task1C(int n) {
        for(int i=1; i<= n; i++){
            System.out.print(i + " ");
        }
    }

    // Task 1D: Print numbers from 1 to n using recursion
    public static void task1D_recursive(int i, int n) {
        if(i>n){
            return;
        }
        System.out.print(i + " ");
        task1D_recursive(i+1, n);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        task1D_recursive(sc.nextInt(), sc.nextInt());
        // Driver code for testing Task 1 methods
        // Write on your own

        sc.close();
    }
}
