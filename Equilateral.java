
/**
 * Class Equilateral extends the concrete class Triangle and 
 * focuses on properties of an equilateral triangle such as 
 * perimeter, area, and side length. 
 * 
 * @author Karina Patel 
 * @version October 31, 2014 
 */
public class Equilateral extends Triangle 
{
    
    /**
     * Constructor for Equilateral triangle with a given name and side length  
     * 
     * @param name name of the triangle, probably vertices 
     * @param s the length of one of the sides of the equilateral 
     *  
     */
    public Equilateral(String name, double s)
    {
      super(name, s, s, s);
    }
    
    /**
     * Constructor for unit equilateral object of class Equilateral. 
     * "this" equilateral has a length of one.
     *
     * @param name name of the equilateral  
     */
    public Equilateral(String name) 
    {
        this(name,1);
    }
    
    /**
     * Sets the length of the three equivalent sides 
     *
     * @param sideA the length of a side of an equilateral triangle 
     */
    public void setSideA(double sideA)
    {
        orderSides(sideA, sideA, sideA);
    }
    
    /**
     * Sets the length of the three equivalent sides 
     *
     * @param sideB the length of a side of an equilateral triangle 
     */
    public void setSideB(double sideB)
    {
        orderSides(sideB, sideB, sideB);
    }
    
    /**
     * Sets the length of the three equivalent sides 
     *
     * @param sideC the length of a side of an equilateral triangle 
     */
    public void setSideC(double sideC)
    {
        orderSides(sideC, sideC, sideC);
    }
    
    
}
