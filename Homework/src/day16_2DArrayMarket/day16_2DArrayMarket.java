package day16_2DArrayMarket;

import java.util.Arrays;

public class day16_2DArrayMarket {
    public static void main(String[] args) {
        //         walmart	costco	corrado's	AVG
      //    apple	3	       4	   5	     4
      //    milk	3	       3	   3	     3
      //    meat	4          5	   4	     4.33
     //    bread	1	       1	   2	     1.33
     //    TOTAL	11	      13	   14

        // given table,
        // part1. calculate sum of price in each market(walmart,costco,corrado's)
        // expected output is:
        // Total at Walmart is: ???
        // Total at costco is: ???
        // Total at corrado's is: ???

        // part2. calculate average price of each item(apple, milk, meat, bread)
        // expected output is:
        // average price of apple is: ???
        // average price of milk is: ???
        // average price of meat is: ???
        // average price of bread is: ???
        int[][] prices = {
                {3,4,5},
                {3,3,3},
                {4,5,4},
                {1,1,2}};
        double[] sumItem = new double[prices.length];
        double[] average = new double[prices.length];
        double[] sumMarket = new double[prices[0].length];
        for (int urun = 0; urun < prices.length; urun++) {
            for (int market = 0; market < prices[urun].length; market++) {

           sumItem[urun] += prices[urun][market];
           sumMarket[market] += prices[urun][market];
            }
            average[urun] = sumItem[urun] / 3;
        }
        System.out.println("Sum Market:" + Arrays.toString(sumMarket));
        System.out.println("Average:" + Arrays.toString(average));
    }
}
