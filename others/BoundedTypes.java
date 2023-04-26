package others;

//public class BoundedTypes <T> -->accepting any types
//<T extends Generics>bounding one class's object to other class's object
public class BoundedTypes <T extends Generics>{  //generic classes
    public static void main(String[] args) {
        //BoundedTypes<String> b1 = new BoundedTypes<String>();//--> this gives error
        BoundedTypes<Generics> b2 = new BoundedTypes<Generics>();
        //only generic class's objects shd be passed as datatype here
        System.out.println(b2.getClass().getTypeName());
        System.out.println(b2.getClass());
        System.out.println(b2);
    }
}


class BoundedTypes2<T>{
    T t;
    BoundedTypes2(T ob){ // for string , integer separate constructors shd be gn instead just mentioned <T> which accepts every datatype
        this.t=ob;
    }
    public void show(){
        System.out.println(t.getClass().getTypeName());
        String s=t.getClass().getTypeName();
        if (s.contentEquals("java.lang.String")){
            System.out.println("It is a string");
        }
        else{
            System.out.println("It is a Integer");
        }
    }
}