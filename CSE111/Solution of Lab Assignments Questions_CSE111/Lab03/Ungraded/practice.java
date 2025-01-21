package Ungraded;

public class practice {
    public static void main(String[] args) {
        // Arrays for product names and their prices
        String[] products = {"Laptop", "Phone", "Tablet", "Monitor", "Headphones"};
        double[] prices = {800.0, 500.0, 600.0, 300.0, 200.0};

        // Variables to track the highest and second-highest prices
        int highestIndex = 0;
        int secondHighestIndex = -1;
        int thirdindex = -2;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[highestIndex])
            {
                secondHighestIndex = highestIndex;
                highestIndex = i;}
                else if(secondHighestIndex==-1 || prices[i]> prices[secondHighestIndex])
                {
                    thirdindex = secondHighestIndex;
                    secondHighestIndex = i;
                }
                else if (thirdindex==-2 || prices[i]>prices[thirdindex])
                {
                    thirdindex=i;
                }
        }

        System.out.println("Highest Price:");
        System.out.println("Product: " + products[highestIndex] + ", Price: " + prices[highestIndex]);

        System.out.println("Second Highest Price:");
         System.out.println("Product: " + products[secondHighestIndex] + ", Price: " + prices[secondHighestIndex]);
         System.out.println("third Highest Price:");
         System.out.println("Product: " + products[thirdindex] + ", Price: " + prices[thirdindex]);

}
}

