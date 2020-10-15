package com.simulationgambling;
import java.util.Random;
public class GamblingSimulator {
	 public static final int STAKE=100;
     public static final int BET=1;

	public void winOrLose() 
	  {
		Random random= new Random();
		int value= random.nextInt(2);
      if (value==1) 
      {
    	  System.out.println("WIN");
      }
      else
           System.out.println("Lose");
        }
	
	public static void main (String args[])
	  {
		 GamblingSimulator gamblingSimulator=new GamblingSimulator();
		 gamblingSimulator.winOrLose();
		     
		  }

}
