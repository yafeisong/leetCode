package com.lc;

public class Lc190 {

	public static void main(String[] args) {
		Lc190 lc = new Lc190() ;
		System.out.println(lc.reverseBits(69516234) );
	}
	
    public int reverseBits(int i) {
//    	String bin = Integer.toBinaryString(n);
//    	StringBuffer sb = new StringBuffer(String.valueOf(n));
//    	String rever = sb.reverse().toString();
//    	return 
    	
        i = (i & 0x55555555) << 1 | (i >>> 1) & 0x55555555;
        i = (i & 0x33333333) << 2 | (i >>> 2) & 0x33333333;
        i = (i & 0x0f0f0f0f) << 4 | (i >>> 4) & 0x0f0f0f0f;
        i = (i << 24) | ((i & 0xff00) << 8) |
            ((i >>> 8) & 0xff00) | (i >>> 24);
        return i;
    	
    }
}
