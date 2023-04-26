package Collection;
import java.util.ArrayList;
public class Arrlist {
    String name;
    String city;

    public Arrlist(String name, String city){ //Access specifiers on Java constructors are useful for controlling who can create new objects.
        this.name = name;
        this.city = city;
    }
    public String toString(){ //overriding the  internally executable toString() to print the values inside object if this is not done objects hashcode will be printed
        return name+" "+city;
    }  //overriding the toString()
    public static void main(String[] args) {
        Arrlist e1=new Arrlist("Vignu","Chennai");
        ArrayList al=new ArrayList();
        al.add(e1);  // here wew pass an object to store inside our array
        System.out.println(al.get(0));//prints the first object
        System.out.println(e1);
        System.out.println();
        /*
        to access particular attribute inside the object we can't use arraylist[al.get(0).name gives an error]
         when an object is added to an arraylist it is always treated as the Object class's object
        so typecasting must be done back with original class to make sure it is  Arrlist's object, so we can  access a particular attribute
        */
        Object o = al.get(0);           // al.get(0)--> returns an object so store it a variable 'o' whose datatype is object
        Arrlist aa = (Arrlist)o;    //typecasting the object 'o' explicitly and storing it in another variable aa whose datatype is Arraylist so that from there we could access again a particular attribute
        Arrlist ab = (Arrlist)al.get(0);
        System.out.println(aa.name+" "+aa.city);
        System.out.println(ab.name+" "+ab.city);
    }
}
// only with the help of explicit typecast we could get the particular attribute
// that's why arrays are safe
// both these makes a drawback for collections
//so overcome this generics came into the part