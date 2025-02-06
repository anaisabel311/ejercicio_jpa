package es.cursosprhib.ejemplo09;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "campos")

public class Campo implements Serializable {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name = "idcampo")
	private Integer idcampo;
	private String campo;
	private String direccion;
	
	@OneToMany (mappedBy ="campo")
	private Set<Partido> partidos;
	
	
// getters and setters
	
	
	
	public Integer getIdcampo() {
		return idcampo;
	}
	public Set<Partido> getPartidos() {
		return partidos;
	}
	public void setPartidos(Set<Partido> partidos) {
		this.partidos = partidos;
	}
	public void setIdcampo(Integer idcampo) {
		this.idcampo = idcampo;
	}
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idcampo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Campo other = (Campo) obj;
		return Objects.equals(idcampo, other.idcampo);
	}

	@Override
	public String toString() {
		return "Campo [idcampo=" + idcampo + ", campo=" + campo + ", direccion=" + direccion + "]";
	}
	

	
}
