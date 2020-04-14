package leetcode;

class BuySellStocks {
    public int maxProfit(int[] prices) {
        // The idea is simple to find the local minima and local maxima
        int res = 0;

        int buy=0;
        int sell=0;
        int N = prices.length - 1;
        int day=0;

        while(day<N){
            while(day<N && prices[day+1]<=prices[day]) day++;
            buy = prices[day]; System.out.println("buy @" + buy);

            while(day<N && prices[day+1]>=prices[day]) day++;
            sell = prices[day]; System.out.println("sell @" + sell);

            res+= (sell-buy);
        }

        return res;

    }
}