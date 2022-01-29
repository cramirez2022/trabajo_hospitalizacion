
public class Profesional implements Persona {

	private String rut;
	private String nombre;
	private Especialidad especialidad;
	
	public Profesional(String rut, String nombre, Especialidad especialidad) {
		this.rut = rut;
		this.nombre = nombre;
		this.especialidad = especialidad;
		}

	public String getrut() {
		return this.rut;
	}

	public void setRut(String rut) {
	
	this.rut = rut;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

}
