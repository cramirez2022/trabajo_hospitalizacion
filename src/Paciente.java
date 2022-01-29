
public class Paciente {
	
	private String Rut_paciente;
	private String Nombre_paciente;
	private String Prevision_paciente;
	private String Direccion_paciente;
	
	public Paciente(String rut_paciente, String nombre_paciente,String prevision_paciente,String Direccion_paciente) {
		this.Rut_paciente = rut_paciente;
		this.Nombre_paciente = nombre_paciente;
		this.Prevision_paciente = prevision_paciente;
		this.Direccion_paciente = Direccion_paciente;}

	
	
	public String getDireccion_paciente() {
		return Direccion_paciente;
	}



	public void setDireccion_paciente(String direccion_paciente) {
		Direccion_paciente = direccion_paciente;
	}



	public String getRut_paciente() {
		return Rut_paciente;
	}

	public void setRut_paciente(String rut_paciente) {
		Rut_paciente = rut_paciente;
	}

	public String getNombre_paciente() {
		return Nombre_paciente;
	}

	public void setNombre_paciente(String nombre_paciente) {
		Nombre_paciente = nombre_paciente;
	}

	public String getPrevision_paciente() {
		return Prevision_paciente;
	}

	public void setPrevision_paciente(String prevision_paciente) {
		Prevision_paciente = prevision_paciente;
	}
	
	

	
}
