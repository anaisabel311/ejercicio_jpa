package es.cursosprhib.ejemplo07;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "circulo_02")

public class Circulo2 extends Figura2 {
	
	@Column (name = "r")
	private Double radio;
	
// Constructor
	
	public Circulo2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Circulo2(Double x, Double y, Double radio) {
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
