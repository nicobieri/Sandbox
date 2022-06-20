package src.ch.teko.nb.generischeStack;

import java.util.ArrayList;


public class Stack<T> {
    ArrayList<T> list = new ArrayList<T>();

    void push(T value) {
        list.add(value);


    }
    T pop() {
        int top = list.size() -1;
        return list.remove(top);
    }
    boolean isEmpty() {
        return list.isEmpty();

    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.list.add("hello");
        stack.list.add("hello2");
        stack.push("hello3");
        System.out.println(stack.list);
        stack.pop();
        System.out.println(stack.list);
        System.out.println(stack.isEmpty());
        }


    }