package es.cursosprhib.ejemplo08;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "domicilio")

public class Domicilio implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer iddomicilio;
	
//	@Column (name = "tipovia") está comentada porque está insertada en Persona 03 como @AttributeOverride
	private String tipoVia;
	private String via;
	private int numero;
	private int piso;
	private String puerta;
	private String ciudad;
	
	
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public String getPuerta() {
		return puerta;
	}
	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	@Override
	public int hashCode() {
		return Objects.hash(iddomicilio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Domicilio other = (Domicilio) obj;
		return Objects.equals(iddomicilio, other.iddomicilio);
	}
	@Override
	public String toString() {
		return "Domicilio [iddomicilio=" + iddomicilio + ", tipoVia=" + tipoVia + ", via=" + via + ", numero=" + numero
				+ ", piso=" + piso + ", puerta=" + puerta + ", ciudad=" + ciudad + "]";
	}
	
	
	
}
