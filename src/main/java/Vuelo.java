import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Vuelo {
	private String nombreVuelo;
	private String ciudadOrigen;
	private String ciudadDestino;
	private Date fechaInicio;
	private Date fechaDestino;
	private ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
	private ArrayList<Piloto> pilotos = new ArrayList<Piloto>();

	public Vuelo(String nombreVuelo, String ciudadOrigen, String ciudadDestino, Date fechaInicio, Date fechaDestino, ArrayList<Piloto> pilotos, ArrayList<Pasajero> pasajeros) {
		this.nombreVuelo = nombreVuelo;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.fechaInicio = fechaInicio;
		this.fechaDestino = fechaDestino;
		this.pilotos = pilotos;
		this.pasajeros = pasajeros;
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

	public ArrayList<Piloto> obtenerPilotos() {
		return this.pilotos;
	}

	public ArrayList<Pasajero> obtenerPasajeros() {
		return this.pasajeros;
	}

	public Pasajero buscarPasajero(String nombrePasajero) {
		for (Pasajero pasajero : this.pasajeros){
			if (pasajero.getNombre() != null) {
				if (Objects.equals(pasajero.getNombre(), nombrePasajero)) {
					return pasajero;
				}
			}
		}
		return null;
	}

	public boolean agregarPasajero(Pasajero pasajero) {
		for (Pasajero pasajeroEnLista : this.pasajeros){
			if (buscarPasajero(pasajeroEnLista.getNombre()) == pasajero){
				return false;
			}
		}
		this.pasajeros.add(pasajero);
		return true;
	}

	public Piloto buscarPiloto(String nombrePiloto) {
		for (Piloto piloto : this.pilotos){
			if (piloto.getNombrePiloto() != null) {
				if (Objects.equals(piloto.getNombrePiloto(), nombrePiloto)) {
					return piloto;
				}
			}
		}
		return null;
	}

	public boolean agregarPiloto(Piloto piloto) {
		for (Piloto pilotoEnLista : this.pilotos){
			if (buscarPiloto(pilotoEnLista.getNombrePiloto()) == piloto){
				return false;
            }
		}
		this.pilotos.add(piloto);
		return true;
	}
}