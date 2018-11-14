
/**
 * Class Square extends the concrete class Rectangle, and focuses on the properties of 
 * a square such as area, perimeter, width, and length. 
 * 
 * @author Karina Patel 
 * @version October 31, 2014 
 */
public class Square extends Rectangle
{
    /**
     * Constructor for Squre with a given name and side length  
     * 
     * @param name name of the square
     * @param s the sideLength of the square
     *  
     */
    public Square(String name, double s)
    {
        super(name, s, s);
    }
    
    /**
     * Constructor for unit square object of class Square. * "this" square has a length of one.
     *
     * @param name name of the square
     */
    public Square(String name) 
    {
       super(name,1, 1);
    }

    /**
     * Sets the length of the square.
     * 
     * @param len the length of the new length and len > 0
     * @throw IllegalArgumentException if len is <= 0
     *  
     */
    public void setLength(double len)
    {
        super.setLength(len);
    }

    /**
     * Sets the width of the square.
     * 
     * @param wid the width of the square 
     *  
     */
    public void setWidth(double wid)
    {
        super.setWidth(wid);
    }

}
