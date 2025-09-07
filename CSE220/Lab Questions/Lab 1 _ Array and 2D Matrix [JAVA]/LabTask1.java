//Lab Task 01: Merge Sorted Array
class LabTask1{

    //Complete this method so that it gives the Expected Output
    //NO NEED TO SUBMIT LAB TASKS
    public static Integer[] mergeSortedArray( Integer[] arr1, Integer[] arr2 ){

        //TO DO
        //DELETE the following return statement when you're ready to return the newly Created array
        Integer[] result_arr = new Integer[arr1.length+arr2.length];
        int c1=0,c2=0,c3=0;
            for(int i=0;i<result_arr.length;i++){
                if(c1<arr1.length && c2<arr2.length){if(arr1[c1]<arr2[c2]){
                    result_arr[c3++] = arr1[c1++];
                }
                else{
                    result_arr[c3++] = arr2[c2++];
                }
            }
        }
        if(c1>c2){
            for(int i=c3;i<result_arr.length;i++){
                result_arr[i]=arr2[c2++];
            }
        }
        else{
            for(int i=c3;i<result_arr.length;i++){
                result_arr[i]=arr1[c1++];
            }
        }






            // for(int i=0;i<result_arr.length;i++){
                
            //     if(arr1[c1]<arr2[c2]){
            //         if(c1!=arr1.length-1)
            //             result_arr[c3++] = arr1[c1++];
            //     }
            //     else{
            //         if(c2!=arr2.length-1)
            //             result_arr[c3++]=arr2[c2++];
                        
            //     }
            // }
            // if(arr1[c1]<arr2[c2]){
            //   result_arr[c1+c2]=arr1[c2];
            //     for(int i=c1+c2+1;i<result_arr.length;i++){
            //         result_arr[i]=arr1[c1++];
            //     }  
            // }
            // else if(arr1[c1]>arr2[c2]){
            //     result_arr[c1+c2]=arr1[c1];
            //     for(int i=c1+c2+1;i<result_arr.length;i++){
            //         result_arr[i]=arr2[c2++];
            //     }
            // }
        return result_arr;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] a1 = {1, 2, 3};
        Integer[] a2 = {2, 5, 6};
        System.out.print("Array 1: ");
        Arr.print(a1);
        System.out.print("Array 2: ");
        Arr.print(a2);
        System.out.println("Expected Output: [ 1 2 2 3 5 6 ]");
        Integer[] returned_val_1 = mergeSortedArray(a1, a2);
        System.out.print("Your Output: ");
        Arr.print(returned_val_1);
        System.out.print("\n======================\n");
        Integer[] a3 = {1, 3, 5, 11};
        Integer[] a4 = {2, 7, 8};
        System.out.print("\nArray 3: ");
        Arr.print(a3);
        System.out.print("Array 4: ");
        Arr.print(a4);
        System.out.println("Expected Output: [ 1 2 3 5 7 8 11 ]");
        Integer[] returned_val_2 = mergeSortedArray( a3, a4);
        System.out.print("Your Output: ");
        Arr.print(returned_val_2);
    }
}
