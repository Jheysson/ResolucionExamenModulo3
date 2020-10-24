package pe.unjfsc.daw.spring5.entity;

public class CEProducto {
	private int id;
	private String categoria;
	private String clase;
	private String tipoProducto;
	private String marca;
	private String modelo;
	private double precioVenta;
	
	public CEProducto () {}
	
	
	
	public CEProducto(int id, String categoria, String clase, String tipoProducto, String marca, String modelo,
			double precioVenta) {
	
		this.id = id;
		this.categoria= categoria;
		this.clase = clase;
		this.tipoProducto = tipoProducto;
		this.marca = marca;
		this.modelo = modelo;
		this.precioVenta = precioVenta;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public String getClase() {
		return clase;
	}



	public void setClase(String clase) {
		this.clase = clase;
	}



	public String getTipoProducto() {
		return tipoProducto;
	}



	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public double getPrecioVenta() {
		return precioVenta;
	}



	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEProducto [id=");
		builder.append(id);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append(", clase=");
		builder.append(clase);
		builder.append(", tipoProducto=");
		builder.append(tipoProducto);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", precioVenta=");
		builder.append(precioVenta);
		builder.append("]");
		return builder.toString();
	}

}
