package com.lc;

public class Lc48 {
    public void rotate(int[][] matrix) {
        
    	int tmp = 0 ;
    	for(int index =0;index <matrix.length/2;index ++){
    		int roundLenght = matrix.length-index * 2;
    		for(int innderIndex = 0 ;innderIndex<roundLenght;innderIndex++){
    			int curr = matrix[index][innderIndex];
//    			int bc = roundLenght ;
//    			if((index==0&&innderIndex>0 ) || (innderIndex == roundLenght-1) ){
//    				bc = 0- roundLenght ;
//    			}
    			int bc_x = Integer.MIN_VALUE ,bc_y = Integer.MIN_VALUE;
    			while(bc_x!=index && bc_y !=innderIndex){
    				if (bc_x==bc_y && bc_x ==Integer.MIN_VALUE){
    					bc_x = index ;
    					bc_y = innderIndex ;
    				}
    				int next_x = -1,next_y = -1 ;
    				if(bc_y == index){
    					next_x = roundLenght-1;
    					next_y = roundLenght-1-bc_y ;
    				}else if (bc_x == roundLenght-1){
    					next_y = roundLenght-1 ;
    					next_x = roundLenght-1-bc_y;
    				}else if (bc_y == roundLenght-1){
    					next_x = index;
    					next_y = bc_x;
    				}else if (bc_x == index){
    					next_y = roundLenght-1 ;
    					next_x = roundLenght-1-innderIndex;
    				}
    			}
    		}
    	}
    }
}
