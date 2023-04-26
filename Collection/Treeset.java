package Collection;

import java.util.TreeSet;
//it won't allow duplicate values as it is a set primarily
public class Treeset {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("20");
        ts.add("10");
        ts.remove("10");
        System.out.println(ts);
        /*
        ts.add("vkj"); --> treeset accepts homogeneous elements because it sorts the elements in ascending order
         if we tried to give int and str to it, it throws an error
        to avoid it use generics
        if any other datatype is used because of generics the error will be thrown at compile time itself not at the runtime
        */
        TreeSet<String> tv = new TreeSet();
        tv.add("vk");
        tv.add("Vi");
        //tv.add(10); throws an error
        System.out.println(tv);
    }
}
