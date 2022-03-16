package src.ch.teko.nb.demo;

public class ConcatTest {

public static void main(String[]args) {

    // String Buffer
    long maxIterations = 1_000_000;
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        sb.ensureCapacity((int)(maxIterations * 5));
        for (long i = 0; i < maxIterations; i++) {
            sb.append("Tpoint");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

        // String Builder
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        sb2.ensureCapacity((int)(maxIterations * 5));
        for (long i = 0; i < maxIterations; i++){
            sb2.append("Tpoint");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime)+"ms");
    }
}