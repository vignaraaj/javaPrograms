package oops;

class Base {
    //if there is a  Static method in base class it will hide the same method in subclass
    //both the methods in super and subclasses should be static to avoid overriding here
    public static void display() {
        System.out.println("Static or class method from Base");
    }

    // Non-static method which will be overridden in derived class
    public void  print1() {
        System.out.println("Non-static or Instance method from Base");
    }
}
// Subclass
class Derived extends Base {

    // This method is hidden by display() in Base, we cant make this method which is static method in base a non-static method, java throws error.
    public static void display() {
        System.out.println("Static or class method from Derived");
    }

    // This method overrides print() in Base
    public void  print1() {
        System.out.println("Non-static or Instance method from Derived");
    }
}
// Driver class
class Test {
    public static void main(String args[ ]) {
        Base obj1 = new Derived();
        obj1.display();
        // Here overriding works and Derived's print() is called
        obj1.print1();
        Derived obj2 = new Derived();
        obj2.display();
        obj2.print1();


    }
}

