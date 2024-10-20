import java.util.ArrayList;
import java.util.Date;

public class Aeropuerto {
	private ArrayList<Avion> aviones = new ArrayList<Avion>();

	public Aeropuerto(ArrayList<Avion> aviones) {
		throw new UnsupportedOperationException();
	}

	public Avion buscarAvion(String nombreAvion) {
		throw new UnsupportedOperationException();
	}

	public boolean registrarAvion(Avion avion) {
		throw new UnsupportedOperationException();
	}

	public boolean crearVuelo(Avion avion, Vuelo vuelo) {
		throw new UnsupportedOperationException();
	}

	public boolean validarPasajero(Avion avion, Vuelo vuelo, Pasajero pasajero) {
		throw new UnsupportedOperationException();
	}

	public boolean validarPasaporte(Pasaporte pasaporte) {
		throw new UnsupportedOperationException();
	}

	public boolean validarHojasDisponibles(Pasaporte pasaporte) {
		throw new UnsupportedOperationException();
	}

	public boolean validarFechaExpiracion(Pasaporte pasaporte) {
		throw new UnsupportedOperationException();
	}

	public void buscarPasajerosVuelosPorFecha(Date fecha) {
		throw new UnsupportedOperationException();
	}

	public void buscarPasajerosPorVuelo(Vuelo vuelo) {
		throw new UnsupportedOperationException();
	}
}