// Calculating the period between two time interval
// Kamva Poswa
// PSWKAM001
// 27 July 2024

import java.util.Scanner;

class CalculateDuration
{
   public static void main(String[] args)
   {
   // declarring the time variables before assigning them
   
      Time time1;
      Time time2;
      
      Scanner input = new Scanner(System.in);
   // getting strings from the user
      System.out.println("Enter time A:");
      String t1 = input.next();
      
      System.out.print("Enter time B:\n");
      String t2 = input.next();
      
   //Asigning the variables declared to the new time objects
   
      time1 = new Time(t1);
      time2 = new Time(t2);
      
   // getting the period between the two times
   
      Duration period = time2.subtract(time1);
      
      double min = period.intValue("minute");
      
      System.out.println("The time "+ time2.toString() + " occurs "+ (int)min + " minutes after the time "+ time1.toString() +".");
      
   }
   
}