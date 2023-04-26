package logicalProgOnNumbers;

public class Negation {
    public static void main(String[] args) {
        int a=~0;
        System.out.println(a); //op/--> -1
        int b=1;
        System.out.println(~b); //op/-->  -2
        int c=8;
        int d=~(c);
        System.out.println(d); //op/-->  -9
        int e = ~3;
        System.out.println(e); //op/-->  -4


        /*
        so the common formula is //  ~x=-x-1

         let us consider int e = ~3;
         binary code of 3  is 00000000 00000000 00000000 00000011
         binary code of ~3 is 11111111 11111111 11111111 11111100
         so whenever compiler sees MSB as 1 it takes it as negative number
         then it does 2's complement on ~3 but adds negative symbol before it
         1's complement of ~3 is 00000000 00000000 00000000 00000011
         2's complement of ~3 is 00000000 00000000 00000000 00000100
         so the answer is -4

         */
    }
}
