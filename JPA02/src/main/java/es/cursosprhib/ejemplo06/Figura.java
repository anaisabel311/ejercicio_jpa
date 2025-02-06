package es.cursosprhib.ejemplo06;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;


@Entity
@Table (name = "figuras01")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name = "tipo_figura", discriminatorType=DiscriminatorType.STRING)
public abstract class  Figura implements Serializable{
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "idfigura")
	private Integer Idfigura;
	private Double x;
	private Double y;
	
// Getters and Setters
	
	public Integer getIdFigura() {
		return Idfigura;
	}
	public void setIdFigura(Integer idFigura) {
		Idfigura = idFigura;
	}
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public Double getY() {
		return y;
	}
	public void setY(Double y) {
		this.y = y;
	}
	
// Constructor
	
	public Figura() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Figura(Double x, Double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
// funcionalidades
	
	@Override
	public int hashCode() {
		return Objects.hash(Idfigura, x, y);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		return Objects.equals(Idfigura, other.Idfigura) && Objects.equals(x, other.x) && Objects.equals(y, other.y);
	}
	@Override
	public String toString() {
		return "Figura [IdFigura=" + Idfigura + "]";
	}
	

	
	

}
