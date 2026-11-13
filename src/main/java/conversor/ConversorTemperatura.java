package conversor;

public class ConversorTemperatura {

    private static final double OFFSET = 32.0;
    private static final double RAZAO = 1.8;

    public static double paraCelsius(double fahrenheit) {
        return (fahrenheit - OFFSET) / RAZAO;
    }

    public static double paraFahrenheit(double celsius) {
        return celsius * RAZAO + OFFSET;
    }
}
