import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class VueloTest {

    Date fechaExp = new Date(2024,11,1);
    Date fecha2 = new Date(2025,10,1);
    Date fecha3 = new Date(2025,11,1);
    Pasaporte pasaporte1 = new Pasaporte("1","Nacionalidad1",10,fechaExp);
    Pasajero pasajero1 = new Pasajero("Pasajero1",pasaporte1);
    Pasaporte pasaporte2 = new Pasaporte("2","Nacionalidad2",0,fechaExp);
    Pasajero pasajero2 = new Pasajero("Pasajero2",pasaporte2);
    ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>(Arrays.asList(pasajero1));
    Piloto piloto1 = new Piloto("Piloto1");
    ArrayList<Piloto> pilotos = new ArrayList<>(Arrays.asList(piloto1));
    Vuelo vuelo = new Vuelo("Vuelo1","Ciudad1","Ciudad2",fecha2,fecha3,pilotos,pasajeros);

    @BeforeEach
    void setUp() {
        System.out.println("Preparando test...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Finalizando test...");
        pasajeros = new ArrayList<Pasajero>(Arrays.asList(pasajero1));
        vuelo = new Vuelo("Vuelo1","Ciudad1","Ciudad2",fecha2,fecha3,pilotos,pasajeros);

    }

    @Test
    void agregarPasajero() {
        assertTrue(vuelo.agregarPasajero(pasajero2));
    }

}