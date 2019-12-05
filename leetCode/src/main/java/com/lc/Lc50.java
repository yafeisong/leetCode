package com.lc;

public class Lc50 {
	
	public static void main(String[] args) {
		Lc50 lc = new Lc50();
		System.out.println(lc.myPow(2,-2147483648));
	}
	
    public double myPow(double x, int n) {
    	
        double res = 1.0;
        for(int i = n; i != 0; i /= 2){
            if(i % 2 != 0){
                res *= x;
            }
            x *= x;
            System.out.println(res+":"+x);
        }
        return  n < 0 ? 1 / res : res;
    }
}
