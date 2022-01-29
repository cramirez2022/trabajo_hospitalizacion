
public class Insumo {
	private int Id_insumo;
	private String Nombre_insumo;
	private Proveedor proveedor;
	

	public Insumo(int Id_insumo, String Nombre_insumo, Proveedor proveedor) {
		this.Id_insumo = Id_insumo;
		this.Nombre_insumo = Nombre_insumo;
		this.proveedor = proveedor;
		}


	public int getId_insumo() {
		return Id_insumo;
	}


	public void setId_insumo(int id_insumo) {
		Id_insumo = id_insumo;
	}


	public String getNombre_insumo() {
		return Nombre_insumo;
	}


	public void setNombre_insumo(String nombre_insumo) {
		Nombre_insumo = nombre_insumo;
	}


	public Proveedor getProveedor() {
		return proveedor;
	}


	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	
}
