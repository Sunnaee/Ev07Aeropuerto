import java.util.ArrayList;

public class Avion {
	private String nombreAvion;
	private ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

	public Avion(String nombreAvion, ArrayList<Vuelo> vuelos) {
		throw new UnsupportedOperationException();
	}

	public String getNombreAvion() {
		return this.nombreAvion;
	}

	public void setNombreAvion(String nombreAvion) {
		this.nombreAvion = nombreAvion;
	}

	public Vuelo buscarVuelo(String nombreVuelo) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarVuelo(Vuelo vuelo) {
		throw new UnsupportedOperationException();
	}
}