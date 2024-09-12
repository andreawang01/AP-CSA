
import java.util.Scanner;

public class question3
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner (System.in);
        System.out.println("Enter a number of Days");
        int NDays= input.nextInt();
        
        
        int DaystoWeeks= NDays/7;
        int RDays= NDays % 7;
         
        System.out.println( NDays + " days is equal to " + DaystoWeeks + " weeks, " + RDays + " days.");
        
        
        
        
        
        
    }

   
    }
