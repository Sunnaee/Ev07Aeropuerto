public class Pasajero {
	private String nombre;
	private Pasaporte pasaporte;

	public Pasajero(String nombre, Pasaporte pasaporte) {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pasaporte obtenerPasaporte() {
		throw new UnsupportedOperationException();
	}
}