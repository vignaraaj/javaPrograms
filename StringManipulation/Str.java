package StringManipulation;
//String is a special class (non-primitive datatype)under java.lang package
//collection of characters
// stream is a collection of objects
public class Str {
    public static void main(String[] args) {
        String s1 = new String("abcdef");// stores in heap memory
        String s2 = " ";//not empty has a blank space as a char,stores in string constant pool
        String s3 = "";//is empty, stores in string constant pool
        String s4 = "abcdef";//stores in string constant pool which is inside of heap memory
        System.out.println(s1.length());
        //length() convert string to char array and counts the char
        //isBlank() checks whether string has any blank space
        System.out.println(s3.isEmpty());
        //isEmpty() returns true if length of string is zero


        //  == operator and equals method
        // == is used for primitive datatypes
        // equals is used for compare objects
        if (s1 == s4) System.out.println("==");//checs the address the strings mentioned
        else System.out.println("not ==");
        if (s1.equals(s4)) System.out.println("==");//check what's inside the String objects
        else System.out.println("not ==");

        System.out.println("----------------------------------------");

        String s5 = s1;//both pointing towards the same memory in heap
        if (s1 == s5) System.out.println("==");//checs the address the strings mentioned
        else System.out.println("not ==");
        if (s1.equals(s5)) System.out.println("==");//check what's inside the String objects
        else System.out.println("not ==");
    }
}
/*
methods in strings
        comparison methods

        s1.equalsIgnoreCase(s2);  //-->doesnt check for lower or upper (gives true for JAVA and java)
        s1.compareTo(s2);  //-->returns integer maybe -ve (if s1 is small), +ve(if s1 is large), 0(if both are equal)
        s1.compareToIgnoreCase(s2);//-->combo of above two
        s1.startsWith("ab");//-->returns boolean value(true)
        s1.endsWith("zx");//-->returns boolean value(false)
        s1.startsWith("cde",2);//checks whether 2nd index starts with cde
        s1.contentEquals(s2);//-->returns boolean and gets arguments as char seq or str buffer(to comp str and str buffer)but not objects like equals()

    searching methods
        s1.indexOf('a');//-->returns the index of first occurence of a(here 0)
        s1.indexOf("cde");//-->returns 2
        s1.indexOf('a',3);//-->starts to check indexof 'a' after 3rd index
        s1.indexOf("def",4);//combo of above two methods
        s1.lastIndexOf('a');
        s1.lastIndexOf("abcd");//lastindexof is quite opposite to indexof
        s1.lastIndexOf('a',3);//lastindexof search from last
        s1.lastIndexOf("cd",2);//similar to indexof

    character extraction (substring)
        s1.charAt(3);//-->returns the element at the mentioned index(cant have -ve value )
        s1.substring(10);//-->returns everything from str from index 10
        s1.substring(2,4);//-->returns char from str from from index 2 to 3
        s1.subSequence(1,4);//-->returns char seq not as str o/p is same as above but the arg can be char seq here the char seq is interface
        char seq is both immutable and mutable

    other important methods
        s1.toLowerCase();
        s1.toUpperCase();
        s1.strip();//leading and trailing edges are stripped
        s1.stripLeading();
        s1.stripTrailing();
        s1.trim();//similar to strip but only limited to ascii but trim is used in unicode also
        to remove spaces in between of a string use regex's replaceall


        s1.repeat(3);//the string is repeated 3 times here
        s1.indent(20);//20 spaces is left and then string is printed
        s1.toCharArray();//string converted to char array store it in the array char or else both string and charArray are same


    text processing,regular expression
        s1.matches("\\w{9} \\w{7}");//-->first word shd have 9 letters second word shd have 7 letters if not returns false or true
        s1.replace('a','e');
        s1.replaceAll("\\s","-");
        s1.replaceFirst("\\s","-");
        s1.split(" ");//->returns str array so store it in String[]
        s1.split(" ",2);//-->same like above but limit is given here the string can be splitted only twice
        s1.contains("The");// returns true if my list has "the" else returns false


    static methods
        String.join("-","05","10","2001");// o/p--> 05-10-2001  ["-" is placed in between the elements]
        String.valueOf(5); //here 5 is integer but the valueof operator chenges it to string this valueof can take any typeof arguments and return them as string object
        Integer.valueOf("20"); -->here the valueof converts the str to integer object
        Enum to has a valueOf()-->e.g.   valueOf("RED");   no this str "RED" is converted to enum's const object.


refer this to know more about == and equals()
https://www.youtube.com/watch?v=SPUOSOGZKU4&list=PLgWpUXNR_WCczMncg91TxlyiuRKrVBd9_&index=5
 */