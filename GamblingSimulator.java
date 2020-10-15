package com.simulationgambling;
import java.util.Random;
public class GamblingSimulator {
	 public static final int STAKE=100;
     public static final int BET=1;
     public static final int WIN=50;
     public static final int LOSE=51;
    int i;
        
     int random=(int)Math.floor(Math.random()*10)%2;
	public void winOrLose() 
	 {
		for (i=1;i<=100;i++) 
		   { 
	  
	 switch(random)
		{
		case WIN:
           System.out.println("***WIN***");
		break;
         
		case LOSE:  
           System.out.println("***Lose***");
            break;
		   }
	   }
       }
	  
	public static void main (String args[])
	  {
		 GamblingSimulator gamblingSimulator=new GamblingSimulator();
		 gamblingSimulator.winOrLose();
		     
		  }

}
