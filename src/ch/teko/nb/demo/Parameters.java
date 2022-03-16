package src.ch.teko.nb.demo;



import java.util.ArrayList;
import java.util.Date;

public class Parameters {

    private int i;
    private Float f;
    private Date d;
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> getList() {
//        return list;
        return (ArrayList<Integer>) list.clone();
    }
//    public void setList (ArrayList<Integer>) setList() {
//        return list;
//        this.list = (ArrayList<Integer>) list.clone();
//    }

    public void setF(Float f) {
        if (f < 1000f) {
            this.f = f;
        }
        else {
            throw new RuntimeException();
        }
    }

    public int getI() {
        return i;
    }

    public Float getF() {
        return f;
    }

    public Date getD() {
        return (Date) d.clone();
    }

public Parameters() {
    i = 42;
    f = 4.2f;
    d = new Date();
}

@Override
public String toString() {

        return String.format("[%d,%f,%d,%s]", i,f, list.size(), d.toString());
}

    public static void main(String[] args) {
    Parameters p = new Parameters();
    Float f = p.getF();
    p.getList().add(2);
    System.out.println(p);

//    ArrayList<Integer> list = new ArrayList<>();
//    p.setList(list);
//    System.out.println(p);
//    list.add(2);
//    System.out.println(p);
    }
}

