package src.ch.teko.nb.JUnit;

// Java Program to Convert Celsius into Fahrenheit
class celsiustofahrenheit {

    // initialising
    static double celsius = 10.0, fahrenheit = 0;

    public static double toFahrenheit(double fahrenheit) {
        celsius =  (celsius - 32) / 1.8;
        System.out.println(
                " value of temperature in celsius:"
                        + celsius);
        return fahrenheit;
    }

    public static double toCelsius(double celsius) {
        // formula for conversion
        fahrenheit = (fahrenheit * 1.8) + 32;
        System.out.println(
                " value of temperature in fahrenheit:"
                        + fahrenheit);
        return celsius;
    }

    public static void main(String[] args) {
    System.out.println(toCelsius(celsius));
    System.out.println(toFahrenheit(fahrenheit));



    }
}
