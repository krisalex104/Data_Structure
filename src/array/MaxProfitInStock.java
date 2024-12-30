package array;

public class MaxProfitInStock {
    public static int maxProfit(int[] prices)
    {
        int profit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++) {
                if (prices[j] - prices[i] > profit) {
                    profit = prices[j] - prices[i];
                }
            }
        }

        if(profit<=0){
            return 0;
        }
        return profit;

    }

    public static int maxProfit2(int[] prices)
    {
        int maxProfit=Integer.MIN_VALUE;
        int minValue=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minValue=Math.min(prices[i],minValue);
            int profit = prices[i]-minValue;
            maxProfit=Math.max(maxProfit,profit);
        }

        if(maxProfit<=0){
            return 0;
        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int arr[]={10, 19, 1, 30, 32};
        System.out.println(maxProfit(arr));
        System.out.println(maxProfit2(arr));
    }
}
