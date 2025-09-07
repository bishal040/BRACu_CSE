public class demo1 {
    public static void main(String[] args) {
           int howmanyprime=0;
            boolean flag=false;
        for(int num=10;num<=1000;num++){
            int count=0;
            for(int div = 1; div<=num;div++){
            if(num%div==0){
                count++;
            }
            if(count>2){
                flag = true;
            }
        }
        if(!flag){
           //System.out.println(num + " is a Prime number");
            howmanyprime++;
        }
        else{
            //System.out.println(num + " is not a Prime number");
            }
            flag=false;
    }
    System.err.println(howmanyprime);
}

}
