public class Pasajero {
	private String nombre;
	private Pasaporte pasaporte;

	public Pasajero(String nombre, Pasaporte pasaporte) {
		this.nombre = nombre;
		this.pasaporte = pasaporte;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pasaporte obtenerPasaporte() {
		return this.pasaporte;
	}

	public String mostrarNombre(){
		return "Pasajero/a: "+this.nombre;
	}
}