//Assignment Task 01: Container with Most Water
class AssgnTask1{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void mostWater( Integer[] height ){
        int maxarea =0,temparea=0;;
        int idxL= 0,idxR = height.length-1;
        //Approach one
        while(true){
            if(height[idxL]<height[idxR]){
                    if(idxL<idxR){
                        temparea =(idxR-idxL)*height[idxL];
                    }
                    else{
                        temparea =(idxL-idxR)*height[idxL];
                    }
                }
                else{
                    if(idxL<idxR){
                        temparea =(idxR-idxL)*height[idxR];
                    }
                    else{
                        temparea =(idxL-idxR)*height[idxR];
                    }
                }
                if(maxarea<temparea){
                    maxarea=temparea;
                }
                if(height[idxL]<height[idxR]){
                    idxL++;
                }
                else{
                    idxR--;
                }
                if(idxL>=idxR){
                    break;
                }
        }
        System.out.println(maxarea);
        /*
        //Approach two
        int maxvol=0,tempvol=0;
        for(int i=0;i<height.length;i++){
            for(int j=0;j<height.length;j++){
                if(height[i]<height[j]){
                    if(i<j){
                        tempvol =(j-i)*height[i];
                    }
                    else{
                        tempvol =(i-j)*height[i];
                    }
                }
                else{
                    if(i<j){
                        tempvol =(j-i)*height[j];
                    }
                    else{
                        tempvol =(i-j)*height[j];
                    }
                }
                if(maxvol<tempvol){
                    maxvol=tempvol;
                }
            }
        }
        System.out.println(maxvol);
        */
        
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
	System.out.print("\nYour Output:\n");
        mostWater( array );
    }
}
