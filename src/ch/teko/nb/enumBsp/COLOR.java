package src.ch.teko.nb.enumBsp;

public enum COLOR {
    WHITE(0xFF, 0xFF, 0xFF),

    BLACK(0x0, 0x0, 0x0),
    RED(0xFF, 0x0, 0x0){
        @Override
        public String getName() {
            return "rot";
        }},
    GREEN(0x0, 0xFF, 0x0)
    {
        @Override
        public String getName() {
        return "grün";
    }},
    BLUE(0x0, 0x0, 0xFF);

 /*   @Override
        public String getName() {
            return "blau";
        }
    }*/

    public final int r, g, b;
    COLOR(int r,int g,int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String getName() {
        return String.format("[%d,%d,%d]", r, g, b);
    }

    public static void main(String[] args) {
        COLOR col = COLOR.GREEN;
        // col.g = 0xFF;            // nur ohne final möglich
        System.out.println(col);
        System.out.println(col.getName());
        System.out.println (col == COLOR.GREEN);
    }
}
