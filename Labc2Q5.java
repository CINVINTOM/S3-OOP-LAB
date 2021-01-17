/*5.Create a class with a method that prints This is parent class" and its subclass with another method that prints "This is child class".
 Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2- method. child class by object of child class 
3 - method of parent class by object of child class*/


class Labc2Q5
{
    public static void main(String arg[])
    {
        Parent Ptobj = new Parent(); //Creating object of parent class
        Pobj.meth1();               // Calling method of parent class using object of parent
        Child Cdobj = new Child();   //Creating object of child class
        Cdobj.meth2();               //Calling method of child class using object of child
        Cdobj.meth1();               // Calling method of parent class using object of parent
    }
}
class Parent
{
    void method1()
    {
        System.out.println("This is parent class.");
    }
}

class Child extends Parent
{
    void method2()
    {
        System.out.println("This is child class.");
    }
}

