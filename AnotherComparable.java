
/**
 * Gives objects another way to be compared to other objects beyond 
 * just the Comparable method method compareTo.  
 * 
 * @author Karina Patel 
 * @version October 27, 2014
 */
public interface AnotherComparable
{
    /**
     * Compares two objects in a different way than compareTo does. 
     * 
     * @param obj the other object
     * 
     * @return = 0 if two objects are sufficiently equal,
     *           > 0 if "this" object is determined to be greater than obj or 
     *           < 0 if "this" object is determined to be less than obj 
     */
    int compareAnotherWay(Object obj);
}
