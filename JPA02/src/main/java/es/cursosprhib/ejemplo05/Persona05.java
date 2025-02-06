package es.cursosprhib.ejemplo05;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;



@Entity
@Table (name = "persona_03")


public class Persona05 implements Serializable{
	
	@EmbeddedId
	@AttributeOverride(name = "nroDoc", column = @Column(name = "nroDoc"))
	@AttributeOverride(name = "letraDoc", column = @Column(name = "letraDoc"))

	private Persona05Id idpersona;
	private String nombre;
	public Persona05Id getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(Persona05Id idpersona) {
		this.idpersona = idpersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idpersona, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona05 other = (Persona05) obj;
		return Objects.equals(idpersona, other.idpersona) && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Persona05 [idpersona=" + idpersona + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
}
	
	
