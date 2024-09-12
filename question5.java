
import java.util.Scanner;
public class question5
{

    public static void main(String[] args)
    {
        Scanner input= new Scanner (System.in);
        
        System.out.println("Enter a positive, three digit number: ");
        int number = input.nextInt();
        
        
        int firstdigit= number/100;
        int seconddigit= number %100 /10;
        int thirddigit= number % 10;
        
        int total= firstdigit+ seconddigit+ thirddigit;
        
        
        
        
        System.out.println("The sum of the digits of " + number + " is " + total);
        
        
        
        
        
        
        
        
    }

}
