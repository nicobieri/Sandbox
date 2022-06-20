package src.ch.teko.nb.Hausaufgaben;

public class Int implements Comparable<Int> {

    private final int r, i;

    public Int(int r, int i){
        this.r = r;
        this.i = i;
    }

    public Int(){
        this(0,0);
    }

    @Override
    public String toString(){
        return String.format("(%d, %d)", r, i);
    }

    public Int add(Int cplx) {
        return new Int(this.r + cplx.r,this.i + cplx.i);
        }

    public Int sub(Int cplx) {
        return new Int(this.r - cplx.r,this.i - cplx.i);
    }


    public Int mul(Int cplx) {
        // (ac-bd) + (ad +bc)
        return new Int((this.r * cplx.r - this.i*cplx.i),(this.r*cplx.i + this.i*cplx.r));
    }
    public Int div(Int cplx){
        // ToDo: implement
        //  (a*c+b*d)/(c*c+d*d) + (b*c-a*d)/(c*c+d*d)
        return new Int((this.r*cplx.r+this.i*cplx.i)/(cplx.r*cplx.r+cplx.i*cplx.i),(this.i*cplx.r-this.r*cplx.i)/(cplx.r*cplx.r+cplx.i*cplx.i));
    }

    public double abs() {
        return Math.hypot(r, i);
    }

    @Override
    public int compareTo(Int o) {
        return(int)(this.abs() - o.abs());
    }

    public static void main(String[] args) {
        Int i1 = new Int(3, 5);
        Int i2 = new Int(1,2);
        //i1 + i2;
        System.out.println(i1.add(i2));
        System.out.println(i1.mul(i2));
        System.out.println(i1.div(i2));
    }
}
