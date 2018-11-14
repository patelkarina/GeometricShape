
/**
 * Determines if two numbers are close enough to each other to be considered equal. 
 * 
 * @author Karina Patel 
 * @version October 27, 2014 
 */
public interface Nearable
{
    /**
     * Determines if two numbers are within an epilson difference of each other. 
     * 
     * @param obj1 an object to be tested as close to another object
     * @param obj2 an object to be tested as close to another object
     * @return true if the numbers are close to each other, otherwise
     *         false 
     *        
     */
    boolean isNearlyEqual(Object obj1, Object obj2);
}
