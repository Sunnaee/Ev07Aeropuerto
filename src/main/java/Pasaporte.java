import java.util.Date;

public class Pasaporte {
	private String id;
	private String nacionalidad;
	private int hojasDisponibles;
	private Date fechaExpiracion;

	public Pasaporte(String id, String nacionalidad, int hojasDisponibles, Date fechaExpiracion) {
		throw new UnsupportedOperationException();
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getHojasDisponibles() {
		return this.hojasDisponibles;
	}

	public void setHojasDisponibles(int hojasDisponibles) {
		this.hojasDisponibles = hojasDisponibles;
	}

	public Date getFechaExpiracion() {
		return this.fechaExpiracion;
	}

	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public String mostrarId() {
		throw new UnsupportedOperationException();
	}
}