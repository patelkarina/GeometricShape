
/**
 * Class Rectangle extends the abstract class Polygon and focuses on
 * properties of a rectangle such as perimeter, area, and side
 * lengths. 
 * 
 * @author Karina Patel 
 * @version October 31, 2014 
 */
public class Rectangle extends Polygon 
{
    private double length;
    private double width;

    /**
     * Constructor for Rectangle with given name, length, and width 
     * 
     * @param name the name of the rectangle
     * @param length the length of the rectangle
     * @param width the width of the rectangle 
     * 
     */
    public Rectangle(String name, double length, double width)
    {
        super(name);
        setLength(length);
        setWidth(width);
    }

    /**
     * Sets the length of the rectangle.
     * 
     * @param len the length of the rectangle 
     * @throw IllegalArgumentException if length is <= 0
     *  
     */
    public void setLength(double len)
    {
        
        if (len <= 0)
        {
            throw new IllegalArgumentException("Invalid side lengths");
        }
        length = len;
    }
    

    /**
     * Gets the length of the rectangle.
     * 
     * @return the length of the rectangle 
     *  
     */
    public double getLength()
    {
        return length;
    }

    /**
     * Calculates the number of sides of the rectangle 
     * 
     * @return the number of sides of the rectangle 
     *  
     */
    public int numSides()
    {
        return 4;
    }

    /**
     * Determines if the rectangle is a regular rectangle. 
     *  
     * @return true if the four sides are nearly equal to each other, otherwise
     *          false 
     */
    public boolean isRegular()
    {
        return (isNearlyEqual(length, width));
    }

    /** 
     *  
     *  @return the area of the rectangle 
     */
    public double getArea()
    {
        return length * width;
    }


    /**
     * @return the perimeter of the rectangle 
     */
    public double getPerimeter()
    {
        return length + length + width + width;
    }

    /**
     * Sets the width of the rectangle.
     * 
     * @param wid the width of the rectangle 
     * @throw IllegalArgumentException if width is <= 0
     *  
     */
    public void setWidth(double wid)
    {
        
        if (wid <= 0)
        {
            throw new IllegalArgumentException("Invalid side lengths");
        }
        width = wid;
    }

    /**
     * Gets the width of the rectangle.
     * 
     * @return the width of the rectangle 
     *  
     */
    public double getWidth()
    {
        return width;
    }

    /**
     * Formats the class name, the rectangle's name, area, perimeter,
     * as well as the width and length or the rectangle. In addition, 
     * it includes whether it is a regular rectangle (square) and that 
     * is has four sides. 
     * 
     * @return formatted infromation about the rectangle 
     */
    public String toString()
    {
        String str = "\n\t\t\twidth = %8.5f\tlength = %8.5f" + 
            "\n\t\t\tregular: %b\tside count = %d";
        return super.toString() + 
        String.format(str, 
            getWidth(),
            getLength(),
            isRegular(), 
            numSides());

    }
    
    /**
     * Tests if the two rectangles are equal, within an EPSILON, 
     * which is defined in GeometricShape. 
     * 
     * @param obj rectangle object to test if similar 
     * 
     * @return true if the sides have the same length, otherwise
     *         false 
     */
    public boolean equals(Object obj)
    {
        if (obj instanceof Rectangle)
        {
            Rectangle rect = (Rectangle)obj;
            Double len = this.getLength();
            Double wid = this.getWidth();
            Double rectLen = rect.getLength();
            Double rectWid = rect.getWidth();
            return isNearlyEqual(len, rectLen) &&
            isNearlyEqual(wid, rectWid);
        }
        return false;
    }

    /**
     *  Compares current rectangle with the Object obj.
     *  
     *  @param obj Rectangle object with which to compare
     *  
     *  @return 0  if the two rectangles have the same length sides. 
     *        > 0  determined by comparing the two longest sides;
     *             if equal, compare medium length sides; 
     *        < 0  determined by comparing the two longest sides; 
     *             if equal, compare medium length sides; 
     *       -999  if obj is not a Rectangle    
     *  
     */
    public int compareTo(Object obj)
    {
        if (obj instanceof Rectangle)
        {
            Rectangle rec = (Rectangle)obj;
            if (this.equals(rec))
            {
                return 0;
            }
            Double a = this.getLength();
            Double b = this.getWidth();
            Double recA = rec.getLength();
            Double recB = rec.getWidth();
            if (! isNearlyEqual(a, recA))
            {
                if ( a < recA)
                {
                    return -1;
                }
                return 1;
            }

            if (! isNearlyEqual(b, recB))
            {
                if (b < recB)
                {
                    return -1;
                }
                return 1;
            }
        }
        return -999;
    }   

}
