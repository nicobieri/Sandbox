package src.ch.teko.nb.Hausaufgaben;

public class Cage <T> {

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }
    public T getAnimal() {
        return this.animal;
    }

public static void main(String[]args){

//    Cage<Animal> cage = new Cage<Dog>();

// gibt einen Kompilerfehler aus.
// Dog ist zwar eine UnterklassevonAnimal, aber Cage<Animal> und Cage<Dog> sind inkompatibel.


//    Cage<Bird> aviary = new Cage<Animal>();

//    gibt ebenfalls einen Kompilerfehler aus.
//    Cage<Bird> und Cage<Animal> sind inkompatibel.



//    Cage<?> aviary = new Cage<Animal>();
//    aviary.setAnimal(new Bird());

// erzeugt einen Kompilerfehler in Zeile 2. Die erste Zeile istin Ordnung.
// Man kann einen Cage eines unbekannten aktuellen Parametertypserzeugen.
// Die zweite Zeile kann nicht übersetzen, da der Compiler nicht wissen kann welche Klassen in voliere aviary werden sollen.


//    Cage aviary =new Cage();
//    aviary.setAnimal(new Bird());

// kompiliert. Es wird aber nicht empfohlen, mit sogenannten raw-Objects zu arbeiten.

    Cage<?> cage = new Cage<Bird>();
    Cage<Bird> aviary = new Cage<Bird>();
    aviary.setAnimal(new Bird());
//    voliere = aviary; //  kompatibel
    aviary.getAnimal();

    Animal animal1 = new Animal();
    animal1.helloAnimal();
        }
}
