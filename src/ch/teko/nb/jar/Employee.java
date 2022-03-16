package src.ch.teko.nb.jar;

import java.io.Serializable;

public class Employee implements Serializable {
   // private String firstName;
    private String name;
    private int age;

    private static final long serialVersionUID = 1L;



    public Employee(String name, int age){
     //   this.firstName = firstName;
        this.name = name;
        this.age = age;

    }
    @Override
    public String toString() {
        return "Employee{" +
     //           "firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
