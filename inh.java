class inh
{
    public static void main(String[] args)
    {
        Parent Pobj = new Parent(); //Creating object of parent class
        Pobj.meth1();               // Calling method of parent class using object of parent
        Child Cobj = new Child();   //Creating object of child class
        Cobj.meth2();               //Calling method of child class using object of child
        Cobj.meth1();               // Calling method of parent class using object of parent
    }
}
class Parent
{
    void meth1()
    {
        System.out.println("This is parent class.");
    }
}

class Child extends Parent
{
    void meth2()
    {
        System.out.println("This is child class.");
    }
}

