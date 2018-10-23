
package circle;

import java.text.NumberFormat;

public class CalculateCircle
{  
    //private instance variable, not accessible from outside this class
    private double radius;
    private double area;
    private double circumference;
    
    private static int objectCount = 0;
  
    //default constructor of the circle class 
    public CalculateCircle() 
    {
        radius = 0;       
        objectCount++; // update static counter   
    }
     
    //2nd constructor of the circle class
    public CalculateCircle(double radius, double circumference, double area)   
    { 
        this.radius = radius;
        this.area = area;
        this.circumference = circumference;
    }

    // Setter for instance variable radius
    // "this.radius" refers to the instance variable
    // "radius" refers to the method's argument
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }
    
    public void setCircumference(double circumference)
    {
        this.circumference = circumference;
    }
    
    public void setArea(double area)
    {
        this.area = area;
    }

    public double getCircumference()
    {
        circumference = Math.PI * Math.pow(radius,2);
        return circumference;
    }
    
    public String getFormattedCircumference()
    {
        String numberString = this.formatNumber(circumference);
        return numberString;
    }
    
    public double getArea()
    {
        area = 2 * Math.PI * radius;
        return area;
    }
    
    public String getFormattedArea()
    {
        String numberString = this.formatNumber(area);
        return numberString;
    }
    
    private String formatNumber(double x)
    {
        NumberFormat number = NumberFormat.getInstance();
        number.setMaximumFractionDigits(2);
        String numberString = number.format(x);
        return numberString;
    }
    
    public static int getObjectCount()
    {
        return objectCount;
    }

    
}