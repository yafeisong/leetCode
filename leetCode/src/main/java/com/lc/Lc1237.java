package com.lc;

import java.util.List;

public class Lc1237 {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        return null;
    }
    
    class CustomFunction {
    	private int funcation_id ;
    	public CustomFunction(){
    		
    	}
    	public CustomFunction(int function_id){
    		this.funcation_id = function_id ;
    	}
        public int f(int x, int y){
        	int ans =0 ;
        	switch (funcation_id) {
			case 0:
				ans = x +y;
				break;
			case 1:
				ans = x*y;
				break;
			default:
				break;
			}
        	return ans ;
        }
    };
}
