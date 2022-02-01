package com.snake;

public class Dicecount_uc6{

	    public static final int Ladder = 1;
	    public static final int Snake = 2;

	    public static void main(String[] args) {
	        //constants
	        int position = 0;
	        int wiPosition = 100;
	        int counter=0;
	        System.out.println("Welcome Player number 1");
	        //Loop Execute until we rich to the win position
	        while (position < winPosition) {

	            int dice_roll = (int) ((Math.random() * 10) % 6 + 1);
	            counter++;
	            

	            //For checking whether there is ladder or snake
	            int option = (int) (Math.floor(Math.random() * 10) % 3);
	            switch (option) {
	                case Ladder:
	                    position += dice_roll;
	                    if (position > winPosition)
	                        position -= dice_roll;
	                    System.out.println("Current Position= "+position);
	                    break;

	                case Snake:
	                    position -= dice_roll;
                        System.out.println("Current Position= "+position);
                        break;
                        
	                default:

	            }

	        }
	        System.out.println("number of time dice roll= "+counter);
	        if (position == winPosition)
	            System.out.println("yeahh win");
	    }

	  }



