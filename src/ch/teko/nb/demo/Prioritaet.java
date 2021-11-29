package ch.teko.nb.demo;

public class Prioritaet {

    public static int demo(){
        int i = 0;
        i++;
        return i;
    }

    static int moreFun () {
        {
            return 1 / 2 * (3 - 4) * 5 + (6 % 7 - (8 - 9) / 8);
        }
    }
    public static int overFlow () {
        byte b = 100;
        for (int i = 0; i < 0xFF; i++) {
            b++;

        }
        return b;
    }
    public static void main(String args[]){
    System.out.println(demo());
    System.out.println(moreFun());
    System.out.println(overFlow());
}
}