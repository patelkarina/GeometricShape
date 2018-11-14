
/**
 * Class IsoscelesRightTriangle extends the concrete Triangle class and focuses
 * on properties of an IsoscelesRightTriangle such as perimeter, area, and 
 * side lengths. 
 * 
 * @author Karina Patel 
 * @version October 31, 2014 
 */
public class IsoscelesRightTriangle extends Triangle
{

    /**
     * Constructor for the objects of class IsoscelesRightTriangle
     * 
     * @param name name of the triangle, probably vertices 
     * @param s side length of the triangle's identical side lengths 
     * 
     */
    public IsoscelesRightTriangle(String name, double s)
    {
        super(name, s * Math.sqrt(2), s, s);
    }

    /**
     * Sets the length of the hypotenuse and resets the two equivalent sides. 
     * 
     * @param anotherA the length of the hypotenuse of the isosceles right triangle 
     */
    public void setSideA(double anotherA)

    {
        double side = anotherA * Math.sqrt(0.5);
        orderSides(anotherA, side, side);
    }

    /**
     * Sets the length of the two equivalent sides and recalculates the hypotenuse 
     * 
     * @param anotherB the length of one of the legs of the isosceles right triangle 
     */
    public void setSideB(double anotherB)

    {
        orderSides(anotherB*Math.sqrt(2), anotherB, anotherB);
    }

    /**
     * Sets the length of the two equivalent sides and recalculates the hypotenuse 
     * 
     * @param anotherC the length of one of the legs of the isosceles right triangle 
     */
    public void setSideC(double anotherC)

    {
        setSideB(anotherC);
    }
}
