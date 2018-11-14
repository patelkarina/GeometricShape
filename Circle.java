
/**
 * Class Circle extends the abstract class GeometricShape and focuses on 
 * properties of a circle, such as radius, perimeter, and area. 
 * 
 * @author Karina Patel 
 * @version October 30, 2014 
 */
public class Circle extends GeometricShape 
{
    private double radius;

    /**
     * Constructor for objects of the circle class.  
     * 
     * @param name name of the circle
     * @param r    radius 
     *  
     */
    public Circle(String name, double r)
    {
        super(name);
        setRadius(r);
    }

    /**
     * Constructor for unit circle object of class Circle. * "this" circle has a length of one.
     *
     * @param name name of the circle 
     */
    public Circle(String name) 
    {
        this(name,1);
    }

    /**
     * Calculates the perimeter. 
     * 
     * @return the perimeter of the circle 
     */
    public double getPerimeter()
    {
        return 2.0 * Math.PI * getRadius();
    }

    /**
     * Calculates the area.   
     * 
     * @return the area of the circle 
     *  
     */
    public double getArea()
    {
        double r = getRadius();
        return Math.PI * r * r;
    }

    /**
     * Sets the length of the radius.
     * 
     * @param r the length of the new radius and r > 0
     * @throw IllegalArgumentException if radius is <= 0
     *  
     */
    public void setRadius(double r)
    {
        if (r <= 0)
        {
            throw new IllegalArgumentException("Needs to be positive");
        }
        radius = r;
    }

    /** 
     * Gets the length of the radius.
     * 
     * @return the radius of the circle 
     */
    public double getRadius()
    {
        return radius;
    }

    /**
     * Compares current circle with the Object obj. 
     *
     * @param obj Circle object with which to compare
     * @return 0  if the two circles have the same length radii within an EPSILON, 
     * which is defined in GeometricShape 
     * > 0 if "this" radius > than obj's radius
     * < 0 if "this" radius < obj's radius 
     * 
     */
    public int compareTo(Object obj)
    {
        if (obj instanceof Circle)
        {
            Circle circ = (Circle)(obj);
            Double thisRad = this.getRadius();
            Double circRad = circ.getRadius();
            if (isNearlyEqual(thisRad, circRad))
            { 
                return 0;
            }
            else if (thisRad > circRad)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else
        {
            return -999;
        }
    }

    /**
     * Tests if the two circles have radii that are equal, within an EPSILON, 
     * which is defined in GeometricShape. 
     * 
     * @param obj Circle object to test if its radius is "nearly equal" to "this" radius
     * 
     * @return true if the radii have "nearly equal" lengths; otherwise, 
     *         false 
     */
    public boolean equals(Object obj)
    {
        return (this.compareTo(obj) == 0);
    }

    /**
     * Formats the class name, the circle's name, area, perimeter, and radius for the circle.
     *
     * @return formatted information about the circle 
     */
    public String toString()
    {
        return super.toString() + 
        String.format("\n\t\t\tradius=%10.5f",this.getRadius());
    }

    /**
     * Tests if the cirlce is a polygon
     *
     * @return false
     */
    public boolean isPolygon()
    {
        return false;
    }

}
