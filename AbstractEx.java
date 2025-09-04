package InterfaceAbstract;
// Java Program to Illustrate Abstract Class
// code sourced from https://www.geeksforgeeks.org/abstract-classes-in-java/?ref=lbp

// Class 1
// Abstract class
abstract class Base {
    static int w=5;
    // Constructor of class 1
    Base()
    {
        // Print statement
        System.out.println("Base Constructor Called");
    }

    // Abstract method
    public abstract void fun();
    /* public abstract void extrafun(){

     }*/ //abstract method cant have body and non-abstract class cant ave abstract func
    // non-abstract method. abstract class can have no abstract function
    public void nofun()
    {
        System.out.println("no abstract of astract class");
    }
    // final method cant be overriden
    final void lastfun()
    {
        System.out.println("Base lastfun() called");
    }
    public static void staticfun()
    {
        // Print statement
        System.out.println("independent Fun");
    }
}

// class extending from abstract class
class Derived extends Base {

    // Constructor of class2
    Derived()
    {super();
        super.nofun();
      //  super.fun();
        super.lastfun();
        super.staticfun();
        System.out.println("Derived Constructor Called");
    }

   /* void nofun(){
        System.out.println("overriding non abstract ");
    }*/
    // Method of class2
    // void fun() // error cz the access specifier is changing from pulic to non-specified ie stronger to weaker
    public void fun(){
        System.out.println("Derived fun() called");
    }
}

/*class ExtraDrive extends Base
{
    int y=0;
    public void liveLetLive()
    {

    }
}*/ // have to declare the class abbstract if not implementing abstract function of its parent class

// Main class
class AbstractEx {

    // Main driver method
    public static void main(String args[])
    {
        //reference of abstract class
        Base b;
        //trying to create object of abs class - not allowed
        // b=new Base();
        // Creating object of class 2
        Derived d = new Derived();
        b=d;
        b.fun();
        b.lastfun();
        b.nofun();
        b.staticfun();
        d.fun();
        Base s = new Base() {             //this is a class , we call it as ANNONYMOUS class
            @Override
            public void fun() {
                System.out.println("zrk");
            }
        };
        s.fun();
       s.nofun();
        s.lastfun();
        s.staticfun();

        System.out.println(s.w);

    }
}


// return new Complex (real - m.real, imag - m.imag)   //this is annonymous object