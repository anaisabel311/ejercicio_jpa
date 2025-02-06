package es.cursosprhib.ejemplo09;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "partidos")



public class Partido implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "idpartido")
	private Integer idpartido;
	private String partido;
		
	@ManyToOne
	@JoinColumn(name = "idcampo")
	private Campo campo;
	
	

//Getters and Setters
	
	public Integer getIdpartido() {
		return idpartido;
	}


	public void setIdpartido(Integer idpartido) {
		this.idpartido = idpartido;
	}


	public String getPartido() {
		return partido;
	}


	public void setPartido(String partido) {
		this.partido = partido;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idpartido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido other = (Partido) obj;
		return Objects.equals(idpartido, other.idpartido);
	}

	@Override
	public String toString() {
		return "Partido [idpartido=" + idpartido + ", partido=" + partido + "]";
	}
	

	
	

}
