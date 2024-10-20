import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
	private String nombreVuelo;
	private String ciudadOrigen;
	private String ciudadDestino;
	private Date fechaInicio;
	private Date fechaDestino;
	private ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
	private ArrayList<Piloto> pilotos = new ArrayList<Piloto>();

	public Vuelo(String nombreVuelo, String ciudadOrigen, String ciudadDestino, Date fechaInicio, Date fechaDestino, ArrayList<Piloto> pilotos, ArrayList<Pasajero> pasajeros) {
		throw new UnsupportedOperationException();
	}

	public String getNombreVuelo() {
		return this.nombreVuelo;
	}

	public void setNombreVuelo(String nombreVuelo) {
		this.nombreVuelo = nombreVuelo;
	}

	public String getCiudadOrigen() {
		return this.ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getCiudadDestino() {
		return this.ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaDestino() {
		return this.fechaDestino;
	}

	public void setFechaDestino(Date fechaDestino) {
		this.fechaDestino = fechaDestino;
	}

	public Pasajero buscarPasajero(String nombrePasajero) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarPasajero(Pasajero pasajero) {
		throw new UnsupportedOperationException();
	}

	public Piloto buscarPiloto(String nombrePiloto) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarPiloto(Piloto piloto) {
		throw new UnsupportedOperationException();
	}
}