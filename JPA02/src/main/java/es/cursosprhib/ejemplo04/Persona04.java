package es.cursosprhib.ejemplo04;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;



@Entity
@Table (name = "persona_03")
@IdClass (Persona04Id.class)

public class Persona04 implements Serializable{

	@Id
	@Column (name = "nroDoc")
	private int nroDoc;
	
	@Id
	@Column (name = "letraDoc")
	private char letraDoc;
	private String nombre;
	
	
	
	
	
	
	public int getNroDoc() {
		return nroDoc;
	}
	public void setNroDoc(int nroDoc) {
		this.nroDoc = nroDoc;
	}
	public char getLetraDoc() {
		return letraDoc;
	}
	public void setLetraDoc(char letraDoc) {
		this.letraDoc = letraDoc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(letraDoc, nombre, nroDoc);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona04 other = (Persona04) obj;
		return letraDoc == other.letraDoc && Objects.equals(nombre, other.nombre) && nroDoc == other.nroDoc;
	}
	@Override
	public String toString() {
		return "Persona04 [nroDoc=" + nroDoc + ", letraDoc=" + letraDoc + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
}
