package com.snake;

public abstract class TillWinPosition {

	public static final int Ladder = 1;
        public static final int Snake = 2;

        public static void main(String[] args) 
        {
           //constants
           int position = 0;
           int winPosition = 100;
           System.out.println("Welcome Player number 1");

           //Loop Execute until we rich to the win position
           while (position < Win_Position)
             {
                int dice_roll = (int) ((Math.random() * 10) % 6 + 1);

            	//For checking whether there is ladder or snake
           	 int option = (int) (Math.floor(Math.random() * 10) % 3);
                 switch (option) {
     	           case Ladder:
                 	       position += diceRoll;
                               if (position > winPosition)
                  	       position -= diceRoll;
                               break;

                   case Snake:
                   	       position -= diceRoll;
                	       break;

                      default:

                  }

              }
               if (position == winPosition)
               System.out.println("yeahh win");
    }

  }

