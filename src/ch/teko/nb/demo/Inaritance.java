package src.ch.teko.nb.demo;


import java.util.ArrayList;

public class Inaritance {

    public static class Animal {
        public String makeSound() {
            return "undefined";
        }
        public Animal getThis(){
            return this;
        }
    }

    public static class Dog extends Animal {
        @Override
        public String makeSound() {
            return "Woof Woof";
        }
        //covariant return type
        public Dog getThis(){
            return this;
        }
    }
    public static class Cat extends Animal {
        @Override
        public String makeSound() {
            return "Miau";
        }
        public Cat getThis(){
            return this;
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.makeSound());
        a = new Dog();
        System.out.println(a.makeSound());
        a = new Cat();
        System.out.println(a.makeSound());
//        Dog d = new Animal();

//        ArrayList<Animal> list = new ArrayList<>(100);
//        list.add(new Dog());
//        list.add(new Cat());
//        list.add(new Dog());
//        for(Animal)
//            System.out.println(m.makeSound());

    }
}
