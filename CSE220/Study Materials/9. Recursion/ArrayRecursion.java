import java.util.Arrays;

public class ArrayRecursion {

    public static void main(String[] args) {
        int[] arr1D = {12, 44, 6, 57, 69, 87, 5, 3};
        
        System.out.println("Array Forward:");
        arrForward(0, arr1D);
        
        System.out.println("\nArray Backward:");
        arrBackward(0, arr1D);
        
        System.out.println("Sum of Array:");
        int sum = arrSum(0, arr1D);
        System.out.println("Sum: " + sum);
        
        System.out.println("Multiplication of Array:");
        int product = arrMul(0, arr1D);
        System.out.println("Product: " + product);

	//WEIRD SUM
	int[] arr1D = {1, 4, 6, 5, 9, 2};
        
        System.out.println("Weird Sum of Array:");
        int sum = arrWeirdSum(0, arr1D);
        System.out.println("Weird Sum: " + sum);
    }

    // Print array elements forward
    static void arrForward(int i, int[] arr) {
        if (i == arr.length) {
            return;
        } else {
            System.out.print(arr[i] + " ");
            arrForward(i + 1, arr);
        }
    }

    // Print array elements backward
    static void arrBackward(int i, int[] arr) {
        if (i == arr.length) {
            return;
        } else {
            arrBackward(i + 1, arr);
            System.out.print(arr[i] + " ");
        }
    }

    // Sum of array elements
    static int arrSum(int i, int[] arr) {
        if (i == arr.length - 1) {
            return arr[i];
        } else {
            return arr[i] + arrSum(i + 1, arr);
        }
    }

    // Multiply array elements
    static int arrMul(int i, int[] arr) {
        if (i == arr.length - 1) {
            return arr[i];
        } else {
            return arr[i] * arrMul(i + 1, arr);
        }
    }
    
    //WEIRD SUM
    // Sum where even numbers are added and odd numbers are subtracted
    static int arrWeirdSum(int i, int[] arr) {
        if (i == arr.length) {
            return 0;
        } else {
            return evenOdd(arr[i]) + arrWeirdSum(i + 1, arr);
        }
    }

    // Even numbers are added, odd numbers are subtracted
    static int evenOdd(int n) {
        if (n % 2 == 1) {
            System.out.print("-" + n + " ");
            return -n;
        } else {
            System.out.print("+" + n + " ");
            return n;
        }
    }
}
