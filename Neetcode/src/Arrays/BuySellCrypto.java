package Arrays;

public class BuySellCrypto {
    public static void main(String[] args) {
        int[] prices = {10,1,5,6,7,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int ans= 0 , max= -1 ;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j <prices.length ; j++) {
                if(prices[j] > prices[i]){
                    int profit = prices[j] - prices[i];
                    if(profit>max) max = profit;
                }
            }
            if(max != -1 && max> ans){
                    ans = max;
                    max=-1;
                }


        }
        return ans;
    }
}
