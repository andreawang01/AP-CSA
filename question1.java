import java.util.Scanner;
public class question1
{
    
    public static void main(String[] args)
    {
        Scanner input= new Scanner (System.in);
        
        System.out.println ("Enter Temperature in Celcius");
        double Celcius = input.nextDouble();
        
        double F= Celcius * 9.0/5 +32;
        
        System.out.println (Celcius + "°" + " Celcius" + " = " + F + " ° " + "Fahrenheit");
        
        
        input.close();
    
        
    }

}
