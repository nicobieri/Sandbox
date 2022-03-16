package src.ch.teko.nb.jar;


import java.io.*;


public class Serialisation {

    static void serialize (Employee emp) throws IOException{
        FileOutputStream fo = new FileOutputStream("emp.obj");
        ObjectOutputStream os = new ObjectOutputStream(fo);
        os.writeObject(emp);
        fo.close();
    }
    static Employee deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream("emp.obj");
        ObjectInputStream os = new ObjectInputStream(fi);
        Object o = os.readObject();
        return (Employee) o;

    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee emp = new Employee("Dave", 23);
        System.out.println(emp);
        serialize(emp);

        Employee emp2 = deserialize();
        System.out.println(emp2);
    }
}
