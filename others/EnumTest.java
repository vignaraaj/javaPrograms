package others;

import static java.lang.System.*;

public class EnumTest {
    Day day;//declaring a global variable
    Alpha g;
    enum Alpha{//enum can be created inside of a class too like this
        AZ,BY,CX //enum is moreover like a class  but not class same way Alpha is datatype not a name of a class
    }
    public EnumTest(Alpha g) {
        this.g = g;
    }
    public EnumTest(Day day){
        this.day=day;
    }
    public void func(){
        switch(day) {
            case SUNDAY:
            case MONDAY:
                out.println("excites me");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
                out.println("pleasures me");
                break;
            default:
                out.println("an alpha");

            }
        }
    public void func(Alpha g){
        out.println(g);
    }

    public static void main(String[] args) {
        EnumTest first  = new EnumTest(Day.SUNDAY);
        first.func();
        EnumTest second = new EnumTest(Day.FRIDAY);
        second.func();
        EnumTest third  = new EnumTest(Alpha.BY);
        third.func(Alpha.BY);
        Day[] dd = Day.values();
        for(int i=0;i<dd.length;i++) System.out.println(dd[i]+" "+dd[i].ordinal());

    }
}
/*
[In java , object class is the base class of every classes]
Enumeration-----------------------------------------
java.lang.Enum        ( so java has a class for enum)
"""this enum is common base "class" of all java language enumeration types"""
                public abstract class Enum<E extends Enum<E>>
                extends Object implements Comparable<E>,Serializable
 */

/*
enum can be given inside interface also it is not only restricted to class
as mentioned in above two lines only enum can extend enum class can't extend enum
*/

/*
ORDINAL VALUE--> value gn to the constants starts from 0
values() methods contains all the values(constants) of the enum
 */

/*
**************we can give main method or any other method in enum also*****************
 */
