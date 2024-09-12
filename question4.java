import java.util.Scanner;
public class question4
{
    // instance variables - replace the example below with your ow
    public static void main(String[] args)
    {
        Scanner input= new Scanner (System.in);
        
        System.out.println("Number of units you're buying");
        int number = input.nextInt();

        System.out.println("Price per unit");
        double price= input.nextDouble();
        
        System.out.println("Tax rate");
        double rate= input.nextDouble();
        
        double total= number * price * (1+ rate/100);
        
        System.out.println ("Purchasing " + number + " units at $" + price +
        " with " + rate + "% tax will cost $" + total);
    
        
    }

}   