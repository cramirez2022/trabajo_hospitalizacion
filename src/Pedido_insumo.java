
public class Pedido_insumo {
	
	private int id_pedido;
	private String fecha_pedido;
	private int cantidad_pedido;
	private Insumo insumo;

	public Pedido_insumo(int id_pedido, String fecha_pedido, int cantidad_pedido, Insumo insumo) {
		this.id_pedido = id_pedido;
		this.fecha_pedido = fecha_pedido;
		this.cantidad_pedido = cantidad_pedido;
		this.insumo = insumo;
	}

	public int getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}

	public String getFecha_pedido() {
		return fecha_pedido;
	}

	public void setFecha_pedido(String fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}

	public int getCantidad_pedido() {
		return cantidad_pedido;
	}

	public void setCantidad_pedido(int cantidad_pedido) {
		this.cantidad_pedido = cantidad_pedido;
	}

	public Insumo getInsumo() {
		return insumo;
	}

	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}
	
		
}
