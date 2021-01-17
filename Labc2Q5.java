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

