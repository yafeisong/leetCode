package com.lc;

public class Lc121 {
	
	public static void main(String[] args) {
		int [] prices = {2,4,1};
		System.out.println(maxProfit(prices));
	}
    public static int maxProfit(int[] prices) {
    	int buy = Integer.MAX_VALUE,sale = 0,tmpBuy = 0,tmpSale=0 ;
        for(int priceIndex =0;priceIndex<prices.length;priceIndex++){
        	int price = prices[priceIndex] ;
        	if(price<buy){
        		tmpBuy = price ;
        		tmpSale = 0 ;
        		continue;
        	}
        }
    	return sale-buy<0?0:(sale-buy) ;
    }
}
