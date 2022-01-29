
public class Especialidad {

	private String id_especialidad;
	private String nombre_especialidad;	
	
	public Especialidad(String id_especialidad, String nombre_especialidad) {
		this.id_especialidad = id_especialidad;
		this.nombre_especialidad = nombre_especialidad;
}

	public String getId_especialidad() {
		return id_especialidad;
	}

	public void setId_especialidad(String id_especialidad) {
		this.id_especialidad = id_especialidad;
	}

	public String getNombre_especialidad() {
		return nombre_especialidad;
	}

	public void setNombre_especialidad(String nombre_especialidad) {
		this.nombre_especialidad = nombre_especialidad;
	}
}
