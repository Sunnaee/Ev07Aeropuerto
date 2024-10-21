public class Piloto {
	private String nombrePiloto;
	private Vuelo vuelo;

	public Piloto(String nombrePiloto, Vuelo vuelo) {
		this.nombrePiloto = nombrePiloto;
		this.vuelo = vuelo;
	}

	public String getNombrePiloto() {
		return this.nombrePiloto;
	}

	public void setNombrePiloto(String nombrePiloto) {
		this.nombrePiloto = nombrePiloto;
	}
}