package com.snake;

public class ExactWinPosition {

	public static final int Ladder=1;
	public static final int Snake = 2;
        public static void main(String[] args) {
		//constants
	        int position=0; 
		int winPosition=100;
		System.out.println("Welcome Player number 1");
		//Loop Execute until we rich to the win position
	        while(position != Win_Position)
	           {
		      int diceRoll=(int) ((Math.random() * 10) % 6 +1);
		
		      //For checking whether there is ladder or snake
                        int option=(int)((Math.random() * 10) % 3);	
		    switch(option) 
		      {
		         case Ladder : position+=dice_roll;
		                       break;

		         case Snake  : position-=dice_roll;
  		                       break;
		             default : 
		      }
		

    	}			
		System.out.println("Player Win the game at position " +position);

}




}


