import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Aeropuerto {
	private ArrayList<Avion> aviones = new ArrayList<Avion>();

	public Aeropuerto(ArrayList<Avion> aviones) {
		this.aviones = aviones;
	}

	public Avion buscarAvion(String nombreAvion) {
		for (Avion avion : this.aviones){
			if(Objects.equals(avion.getNombreAvion(), nombreAvion)){
				return avion;
			}
		}
		return null;
	}

	public boolean registrarAvion(Avion avion) {
		for (Avion avionEnLista : this.aviones){
			if(buscarAvion(avionEnLista.getNombreAvion()) != null){
				if (buscarAvion(avionEnLista.getNombreAvion()) != avion){
					this.aviones.add(avion);
					return true;
				}
			}
		}
		return false;
	}

	public boolean crearVuelo(Avion avion, Vuelo vuelo) {
		if (!registrarAvion(avion)) { //si el avión ya existe (registrarAvion(...) devuelve false porque lo encuentra en el ArrayList).
			if (!avion.agregarVuelo(vuelo)) { //si el vuelo también existe.
				return false; //no se agrega.
			} //si el vuelo no existe.
			avion.agregarVuelo(vuelo); //se agrega el vuelo en ese avión.
			return true;
		} //si el avión no existe.
		registrarAvion(avion); //se agrega el avión.
		avion.agregarVuelo(vuelo); //se agrega el vuelo al avión recién creado.
		return true;
	}

	public boolean validarPasajero(Avion avion, Vuelo vuelo, Pasajero pasajero) {
		if (!registrarAvion(avion)) { //si el avión existe.
			if (!avion.agregarVuelo(vuelo)) { //si el vuelo existe.
				if (!vuelo.agregarPasajero(pasajero)) { //si el pasajero existe;
					if (validarPasaporte(pasajero.obtenerPasaporte())) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean validarPasaporte(Pasaporte pasaporte) {
        return validarHojasDisponibles(pasaporte) && validarFechaExpiracion(pasaporte);
    }

	public boolean validarHojasDisponibles(Pasaporte pasaporte) {
        return pasaporte.getHojasDisponibles() > 0;
    }

	public boolean validarFechaExpiracion(Pasaporte pasaporte) {
		Date fechaActual = new Date();
		return pasaporte.getFechaExpiracion().after(fechaActual);
	}

	public void buscarPasajerosVuelosPorFecha(Date fecha) {
		System.out.println("LISTA DE PASAJEROS EN VUELOS DE LA FECHA "+fecha);
		for (Avion avion : this.aviones) {
			for (Vuelo vuelo : avion.obtenerVuelos()) {
				if (vuelo.getFechaInicio() == fecha) {
					System.out.println("\nVUELO: "+vuelo.getNombreVuelo());
					for (Pasajero pasajero : vuelo.obtenerPasajeros()) {
						System.out.println("- "+pasajero.mostrarNombre());
					}
				}
			}
		}
		System.out.println("FIN DE LA LISTA.");
	}

	public void buscarPasajerosPorVuelo(Vuelo vuelo) {
		for (Avion avion : this.aviones) {
			for (Vuelo vueloEnLista : avion.obtenerVuelos()) {
				if (avion.buscarVuelo(vueloEnLista.getNombreVuelo()) == vuelo) {
					System.out.println("LISTA DE PASAJEROS EN EL VUELO "+vuelo.getNombreVuelo());
					for (Pasajero pasajero : vueloEnLista.obtenerPasajeros()) {
						System.out.println("- " + pasajero.mostrarNombre());
					}
				}
			}
		}
		System.out.println("FIN DE LA LISTA.");
	}
}