/* Question 1: Write a java class having overloaded methods to calculate area of a rectangle and circle  */
class methoverload
{
    public static void main(String[] args)
    {
        Areas obj = new Areas();
        obj.Area(1);
        obj.Area(2,4);
    }
}
class Areas
{
    double A;
    void Area(double r)
    {
        A = (r*r*22)/7;
        System.out.println("Area of the circle is "+A);
    }
    void Area(double l,double b)
    {
        A = l*b;
        System.out.println("Area of the reactangle is "+A);
    }
}