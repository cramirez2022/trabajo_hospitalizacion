
public class Principal {

	public static void main(String[] args) {
		
		 Proveedor proveedor = new Proveedor(1, "Salcobrand", "1-9");
	 Insumo insumo = new Insumo(121212, "Oxigeno tipo 1", proveedor);
	 Insumo insumo2 = new Insumo(131414, "Mascarilla Oxigeno Tipo 2", proveedor);

	 Pedido_insumo pedido_insumo = new Pedido_insumo(1, "28/01/2022", 10, insumo);
	Procedimiento procedimiento = new Procedimiento(1,"Control saturacion",pedido_insumo);	 
	
	
	 Especialidad especialidad1 = new Especialidad("11111", "Oncologia");
	 Especialidad especialidad2 = new Especialidad("2222", "Paramedico");

	 Profesional profesional1 = new Profesional("357-3", "Federico Ruiz Tagle", especialidad1);
	 Profesional profesional2 = new Profesional("558-8", "Miguel Molina", especialidad2);


	 Paciente paciente = new Paciente("55-8", "Juan Perez", "Isapre-Colmena", "Departamental # 12344");
	 Diagnostico diagnostico = new Diagnostico(33, "Fibrosis Quistica");
	 
	 Visita visita = new Visita(442233, "28/01/2022", "Pendiente", "Programada - Rutina - No urgencia", procedimiento, profesional1, diagnostico, paciente);
	 
	 System.out.println("Se ha generado Visita");
	 System.out.println("Paciente " + visita.getPaciente().getNombre_paciente() + " Fecha: " + visita.getFecha_visita()+ "- Dirección: " + visita.getPaciente().getDireccion_paciente()+ " - Tipo Visita: " + visita.getTipo_visita());
	 System.out.println("Diagnostico Paciente: " + visita.getDiagnostico().getNombre_diagnostico()+ "- Procedimiento: " + visita.getProcedimiento().getNombre_procedimiento()+"- Prevision paciente:"+ visita.getPaciente().getPrevision_paciente());
	 System.out.println("Profesional asignados: " + visita.getProfesional().getNombre()+ "- Especialidad: " + visita.getProfesional().getEspecialidad().getNombre_especialidad() + "- Rut: " + visita.getProfesional().getrut());
	 System.out.println("Insumos solicitados:"+ visita.getProcedimiento().getPedido_insumo().getInsumo().getNombre_insumo()+ " - " + insumo2.getNombre_insumo());
	 System.out.println("Estado Visita:" + visita.getEstado_visita());
	 System.out.println("----------------");


		 


		
	}
	
}
