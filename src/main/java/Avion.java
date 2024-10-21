import java.util.ArrayList;
import java.util.Objects;

public class Avion {
	private String nombreAvion;
	private ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

	public Avion(String nombreAvion, ArrayList<Vuelo> vuelos) {
		this.nombreAvion = nombreAvion;
		this.vuelos = vuelos;
	}

	public String getNombreAvion() {
		return this.nombreAvion;
	}

	public void setNombreAvion(String nombreAvion) {
		this.nombreAvion = nombreAvion;
	}

	public ArrayList<Vuelo> obtenerVuelos() {
		return this.vuelos;
	}

	public Vuelo buscarVuelo(String nombreVuelo) {
		for (Vuelo vuelo : this.vuelos){
			if(Objects.equals(vuelo.getNombreVuelo(), nombreVuelo)){
				return vuelo;
			}
		}
		return null;
	}

	public boolean agregarVuelo(Vuelo vuelo) {
		for (Vuelo vueloEnLista : this.vuelos){
			if(buscarVuelo(vueloEnLista.getNombreVuelo()) != null){
				if (buscarVuelo(vueloEnLista.getNombreVuelo()) != vuelo){
					this.vuelos.add(vuelo);
					return true;
				}
			}
		}
		return false;
	}
}