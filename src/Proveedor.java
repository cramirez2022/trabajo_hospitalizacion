
public class Proveedor {

	private int Id_proveedor;
	private String Nombre_proveedor;	
	private String Rut_proveedor;	


	public Proveedor(int Id_proveedor, String Nombre_proveedor, String Rut_proveedor) {
		this.Id_proveedor = Id_proveedor;
		this.Nombre_proveedor = Nombre_proveedor;
		this.Rut_proveedor = Rut_proveedor;
}


	public int getId_proveedor() {
		return Id_proveedor;
	}


	public void setId_proveedor(int id_proveedor) {
		Id_proveedor = id_proveedor;
	}


	public String getNombre_proveedor() {
		return Nombre_proveedor;
	}


	public void setNombre_proveedor(String nombre_proveedor) {
		Nombre_proveedor = nombre_proveedor;
	}


	public String getRut_proveedor() {
		return Rut_proveedor;
	}


	public void setRut_proveedor(String rut_proveedor) {
		Rut_proveedor = rut_proveedor;
	}
	
}
