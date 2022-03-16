package src.ch.teko.nb.demo;

import java.util.*;

public class Student implements Comparable<Student> {
    private String id; // unique
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        // this.id = Integer.toHexString(id);
        this.name = name;
        this.age = age;
    }

    public Student(int id, String name, int age) {
        this.id = Integer.toString(id);
        // this.id = Integer.toHexString(id);
        this.name = name;
        this.age = age;
    }

    public Student(Student student){
        this.id = student.id;
        this.name = student.name;
        this.age = student.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // identity
        if (o == null || getClass() != o.getClass()) return false;
      //  if (o instanceof Student) {
            // gleicher typ
    //    }
    //    else {
       //     anderer typ
 //       }
        Student student = (Student) o;
        // return id  == student.id;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
   // public int compareTo(Student o) {
       // if (o == null ) return -1;
   //     return this.id.compareTo(o.id);
 //   }
    public int compareTo(Student o) {
        if (this.id == o.id) return 0;
        char v1[] = this.id.toCharArray();
        char v2[] = this.id.toCharArray();

        int lim = Math.min(this.id.length(), o.id.length());
        int k = 0;
        while(k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            System.out.format("compare %c / %c\n", c1, c2);
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return this.id.length() - o.id.length();
    }


    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());
        Student s1 = new Student("123", "Tom", 22);
        Student s2 = new Student(124, "Nico", 25);
        Student s3 = new Student("436", "Nicole", 24);
        Student s4 = new Student("467", "Josh", 22);

        Set<Student> set = new HashSet<>();

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

       // System.out.println(set);

        List<Student> list = new ArrayList<>();
        list.add(s4);
        list.add(s2);
        list.add(s3);
        list.add(s1);

        System.out.println(list);
        list.sort((e1, e2) -> e1.id.compareTo(e2.id));
        //Collections.sort(list);
        System.out.println(list);

        System.out.println("sorted by name :");
        list.sort((e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println(list);


    }


}
