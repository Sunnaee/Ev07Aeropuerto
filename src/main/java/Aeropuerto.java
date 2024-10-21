import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Aeropuerto {
	private ArrayList<Avion> aviones = new ArrayList<Avion>();

	public Aeropuerto(ArrayList<Avion> aviones) {
		this.aviones = aviones;
	}

	//buscar el avión por su nombre.
	public Avion buscarAvion(String nombreAvion) {
		for (Avion avion : this.aviones){
			if (avion.getNombreAvion() != null) { //si el espacio del nombre en el ArrayList no está vacío.
				if (Objects.equals(avion.getNombreAvion(), nombreAvion)) {
					return avion;
				}
			}
		}
		return null;
	}

	//buscar el avión que se quiere registrar con la función anterior para comprobar si existe o no.
	public boolean registrarAvion(Avion avion) {
		for (Avion avionEnLista : this.aviones){
			if (buscarAvion(avionEnLista.getNombreAvion()) != avion){ //si el avión encontrado no es el mismo al avión que se quiere agregar.
				this.aviones.add(avion);
				return true;
			}
		}
		return false;
	}

	//crear un vuelo.
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

	//validar las hojas disponibles individualmente.
	public boolean validarHojasDisponibles(Pasaporte pasaporte) {
		return pasaporte.getHojasDisponibles() > 0; //retorna true si quedan hojas disponibles.
	}

	//validar la fecha de expiración.
	public boolean validarFechaExpiracion(Pasaporte pasaporte) {
		Date fechaActual = new Date(); //almacenar la fecha actual en un variable.
		return pasaporte.getFechaExpiracion().after(fechaActual); //retorna true si la fecha obtenida del objeto Pasaporte es después de la fecha en el argumento (fecha actual).
	}

	//validar el pasaporte con las 2 funciones anteriores.
	public boolean validarPasaporte(Pasaporte pasaporte) {
		return validarHojasDisponibles(pasaporte) && validarFechaExpiracion(pasaporte);
	}

	//validar el pasaporte relacionado con el pasajero utilizando la función anterior.
	public boolean validarPasajero(Pasajero pasajero) {
		for (Avion avion : aviones) {
			for (Vuelo vuelo : avion.obtenerVuelos()) {
				if (!vuelo.agregarPasajero(pasajero)) { //si el pasajero existe;
					if (validarPasaporte(pasajero.obtenerPasaporte())) {
						return true;
					}
				}
			}
		}
		return false;
	}

	//buscar los pasajeros en vuelos que se hacen en cierta fecha.
	public void buscarPasajerosVuelosPorFecha(Date fecha) {
		System.out.println("LISTA DE PASAJEROS EN VUELOS DE LA FECHA "+fecha);
		for (Avion avion : this.aviones) {
			for (Vuelo vuelo : avion.obtenerVuelos()) {
				if (vuelo.getFechaInicio() == fecha) { //si la fecha de inicio del avión coincide con la fecha que se busca.
					System.out.println("\nVUELO: "+vuelo.getNombreVuelo());
					for (Pasajero pasajero : vuelo.obtenerPasajeros()) {
						System.out.println("- "+pasajero.mostrarNombre());
					}
				}
			}
		}
		System.out.println("FIN DE LA LISTA.");
	}

	//buscar los pasajeros de cierto vuelo.
	public void buscarPasajerosPorVuelo(Vuelo vuelo) {
		for (Avion avion : this.aviones) {
			for (Vuelo vueloEnLista : avion.obtenerVuelos()) {
				if (avion.buscarVuelo(vueloEnLista.getNombreVuelo()) == vuelo) { //si el vuelo del avión es el mismo que el objeto vuelo que se busca.
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