
import java.util.Scanner;
public class question2
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        Scanner input= new Scanner (System.in);
        
        System.out.println("Enter Weight in kg");
        double weight= input.nextDouble();
        
        System.out.println("Enter Height in m");
        double height = input.nextDouble();
        
        double BMI= weight/ (height * height);
        
        System.out.println( "A " + height + "m tall adult who weighs " + weight + " kg has a BMI of" + BMI );
        
        input.close();
        
        
        
        
        
        
    }


}
