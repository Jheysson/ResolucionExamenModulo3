package pe.unjfsc.daw.spring5.entity;

public class CECompraEfectuada {
	private int no;
	private String codigoCliente;
	private String cliente;
	private String fechaCompra;
	private int codigoProducto;
	private String producto;
	private double cantidad;
	private double precioVenta;
	private double total;

	public CECompraEfectuada() {

	}

	public CECompraEfectuada(int xno, String xcodigoCliente, String xcliente, String xfechaCompra, int xcodigoProducto,
			String xproducto, double xcantidad, double xprecioVenta, double xtotal) {
		super();
		this.no=xno;
		this.codigoCliente=xcodigoCliente;
		this.cliente=xcliente;
		this.fechaCompra=xfechaCompra;
		this.codigoProducto=xcodigoProducto;
		this.producto=xproducto;
		this.cantidad=xcantidad;
		this.precioVenta=xprecioVenta;
		this.total=xtotal;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CECompraEfectuada [no=");
		builder.append(no);
		builder.append(", codigoCliente=");
		builder.append(codigoCliente);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append(", fechaCompra=");
		builder.append(fechaCompra);
		builder.append(", codigoProducto=");
		builder.append(codigoProducto);
		builder.append(", producto=");
		builder.append(producto);
		builder.append(", cantidad=");
		builder.append(cantidad);
		builder.append(", precioVenta=");
		builder.append(precioVenta);
		builder.append(", total=");
		builder.append(total);
		builder.append("]");
		return builder.toString();
	}

}
