package com.snake;

public class StartSnakeladder {

	public static final int Ladder=1;
	public static final int Snake = 0;
    public static void main(String[] args) {
		//constants
		int position=0;
	    int max=6,min=1;
		int dice_roll=(int) (Math.random()*max-min+1)+min;
		System.out.println("Player Rolling Die gives: " +dice_roll);
		int option=(int)(Math.random()*10)%3;	
		System.out.println("Player check for option "+option );
		switch(option) {
		
		case Ladder : position+=dice_roll;
		              break;
		case Snake  : position-=dice_roll;
		             break;
		    default :
                     
		}
		System.out.println("Possition="+position);
							
		
	}

}
