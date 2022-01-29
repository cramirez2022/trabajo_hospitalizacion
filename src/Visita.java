
public class Visita {
	
	private int id_visita;
	private String Fecha_visita;
	private String Estado_visita;
	private String Tipo_visita;
	private Procedimiento procedimiento;
	private Profesional profesional;
	private Diagnostico diagnostico;
	private Paciente paciente;
	
	public Visita(int id_visita, String fecha_visita, String estado_visita,String tipo_visita, Procedimiento procedimiento,
			Profesional profesional, Diagnostico diagnostico, Paciente paciente) {
		this.id_visita = id_visita;
		this.Fecha_visita = fecha_visita;
		this.Estado_visita= estado_visita;
		this.Tipo_visita = tipo_visita;
		this.procedimiento = procedimiento;
		this.profesional = profesional;
		this.diagnostico = diagnostico;
		this.paciente = paciente; }
	

	public int getId_visita() {
		return id_visita;
	}

	public void setId_visita(int id_visita) {
		this.id_visita = id_visita;
	}

	public String getFecha_visita() {
		return Fecha_visita;
	}

	public void setFecha_visita(String fecha_visita) {
		Fecha_visita = fecha_visita;
	}

	public String getEstado_visita() {
		return Estado_visita;
	}

	public void setEstado_visita(String estado_visita) {
		Estado_visita = estado_visita;
	}

	public String getTipo_visita() {
		return Tipo_visita;
	}

	public void setTipo_visita(String tipo_visita) {
		Tipo_visita = tipo_visita;
	}

	public Procedimiento getProcedimiento() {
		return procedimiento;
	}

	public void setProcedimiento(Procedimiento procedimiento) {
		this.procedimiento = procedimiento;
	}

	public Profesional getProfesional() {
		return profesional;
	}

	public void setProfesional(Profesional profesional) {
		this.profesional = profesional;
	}

	public Diagnostico getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
	

}
