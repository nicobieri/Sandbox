package src.ch.teko.nb.JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Random;

import org.junit.jupiter.api.Test;


class JUnitTests {


    @Test
    void this_is_true() {
        demo d = new demo();
        assertTrue(d.this_is_true());
    }

    public static Double Rnd1(){
        Random r = new Random();
        double range = 100; // nimmt immer 1 weniger  sprich 0-1 bei 10 zb 0-9
        double randomint = r.nextDouble(range);
        return randomint;
    }


    @Test
    void rnd() {
        for (int idx = 0; idx < 100; idx++) {
            double fahrenheit = Rnd1();
            assertEquals(fahrenheit, celsiustofahrenheit.toFahrenheit(
                    celsiustofahrenheit.toCelsius(fahrenheit)), 0.001);
        }
    }
}
