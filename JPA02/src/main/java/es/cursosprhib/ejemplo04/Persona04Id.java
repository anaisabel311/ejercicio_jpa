package es.cursosprhib.ejemplo04;

import java.io.Serializable;
import java.util.Objects;

public class Persona04Id implements Serializable{
	
	private int nroDoc;
	private char letraDoc;
	
	
// Constructor
	
	public Persona04Id() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Persona04Id(int nroDoc, char letraDoc) {
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
		Persona04Id other = (Persona04Id) obj;
		return letraDoc == other.letraDoc && nroDoc == other.nroDoc;
	}
	
	
	

}
