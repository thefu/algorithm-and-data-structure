/**
 * 股票买卖最大利润
 */
public class MaxProfit {
    public double maxProfit (double[] prices){
        double max = 0;
        for(int i = 0; i < prices.length-1; i++){
            double size = 0;
            for(int j = 0; j < prices.length; j++){
                if((prices[i] - prices[j]) > size ){
                    size = prices[i] - prices[j];
                }
            }
            if(size > max){
                max = size;
            }
        }
        return max;
    }
}
