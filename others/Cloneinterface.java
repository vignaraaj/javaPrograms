package others;
// this is an example of deep cloning to make it shallow dont use clone() method to override
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// MyList Class implementing cloneable 
class MyList implements Cloneable {

    String name1;
    String name2;

    // Constructor 
    MyList(String name1, String name2)
    {
        this.name1 = name1;
        this.name2 = name2;
    }

    // To print the objects in the desired format 
    @Override
    public String toString()
    {
        return "Hello " + name1 + "," + name2 + "\n" ;
    }

    // Overriding the clone method 
    @Override
    protected MyList clone()
    {
        return new MyList(name1 , name2);
    }
}

class Cloneinterface {
    public static void main(String[] args)
    {
        // Create a list 
        List<MyList> original = Arrays.asList( new MyList("Sydney","Rose"), new MyList("Joe","Ian"));

        // Create an empty list 
        List<MyList> cloned_list = new ArrayList<MyList>();

        // Loop through the list and clone each element 
        for (MyList temp : original) {cloned_list.add(temp.clone());}  // uses the clone() method
        System.out.print(cloned_list);
    }
}
//The cloneable interface is used to clone the class objects.
//A class implementing a cloneable interface indicates that we can clone the objects of this class.
// The default implementation of the clone () method creates a shallow copy of the object while
// we can override the clone () method to create a deep copy.

//By implementing a cloneable interface for a class, we indicate that the objects of this class
// can be cloned using the clone () method of the Object class. If a class using the clone () method
// does not implement a cloneable interface then the exception ‘CloneNotSupportedException’ is thrown.


//Since Java arrays implement Cloneable interface by default, they need not be explicitly implemented.
// When the one-dimensional array is cloned, a deep copy of the array is generated.
// When a 2-dimensional array is cloned,then a shallow copy is made

