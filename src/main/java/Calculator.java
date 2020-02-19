import java.io.IOException;
import java.util.Scanner;
public class Calculator {



   public double rectangle(double width, double length){
       double total = width * length;
       return total;
   }

    public static void main(String []args)
    {   double w,l;
        Calculator r = new Calculator();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Value for width:");
            w = sc.nextDouble();
            System.out.println("Value for length");
            l = sc.nextDouble();
            System.out.println("Area :"+ r.rectangle(w,l));
        }
        catch(Exception e){

            System.out.println(e.getMessage());
        }

    }

}

