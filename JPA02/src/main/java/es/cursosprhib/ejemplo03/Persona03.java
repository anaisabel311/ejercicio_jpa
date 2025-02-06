package es.cursosprhib.ejemplo03;

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
import jakarta.persistence.Table;

@Entity
@Table(name = "persona_04")
public class Persona03 implements Serializable, Comparable<Persona03>{
	
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPersona")
	private Integer idPersona;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellidos")
	private String apellidos;
	@Column(name = "apodo")
	private String apodo;
	@Column(name = "dni")
	private String dni;
	@Column(name = "genero")
//	@Enumerated (EnumType.STRING)
	private Genero genero;
	
// No es una tabla, sino es un insertable, es decir, en la bbdd está todo en la misma tabla persona_04.
//	@Embedded
//	private Domicilio domicilio;
	
//Se realiza en el insertado Domicilio
	
//	@Embedded
//	@AttributeOverride (name = "tipoVia", column = @Column(name = "tipovia")) // todas las anotaciones AttributeOverride son por separado
	private Domicilio domicilio;


	
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		System.out.println("Está accediendo por propiedades no por atributos");
		this.idPersona = idPersona;
	}
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Enumerated (EnumType.STRING)
	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
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
		return Objects.hash(idPersona);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona03 other = (Persona03) obj;
		return Objects.equals(idPersona, other.idPersona);
	}
	
	@Override
	
	public int compareTo(Persona03 o) {
		return Integer.compare(this.idPersona, o.idPersona);
	}
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", apodo="
				+ apodo + ", dni=" + dni + "]";
	}
	
	
	
	
	
	
	
	
	

}
