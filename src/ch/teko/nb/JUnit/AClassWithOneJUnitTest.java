package src.ch.teko.nb.JUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


class AClassWithOneJUnitTest {


    @Test
    void this_is_true() {
        demo d = new demo();
        assertTrue(d.this_is_true());
    }


/*
    @Test
    void rnd() {
        for (int idx = 0; idx < 100; idx++) {
            double fahrenheit = Rnd1.rand(0, 100);
            assertEquals(fahrenheit, (Double) celsiustofahrenheit.toFahrenheit(
                    celsiustofahrenheit.toCelcius(fahrenheit)), 0.001);
        }
    }

 */
}
