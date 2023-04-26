package oops;

//example of abstract class that have method body
abstract class Scooty{
    Scooty(){
        System.out.println("this is scooty");
    }
    abstract void run();
}
class Streak extends Scooty{
    void run(){
        System.out.println("Engine started");
    }
}
abstract class Bike{
    //constructor
    Bike(){System.out.println("bike is created");}
    //abstract method
    abstract void run();
    //non abstract method
    void changeGear(){System.out.println("gear changed");}
}

class Honda extends Bike{
    void run(){System.out.println("running safely..");}
}
class main{
    public static void main(String args[]){
        Honda obj = new Honda();//static binding
        obj.run();
        obj.changeGear();

        Bike obj1 = new Honda();//dynamic binding
        obj1.run();
        obj1.changeGear();
        Scooty sc = new Streak();
        sc.run();
    }
}
