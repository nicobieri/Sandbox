package src.ch.teko.nb.Generics01;

// Java program to show working
// of user-defined Generic classes

// We use < > to specify Parameter type
class typeArguments<T> {
    // An object of type T is declared
    T obj;
    typeArguments(T obj) {
        this.obj = obj;
    } // constructor
    public T getObject() {
        return this.obj;
    }
}

// Driver class to test above

