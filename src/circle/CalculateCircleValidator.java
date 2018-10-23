
package circle;

import java.util.Scanner;

public class CalculateCircleValidator
{
    public static String getString(Scanner sc, String prompt)
    {
        String s = null;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.isEmpty())
                System.out.println("Error! An entry is required. Try again.");
            else
                isValid = true;
        }
        return s;
    }
    
    public static String getString(Scanner sc, String prompt, String y, String n)
    {
        String s = null;
        boolean isValid = false;
        while (!isValid)
        {
            s = getString(sc,prompt);
            if (s.equalsIgnoreCase("y") ||s.equalsIgnoreCase("n"))
                isValid = true;
            else
                System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
        }
        return s;
    }

   
   public static double getDouble(Scanner sc, String prompt)
    {
        double d = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(Scanner sc, String prompt,
    double min, double max)
    {
        double d = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            d = getDouble(sc, prompt);
            if (d <= min)
                System.out.println(
                    "Error! Number must be greater than " + min + ".");
            else if (d >= max)
                System.out.println(
                    "Error! Number must be less than " + max + ".");
            else
                isValid = true;
        }
        return d;
    }
}