package others;
//numbering-->object's counts
//A special data type that allows variables to have any of a predefined set of values(constants here)
//grouping the constants,"collection of named constants"
//enum could be considered as "subset of class"
//constants are declared as static final VAR="vignu"; in a  class
//members of an enum are by default-->public,static and final

public enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;

    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
        //Day d=new Day();enum types can't be instantiated
        //System.out.println(d);
        //enum can have constructors also
        //the datatype here is "Day".
    }
}
        /*
         public class Day{
             public static final Day Sunday=new Day();
             public static final Day Monday=new Day();
             //instead of doing this we use enum
        */
// can pass arguments with these constants also
/*
            public enum Actors{
                VIJAY(50),AJITH(45),SURIYA(40);
                int salary;
                Actors(int salary){  //this is a constructor(enum's constructor)
                    this.salary=salary;
                    }
                public void test{
                    //any method can be given inside enum also
                    }
                }
 */


/*
        important feature in enum we can give a separate method for each objects
        e.g-->

        public enum Actors{
        VIJAY,AJITH,SURIYA,
        VK{
            public void act(){             //this applies only to the particular const obj  because we had defined the method directly after the object
                System.out.println("not a good actor");
            }
         };
         public void act(){                // this applies to rest of the object
            System.out.println("good actor");
            }
         }

         //Actors.VK.act();-->not a good actor
         //Actors.VIJAY.act();-->good actor
         //[we can give every object's its unique method in enum]
 */

/*
the above feature can be used in a supermarket where some objects
need some special attention we can define unique methods to them like above while using enum
 */



/*
the importance of using enum than class is
class takes more code to create const objects enum does it simple way
in class while creating object we should pass the value in constructor
that overrides the toString() method for just printing the object name
but with enum it is easy to print the object name refer EnumTest for this
 */
