package src.ch.teko.nb.ArrayList;

public class MehrdimensionaleArrrays {

    public static void main(String[] args) {

        String[][] names = {
            {"Mr.␣", "Mrs.␣", "Ms.␣"},
            {"Smith", "Jones"},
                {"Bieri", "Nico"}

    };

System.out.println(names[0].length);

  System.out.println(names[1].length);

    //Mr. Smith
        System.out.println(names[0][0]+names[1][0]);

    //Ms. Jones
        System.out.println(names[0][2]+names[1][1]);
}
}