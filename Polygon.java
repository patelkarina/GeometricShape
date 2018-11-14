
/**
 * Abstract class Polygon class focuses on properties of a polygon such as 
 * the number of sides of the shape, the number of sides, and
 * whether or not the shape is regular or not. 
 * 
 * @author Karina Patel  
 * @version October 31, 2014 
 */
public abstract class Polygon extends GeometricShape 
{
    /**
     * Constructor for objects of the Polygon class.  
     * 
     * @param name name of the polygon
     *  
     */
    public Polygon(String name)
    {
        super(name);
    }
    
    /**
     * Determines if the polygon is regular
     * @return true if the polygon is a regular polygon 
     */
    public boolean isPolygon()
    {
        return true;
    }
   
    /**
     * Determines if the polygon is a regular polygon. 
     *  
     * @return true if the sides are nearly equal to each other, otherwise
     *         false 
     */
    public abstract boolean isRegular();
    
    /**
     * Determines the number of sides of the polygon
     * 
     * @return the number of sides of the polygon
     *  
     */
    public abstract int numSides();
    
}
