package es.cursosprhib.ejemplo05;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;


@Embeddable

public class Persona05Id implements Serializable{
	
	private int nroDoc;
	private char letraDoc;
	
	
// Constructor
	
	public Persona05Id() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Persona05Id(int nroDoc, char letraDoc) {
		super();
		this.nroDoc = nroDoc;
		this.letraDoc = letraDoc;
	}
	
// Getter and Setters
	
	
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
	
	
// Métodos
	
	
	@Override
	public int hashCode() {
		return Objects.hash(letraDoc, nroDoc);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona05Id other = (Persona05Id) obj;
		return letraDoc == other.letraDoc && nroDoc == other.nroDoc;
	}
	
	
	

}
