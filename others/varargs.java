package others;
//variable arguments
//varargs-->zero to multiple arguments can be passed with this,w/o this we should have parameters as comma separated for each and every argument passed.
class SubClass1{
    SubClass1(String...names){ //this ... tells the compiler varargs is used and these shd be stored  in array(string array) referred to by 'names'
        for(String p : names){
            System.out.println("Hello "+p);
        }
    }  //these 3 dots are called ellipses
}
public class varargs {
    public static void main(String[] args) {
        SubClass1 c = new SubClass1("Vkj","vi"); //can pass any number of arguments
    }
}
/*
there  can be any type of parameters but the varargs shd be at last(if it is first place it leads to error)
int nums(int a,String b,double... c){
}
Vararg Methods can also be overloaded, but overloading may lead to ambiguity

two or more varargs cant be given(only one is allowed)
void method(String... gfg, int... q)
{
    // Compile time error as there
    // are two varargs
}

Before JDK 5, variable length arguments could be handled in two ways:
 One was using overloading, other was using array argument
  Both of them are potentially error-prone and require more code.
 */