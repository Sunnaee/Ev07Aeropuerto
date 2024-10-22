import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
class AeropuertoTest {

    Date fechaExp = new Date(124, Calendar.NOVEMBER,1);
    Date fechaExp2 = new Date(123,Calendar.NOVEMBER,1);
    Date fecha2 = new Date(125,Calendar.OCTOBER,1);
    Date fecha3 = new Date(125,Calendar.NOVEMBER,1);
    Pasaporte pasaporte1 = new Pasaporte("1","Nacionalidad1",10,fechaExp);
    Pasajero pasajero1 = new Pasajero("Pasajero1",pasaporte1);
    Pasaporte pasaporte2 = new Pasaporte("2","Nacionalidad2",0,fechaExp);
    Pasajero pasajero2 = new Pasajero("Pasajero2",pasaporte2);
    Pasaporte pasaporte3 = new Pasaporte("3","Nacionalidad3",7,fechaExp2);
    Pasajero pasajero3 = new Pasajero("Pasajero3",pasaporte3);
    ArrayList<Pasajero> pasajeros = new ArrayList<>(Arrays.asList(pasajero1,pasajero3));
    ArrayList<Pasajero> pasajeros2 = new ArrayList<>(Arrays.asList(pasajero1,pasajero2));
    Piloto piloto1 = new Piloto("Piloto1");
    ArrayList<Piloto> pilotos = new ArrayList<>(Arrays.asList(piloto1));
    Vuelo vuelo1 = new Vuelo("Vuelo1","Ciudad1","Ciudad2",fecha2,fecha3,pilotos,pasajeros);
    Vuelo vuelo2 = new Vuelo("Vuelo2","Ciudad2","Ciudad3",fecha2,fecha3,pilotos,pasajeros2);
    ArrayList<Vuelo> vuelos = new ArrayList<>(Arrays.asList(vuelo1,vuelo2));
    ArrayList<Vuelo> vuelos2 = new ArrayList<>(Arrays.asList(vuelo2));
    Avion avion = new Avion("Avion1",vuelos);
    Avion avion2 = new Avion("Avion2",vuelos2);
    ArrayList<Avion> aviones = new ArrayList<>(Arrays.asList(avion));
    Aeropuerto aeropuerto = new Aeropuerto(aviones);

    @BeforeEach
    void setUp() {
        System.out.println("Preparando test...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Finalizando test...");
        vuelos = new ArrayList<>(Arrays.asList(vuelo1,vuelo2));
        vuelos2 = new ArrayList<>(Arrays.asList(vuelo2));
        avion = new Avion("Avion1",vuelos);
        avion2 = new Avion("Avion2",vuelos2);
        aviones = new ArrayList<>(Arrays.asList(avion));
        aeropuerto = new Aeropuerto(aviones);
    }

    @Test
    void registrarAvion() {
        assertTrue(aeropuerto.registrarAvion(avion2));
        assertFalse(aeropuerto.registrarAvion(avion));
    }

    @Test
    void crearVuelo() {
        assertTrue(aeropuerto.crearVuelo(avion2,vuelo1));
        assertFalse(aeropuerto.crearVuelo(avion,vuelo1));
    }

    @Test
    void validarHojasDisponibles() {
        assertTrue(aeropuerto.validarHojasDisponibles(pasaporte1));
        assertFalse(aeropuerto.validarPasaporte(pasaporte2));
    }

    @Test
    void validarFechaExpiracion() {
        assertTrue(aeropuerto.validarFechaExpiracion(pasaporte1));
        assertTrue(aeropuerto.validarFechaExpiracion(pasaporte2));
        assertFalse(aeropuerto.validarFechaExpiracion(pasaporte3));
    }

    @Test
    void validarPasaporte() {
        assertTrue(aeropuerto.validarPasaporte(pasaporte1));
        assertFalse(aeropuerto.validarPasaporte(pasaporte2));
        assertFalse(aeropuerto.validarPasaporte(pasaporte3));
    }

    @Test
    void validarPasajero() {
        assertTrue(aeropuerto.validarPasajero(pasajero1));
        assertFalse(aeropuerto.validarPasajero(pasajero2));
        assertFalse(aeropuerto.validarPasajero(pasajero3));
    }
}