package conversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConversorTemperaturaTest {

    private static final double TOLERANCIA = 0.001;

    @Test
    void converteTemperaturaCorporalParaCelsius() {
        assertEquals(37.0, ConversorTemperatura.paraCelsius(98.6), TOLERANCIA);
    }

    @Test
    void converteMenos40ParaCelsius() {
        assertEquals(-40.0, ConversorTemperatura.paraCelsius(-40), TOLERANCIA);
    }

    @Test
    void converteTemperaturaAmbienteParaFahrenheit() {
        assertEquals(77.0, ConversorTemperatura.paraFahrenheit(25), TOLERANCIA);
    }

    @Test
    void converteCongelamentoParaFahrenheit() {
        assertEquals(32.0, ConversorTemperatura.paraFahrenheit(0), TOLERANCIA);
    }
}
