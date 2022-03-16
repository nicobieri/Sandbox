package src.ch.teko.nb.demo;

import java.util.Date;

public class Person implements Cloneable {
    private String name;
    private Date birthDate;

    Person(String name) {
        this.name = name;
        birthDate = new Date();
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        p.birthDate = (Date) birthDate.clone(); // deep copy
        return p;
//        return super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        Person p = new Person("Michi");
        System.out.println(p);
        Person c = (Person) p.clone();
        System.out.println(c);
    }

}
