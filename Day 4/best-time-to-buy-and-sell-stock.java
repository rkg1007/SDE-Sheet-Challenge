import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int profit = 0, buyPrice = prices.get(0);
        for (int i = 1; i < prices.size(); i++) {
            int price = prices.get(i);
            if (price < buyPrice) buyPrice = price;
            else profit = Math.max(profit, price - buyPrice);
        }
        return profit;
    }
}
