/* Question 1: Write a java class having overloaded methods to calculate area of a rectangle and circle  */

class Labc2Q1
{
    public static void main(String arg[])
    {
        areas obj = new areas();
        obj.area(1);
        obj.area(2,4);
    }
}
class areas
{
    double A;
    void area(double r)
    {
        A = (r*r*22)/7;
        System.out.println("Area of the circle is "+A);
    }
    void area(double l,double b)
    {
        A = l*b;
        System.out.println("Area of the reactangle is "+A);
    }
}
