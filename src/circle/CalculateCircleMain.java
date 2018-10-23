
package circle;

import java.util.Scanner;

 public class CalculateCircleMain {
  
    public static void main(String[] args) 
    
    {
        // display a welcome message
        System.out.println("Welcome to the Circle Tester \n");
        
        // create scanner object for keyboard input
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y"))
        {
            // ask the user to input circle radius Validator
            double radius = CalculateCircleValidator.getDouble(sc,
                "Enter radius: ", 0, 1000);
            
            System.out.println();

            //Create the circle object and set its fields
            CalculateCircle c1 = new CalculateCircle();
            c1.setRadius(radius);
            
            //get the circumference and area data
            c1.getCircumference();
            c1.getArea();
                                
            // Display circle information
            System.out.println("Area is " + c1.getFormattedArea());
            System.out.println("Circumference is " + c1.getFormattedCircumference());

            // see if the user wants to continue
            choice = CalculateCircleValidator.getString(sc, "Continue? (y/n): ", "y", "n");
            System.out.println();
        }
        
        int count = CalculateCircle.getObjectCount();
        System.out.println("Goodbye. You created " + count + " Circle object(s).");
    }
}