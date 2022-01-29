
public class Diagnostico {

	private int	Id_diagnostico;
	private String Nombre_diagnostico;
	
	public Diagnostico(int id_diagnostico, String nombre_diagnostico) {
		Id_diagnostico = id_diagnostico;
		Nombre_diagnostico = nombre_diagnostico;}

	public int getId_diagnostico() {
		return Id_diagnostico;
	}

	public void setId_diagnostico(int id_diagnostico) {
		Id_diagnostico = id_diagnostico;
	}

	public String getNombre_diagnostico() {
		return Nombre_diagnostico;
	}

	public void setNombre_diagnostico(String nombre_diagnostico) {
		Nombre_diagnostico = nombre_diagnostico;
	}


}
