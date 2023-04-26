package oops;/*
STATIC BINDING AND DYNAMIC BINDING
 */

class Animal{
    void eat(){System.out.println("animal is eating...");}
}
class Dog extends Animal{
    void eat(){System.out.println("dog is eating...");}
    public static void main(String args[]){
        Animal a=new Dog();
        a.eat();
        Dog b=new Dog();
        b.eat();
        Animal c=new Animal();
        c.eat();
        //Dog d=new Animal();//gives incompatible type error Animal can't be converted to Dog
        //d.eat();
    }
}