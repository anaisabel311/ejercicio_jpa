package es.cursosprhib.ejemplo08;

import java.io.Serializable;
import java.util.Objects;

import es.cursosprhib.ejemplo02.Genero;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contacto")
public class Persona06 implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "idcontacto")
	private Integer idcontacto;
	
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellidos")
	private String apellidos;
	@Column(name = "apodo")
	private String apodo;
	
	

//	Mapeo Tabla domicilio, iddomicilio es la fk de la tabla contacto que apunta a la Tabla Domicilio.
	
	@OneToOne
	@JoinColumn (name  = "iddomicilio")
	private Domicilio domicilio;


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	@Embedded
	@AttributeOverride (name = "tipoVia", column = @Column(name = "tipovia"))
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idcontacto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona06 other = (Persona06) obj;
		return Objects.equals(idcontacto, other.idcontacto);
	}
	@Override
	public String toString() {
		return "Persona06 [idcontacto=" + idcontacto + ", nombre=" + nombre + ", apellidos=" + apellidos + ", apodo="
				+ apodo + ", domicilio=" + domicilio + "]";
	}
	
	
	
	
	

}
