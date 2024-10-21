public class Piloto {
	private String nombrePiloto;
	private Vuelo vuelo;

	public Piloto(String nombrePiloto) {
		this.nombrePiloto = nombrePiloto;
	}

	public String getNombrePiloto() {
		return this.nombrePiloto;
	}

	public void setNombrePiloto(String nombrePiloto) {
		this.nombrePiloto = nombrePiloto;
	}
}