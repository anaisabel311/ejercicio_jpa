package es.cursosprhib.ejemplo06;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue ("CIRCULO")
public class Circulo extends Figura {
	
	@Column (name = "r")
	private Double radio;
	
// Constructor
	
	public Circulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Circulo(Double x, Double y, Double radio) {
		super(x, y);
		this.radio = radio;
		
	}

// Getters and Setters
	
	

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}
	
	

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", getRadio()=" + getRadio() + ", getIdFigura()=" + getIdFigura()
				+ ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	
	
		
		

}
