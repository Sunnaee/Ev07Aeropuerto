import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AvionTest {

    Date fechaExp = new Date(124, Calendar.NOVEMBER,1);
    Date fechaExp2 = new Date(123,Calendar.NOVEMBER,1);
    Date fecha2 = new Date(125,Calendar.OCTOBER,1);
    Date fecha3 = new Date(125,Calendar.NOVEMBER,1);
    Pasaporte pasaporte1 = new Pasaporte("1","Nacionalidad1",10,fechaExp);
    Pasajero pasajero1 = new Pasajero("Pasajero1",pasaporte1);
    Pasaporte pasaporte2 = new Pasaporte("2","Nacionalidad2",0,fechaExp);
    Pasajero pasajero2 = new Pasajero("Pasajero2",pasaporte2);
    ArrayList<Pasajero> pasajeros = new ArrayList<>(Arrays.asList(pasajero1));
    Piloto piloto1 = new Piloto("Piloto1");
    ArrayList<Piloto> pilotos = new ArrayList<>(Arrays.asList(piloto1));
    Vuelo vuelo1 = new Vuelo("Vuelo1","Ciudad1","Ciudad2",fecha2,fecha3,pilotos,pasajeros);
    Vuelo vuelo2 = new Vuelo("Vuelo2","Ciudad2","Ciudad3",fecha2,fecha3,pilotos,pasajeros);
    ArrayList<Vuelo> vuelos = new ArrayList<>(Arrays.asList(vuelo1));
    Avion avion = new Avion("Avion1",vuelos);

    @BeforeEach
    void setUp() {
        System.out.println("Preparando test...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Finalizando test...");
        vuelos = new ArrayList<>(Arrays.asList(vuelo1));
        avion = new Avion("Avion1",vuelos);
    }

    @Test
    void agregarVuelo() {
        assertTrue(avion.agregarVuelo(vuelo2));
        assertFalse(avion.agregarVuelo(vuelo1));
    }
}