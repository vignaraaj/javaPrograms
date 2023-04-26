package others;
/*
generics come under collection
what is the need of collections?--> because arrays have some drawbacks
those are continuous memory ,unused memory is wasted and
only applicable to homogeneous elements(same data type).

collections too , need some features of array because arrays are safe because they contain only same type
E.g. -->   consider Treeset this type of collection can contain any dataset,
            but it tries to order everything (ascending order)
            when we tried to add int and str in this Treeset collection
            it shows compile time error so in this case arrays were better
            to make collections have the features of arrays we have generics
*/
// why generics?-->
// to provide type safety and to avoid explicit type casting

import java.util.ArrayList;

/*
 the datatype mentioned after  any collections shd not be a primitive datatype
 since collection is a collection of objects it won't accept primitive datatype,
 so it can be wrapper classes or user defined classes.

 user defined classes --> e.g.--> ts.add(e1); [no error because e1 is the object of our user defined class]
 but if we tried to add or do any method with non object of the mentioned class error shows
 same like if Integer is mentioned str value shd not be given it shows error
 */
public class Generics {
    public static void main(String[] args) {
        Generics g = new Generics();

        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("vk");
        al1.add("vi");
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(20);
        al2.add(19);

        g.display(al1); // w/o <?> we shd need to create separate methods for <Integer> and <String> (uses overloading here)so to cut short it we use <?> which is referred as wildcard(accepts any datatype)
        g.display(al2);
    }
        public void display (ArrayList<?>  al){  // accepting any datatype
            System.out.println(al);
        }
        /*
            can give w/o <?> also o/p will be same
            the use of <?> is we could give
            ArrayList<? extends Number>
            where only Number type can be passed -->int ,byte ,short,float,double
            for e.g. interest amount in bank account
            **** one exception for generics is we can give extend interface here
            e.g. ArrayList<? extends progRule>
            consider progRule is interface here
         */

}
