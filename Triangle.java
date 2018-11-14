
/**
 * Class Triangle extends the Polygon class and focuses on 
 * properties such as name, perimeter, and area. 
 * 
 * @author Karina Patel 
 * @version October 30, 2014 
 */
public class Triangle extends Polygon
{
    private double sideA;
    private double sideB;
    private double sideC;

    /**
     * Constructor for objects of class Triangle
     * @postcondition sideA >= sideB >= sideC
     * 
     * @param name name of the triangle, probably vertices
     * @param m  one of the side lengths of the triangle
     * @param n  another one of the side lengths of the triangle
     * @param p  last value of a side length of the triangle 
     * 
     */
    public Triangle(String name, double m, double n, double p)
    {
        super(name);
        orderSides(m, n, p);
    }

    /**
     * Calculate the area using Heron's formula  
     * 
     * @return the area of the triangle
     *  
     */
    public double getArea()
    {
        double s = getPerimeter() / 2.0;
        double a = getSideA();
        double b = getSideB();
        double c = getSideC();
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    /**
     * Checks to see whether the triangle is a regular triangle or not. 
     *  
     *  @return true if triangle is a regular triangle, otherwise
     *          false 
     */
    public boolean isRegular()
    {
        return (isNearlyEqual(sideA, sideB) && isNearlyEqual(sideB, sideC));
    }

    /**
     * Allows subclases to set sideA of a triangle 
     * 
     * @param anotherA the length of sideA of the shape 
     */
    public void setSideA(double anotherA)
    {
        orderSides(anotherA, sideB, sideC);
    }

    /**
     * Allows subclasses to set sideB of a triangle 
     * 
     * @param anotherB the length of sideB of the shape 
     */
    public void setSideB(double anotherB)
    {
        orderSides(sideA, anotherB, sideC);
    }

    /**
     * Allows subclasses to set sideC of a triangle 
     * 
     * @param anotherC the length of the sideC of the shape 
     *  
     */
    public void setSideC(double anotherC)
    {
        orderSides(sideA, sideB, anotherC);
    }

    /**
     * 
     * @return sideA
     */
    public double getSideA()
    {
        return sideA;
    }

    /**
     *
     * @return sideB
     *  
     */
    public double getSideB()
    {
        return sideB;
    }

    /**
     * 
     *  @return sideC
     */
    public double getSideC()
    {
        return sideC;
    }

    /**
     * Calculates the perimeter of the triangle   
     * 
     * @return the perimeter of the triangle
     *  
     */
    public double getPerimeter()
    {
        return sideA + sideB + sideC;
    }

    /**
     * Calculates the number of sides of the triangle   
     * 
     * @return the number of sides of the triangle 
     *  
     */
    public int numSides()
    {
        return 3;
    }

    /**
     * Formats the class name, the triangle's name, area, perimeter, and the three sides of 
     * of the triangle plus whether it is regular and that it has three sides. 
     * 
     * @return formatted information about the triangle 
     *  
     */
    public String toString()
    {
        String str = "\n\t\t\ta = %8.5f\tb = %8.5f\tc = %8.5f" + 
            "\n\t\t\tregular: %b\tside count = %d";
        return super.toString() +
        String.format(str, 
            getSideA(),
            getSideB(),
            getSideC(),
            isRegular(),
            numSides());
    }

    /**
     * Order the side lengths so that sideA >= sideB >= sideC
     * 
     * @postcondition sideA >= sideB >= sideC
     * 
     * @param a one of the side lenghts of the triangle
     * @param b another of the side lengths of the triangle
     * @param c last of the side lengths of the triangle
     * 
     * @throws IllegalArgumentException if the sides do not make a valid triangle 
     */
    public void orderSides(double a, double b, double c)
    {
        sideA = Math.max(a, Math.max(b, c));
        sideC = Math.min(a, Math.min(b, c));
        sideB = a + b + c - sideA - sideC;

        if (sideA >= sideB + sideC || sideC <= 0)
        {
            throw new IllegalArgumentException("Invalid side lengths");
        }
    }

    /**
     * Tests if the two triangles are equal, within an EPSILON, which is defined in GeometricShape. 
     * 
     * @param obj Triangle object to test if similar 
     * 
     * @return true if the sides have the same length, otherwise
     *         false 
     */
    public boolean equals(Object obj)
    {
        if (obj instanceof Triangle)
        {
            Triangle tri = (Triangle)obj;
            Double a = this.getSideA();
            Double b = this.getSideB();
            Double c = this.getSideC();
            Double triA = tri.getSideA();
            Double triB = tri.getSideB();
            Double triC = tri.getSideC();
            return isNearlyEqual(a, triA) &&
            isNearlyEqual(b, triB) &&
            isNearlyEqual(c, triC);

        }
        return false;
    }

    /**
     *  Compares current triangle with the Object obj.
     *  
     *  @param obj Triangle object with which to compare
     *  
     *  @return 0  if the two triangles have the same length sides. 
     *        > 0  determined by comparing the two longest sides;
     *             if equal, compare medium length sides; and 
     *             if equal, compare the shortest side until current triangle
     *             has a longer length than obj's comparable length.
     *        < 0  determined by comparing the two longest sides; 
     *             if equal, compare medium length sides; and 
     *             if equal, compare the shortest side until current triangle
     *             has a shorter length than obj's comparable length.
     *       -999  if obj is not a Triangle   
     *  
     */
    public int compareTo(Object obj)
    {
        if (obj instanceof Triangle)
        {
            Triangle tri = (Triangle)obj;
            if (this.equals(tri))
            {
                return 0;
            }
            Double a = this.getSideA();
            Double b = this.getSideB();
            Double c = this.getSideC();
            Double triA = tri.getSideA();
            Double triB = tri.getSideB();
            Double triC = tri.getSideC();
            if (! isNearlyEqual(a, triA))
            {
                if ( a < triA)
                {
                    return -1;
                }
                return 1;
            }

            if (! isNearlyEqual(b, triB))
            {
                if (b < triB)
                {
                    return -1;
                }
                return 1;
            }

            if (c < triC)
            {
                return -1;
            }
            return 1;
        }
        return -999;
    }   
}

