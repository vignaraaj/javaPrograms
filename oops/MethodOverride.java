public class MethodOverride {
    public static void main(String[] args) {
        A a = new B();  //upCasting or widening
        a.m1();
        B b = new B();
        b.m1();
        A a1 = new A();
        a1.m1();
        //B b1 = new A(); // compile time error
        B b1 = (B)a; //typecasting   (downCasting or narrowing)
        b1.m1();
    }
}
class A { public void m1(){ System.out.println("hi A"); } }
class B extends A{ public void m1(){ System.out.println("hi B"); } }

