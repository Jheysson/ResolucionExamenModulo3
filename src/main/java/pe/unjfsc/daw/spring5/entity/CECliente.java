package pe.unjfsc.daw.spring5.entity;

public class CECliente {
	private String codigoCliente;
	private String apellidosNombres;
	private String correo;
	
	public CECliente() {	
	}
	
	public CECliente(String xcodigoCliente, String xApellidosNombres, String xCorreo) {
		super();
		this.codigoCliente = xcodigoCliente;
		this.apellidosNombres = xApellidosNombres;
		this.correo = xCorreo;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getApellidosNombres() {
		return apellidosNombres;
	}

	public void setApellidosNombres(String apellidosNombres) {
		this.apellidosNombres = apellidosNombres;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CECliente [codigoCliente=");
		builder.append(codigoCliente);
		builder.append(", apellidosNombres=");
		builder.append(apellidosNombres);
		builder.append(", correo=");
		builder.append(correo);
		builder.append("]");
		return builder.toString();
	}

	
	
}
