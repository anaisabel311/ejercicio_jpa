package es.cursosprhib.ejemplo08;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contacto")
public class Persona07 implements Serializable{
	
	
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
	private Domicilio02 domicilio; // Este atributo ha sido mapeado en la clase Domicilio02
	
// Vamos a incluir la Tabla Teléfonos
	@ElementCollection // sólo se utiliza esta anotación cuando tienes objetos de clases básicas, en este caso, una coleccion de Strings, no hay más información.
	@CollectionTable (name ="telefonos", joinColumns = @JoinColumn(name = "idcontacto")) //La tabla donde se almacenan los teléfonos se llama "telefonos"
	// y tiene una columna "idcontacto" que es la FK a la tabla "contacto"
	@Column (name = "telefono")
	private Set<String> telefonos;

// Para asegurar que una clase de Persona07 tenga una cadena de String. Se usa SET para evitar teléfonos repetidos, linkedhashSet, 
	//te los devuelve ordenados. También te aseguras de que no halla nullss.
	
	public Persona07() {
		telefonos = new LinkedHashSet <String>();
	}
	
// Getters and Setters
	
	public Set<String> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(Set<String> telefonos) {
		this.telefonos = telefonos;
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
	
	@Embedded
	@AttributeOverride (name = "tipoVia", column = @Column(name = "tipovia"))
	public Domicilio02 getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio02 domicilio) {
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
		Persona07 other = (Persona07) obj;
		return Objects.equals(idcontacto, other.idcontacto);
	}
	@Override
	public String toString() {
		return "Persona06 [idcontacto=" + idcontacto + ", nombre=" + nombre + ", apellidos=" + apellidos + ", apodo="
				+ apodo + ", domicilio=" + domicilio + "]";
	}
	
// Éste método sirve para agregar teléfonos
	
	public void addTelefono (String telefono) {
		telefonos.add(telefono);
		
	}
	
	
	

}
