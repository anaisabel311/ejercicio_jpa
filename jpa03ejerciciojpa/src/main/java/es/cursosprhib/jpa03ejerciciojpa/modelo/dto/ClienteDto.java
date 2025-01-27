package es.cursosprhib.jpa03ejerciciojpa.modelo.dto;

public class ClienteDto {
	// necesitamos este dto para saber qué enviamos al cliente, es decir, si hace una busqueda a la bbdd de clientes, quizás no haga falta
	// cargar todos sus productos, con el nombre, idCliente, dirección y poco más, es suficiente.
	
	private Integer idPersona;
	private String apellidos;
	private Integer nroCliente;
	
// constructor
	public ClienteDto(Integer idPersona, String apellidos, Integer nroCliente) {
		super();
		this.idPersona = idPersona;
		this.apellidos = apellidos;
		this.nroCliente = nroCliente;
	}

// getters and setters	
	
	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(Integer nroCliente) {
		this.nroCliente = nroCliente;
	}

	@Override
	public String toString() {
		return "ClienteDto [idPersona=" + idPersona + ", apellidos=" + apellidos + ", nroCliente=" + nroCliente + "]";
	}
	
	

	
	

}
