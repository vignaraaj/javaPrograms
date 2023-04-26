package StringManipulation;

/*
stringbuffer,stringbuilder(both are similar,they share common methods)
the difference is stringbuffer is threadsafe and all methods are synchronised(can't have many threads one shd wait upon its completion)
but string builder is not threadsafe and all methods are not synchronised
stringbuilder is used in multithreaded environment

string is immutable
string is literal and also object
string can be created with or without new keyword but string buffer and string builder should be
instantiated with new keyword to create their respective objects

creates an object(string) when manipulalting it
new string object is created and done manipulations there
whereas the old object is destroyed by garbage collector
*/
public class StringDemo {
    public static void main(String[] args) {
        StringDemo sd=new StringDemo();
        String[] names={"cat","dog","rat"};
        sd.mergestring(names);
    }
    public void mergestring(String [] names){
        String merge_names="";
        for (String name:names) {
                                /*
                                    for each loop(could be used in arrays and collections)
                                     only applicable for forward direction(left to right)unidirectional
                                 */
            System.out.println(name);
            merge_names += name;
            System.out.println(merge_names.hashCode());
        }
        System.out.println(merge_names);

                    /*     since string is immutable every time we manipulate the string each time
                    the object is destroyed and pointed towards the new object
                    though the old object gets destroyed by the garbage collector it wastes the memory a lot
                    to improvise this we brought in the concept of string builder and string buffer
                    */


        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        //StringBuilder sb = new StringBuilder("");
        StringBuffer sb = new StringBuffer("");//passes an empty string to the constructor
        for (String name1:names) {
            sb.append(name1);
            //string buffer has the various methods like append,insert,replace,reverse
            //sb.insert(1,'v');(inserted in 1st position)
            //sb.replace(0,5,"vignu");(index from 0 to 4 is replaced)
            //sb.reverse();(w/0 this strings can be reversed in a long process e.g converting it into charArray)
            //sb.deleteCharAt(3); 3rd index is deleted
            System.out.println(sb.hashCode());
        }
        System.out.println(sb);

        /*
            To prove that string buffer didn't create any new objects we could make use of hashcode() function
            which tells the memory of the objects
            for object sb there wouldn't be any change in hashcode which means it uses the same object's memory
            but for merge_names each and every time we update the string hashcode(memory) differs (uses different objects)
         */
    }
}
/*
String builder and String buffer both are mutable which means
both updates on same object while manipulating them check it using hashCode()
 */

/*
String Interning is a method of storing only one copy of each distinct String Value, which must be immutable.
By applying String.intern() on a couple of strings will ensure that all strings having the same contents share the same memory
 */

/*
String s1 = "abcde";
String s2 = new String("abcde");
String s3 = "abcde";
All are valid, but have a slight difference.
s1 will refer to an interned String object.
This means, that the character sequence "abcde" will be stored at a central place,
and whenever the same literal "abcde" is used again, the JVM will not create a new String object
but use the reference of the cached String.
s2 is guranteed to be a new String object, so in this case we have:

s1 == s2 // is false
s1 == s3 // is true
s1.equals(s2) // is true---> because equals() check the contents present inside
 */

/*
String str = “GeeksForGeeks”;
When you declare string like this, you are actually calling intern() method on String.
This method references internal pool of string objects.
If there already exists a string value “GeeksForGeeks”, then str will reference of that string and
no new String object will be created.
this literal object is stored inside a string constant pool which is in the heap

String str = new String(“GeeksForGeeks”);
In this method JVM is forced to create a new string reference, even if “GeeksForGeeks” is in the reference pool.
Therefore, if we compare performance of string literal and string object, string object will always take more time to execute than string literal because it will construct a new string every time it is executed.
this object just stores in the heap not stored inside any const pool but that const pool is already present in the heap only
but execution time is compiler dependent.
 */