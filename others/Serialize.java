package others;
//marker interface --> i.e. they are empty.
//But when a class implements them, then they indicate that the compiler can expect some special behavior from the classes implementing them.
// serializable ,cloneable ,remote


//A serializable interface is used to persist(make exists long) an object.
// when a class implements a Serializable interface then we can serialize or deserialize
// the class objects and save/retrieve their state.
import java.io.*;
import java.io.Serializable;
//Class Student implements
class Student implements Serializable{
    int id;
    // if this is given transient then it is not serialized the
    // o/p would be [0 Vignaraaj]  because only the id is gn transient
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Serialize{
    public static void main(String args[]){
        try{

            Student s1 =new Student(5,"Vignaraaj");
            //Write the object to the stream by creating a output stream
            FileOutputStream fout=new FileOutputStream("vignu.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //close the stream
            out.close();
            System.out.println("Serialized-->deserialized");

            //Create a stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("vignu.txt"));
            Student s=(Student)in.readObject();
            //print the data of the deserialized object
            System.out.println("Student object: " + s.id+" "+s.name);
            //close the stream
            in.close();

        }catch(Exception e){System.out.println(e);}
    }
}
//Note that after deserialization, we get the same object that we have serialized earlier as we open the same file again
//A transient keyword is used to make a data member transient i.e. we do not want to serialize it
//In the above program, we have serialized the Employee object.
// But note that the Employee id field of the Employee class is declared ‘transient’.
// Now to check the serialization, we deserialize the object. The output shows the Employee object as ‘0 Vignaraaj’.
// This means that the Employee Id was not saved to the file.