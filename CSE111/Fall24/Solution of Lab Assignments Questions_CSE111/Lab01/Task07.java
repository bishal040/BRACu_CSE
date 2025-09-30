import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        double[] arr = takeArrayInput(N);
        double[] arr2 = uniqueArray(arr);
        newArray(arr2);
        sc.close();
    }
    
    public static double[] takeArrayInput(int num) {
        Scanner sc = new Scanner(System.in);
        double[] array = new double[num];
        System.out.println("Please enter the elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }
        sc.close();
        return array;
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static double[] uniqueArray(double[] arr) {
        boolean[] arraybool = new boolean[arr.length];
        double[] arr2 = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!arraybool[i]) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        arr2[i] = arr[i];
                        arraybool[j] = true;
                    } else {
                        break;
                    }
                }
            }
        }
        return arr2;
    }

    public static int removedValue(double[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }

    public static void newArray(double[] arr) {
        int count = removedValue(arr);
        int pcount = 0;
        double[] newArr = new double[arr.length - count];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[pcount] = arr[i];
                pcount++;
            }
        }

        System.out.print("New Array: ");
        printArray(newArr);
        System.out.println("");
        System.out.println("Removed elements: " + count);
    }
}
