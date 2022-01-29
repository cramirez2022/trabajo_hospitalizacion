
public class Procedimiento {
	
	private int id_procedimiento;
	private String nombre_procedimiento;
	private Pedido_insumo pedido_insumo;
 
	public Procedimiento(int id_procedimiento, String nombre_procedimiento, Pedido_insumo pedido_insumo) {
		this.id_procedimiento = id_procedimiento;
		this.nombre_procedimiento = nombre_procedimiento;
		this.pedido_insumo = pedido_insumo;
	}

	public int getId_procedimiento() {
		return id_procedimiento;
	}

	public void setId_procedimiento(int id_procedimiento) {
		this.id_procedimiento = id_procedimiento;
	}

	public String getNombre_procedimiento() {
		return nombre_procedimiento;
	}

	public void setNombre_procedimiento(String nombre_procedimiento) {
		this.nombre_procedimiento = nombre_procedimiento;
	}

	public Pedido_insumo getPedido_insumo() {
		return pedido_insumo;
	}

	public void setPedido_insumo(Pedido_insumo pedido_insumo) {
		this.pedido_insumo = pedido_insumo;
	}

	
	
	
}
