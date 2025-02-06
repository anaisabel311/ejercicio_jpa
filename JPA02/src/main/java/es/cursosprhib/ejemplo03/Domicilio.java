package es.cursosprhib.ejemplo03;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable 

public class Domicilio implements Serializable {

//	@Column (name = "tipovia") está comentada porque está insertada en Persona 03 como @AttributeOverride
	private String tipoVia;
	private String via;
	private int numero;
	private int piso;
	private String puerta;
	private String codigopostal;
	private String ciudad;
	private String provincia;
	
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
	public String getCodigoPostal() {
		return codigopostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigopostal = codigoPostal;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ciudad, codigopostal, numero, piso, provincia, puerta, tipoVia, via);
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
		return Objects.equals(ciudad, other.ciudad) && Objects.equals(codigopostal, other.codigopostal)
				&& numero == other.numero && piso == other.piso && Objects.equals(provincia, other.provincia)
				&& Objects.equals(puerta, other.puerta) && Objects.equals(tipoVia, other.tipoVia)
				&& Objects.equals(via, other.via);
	}
	@Override
	public String toString() {
		return "Domicilio [" + tipoVia + ", " + via + ", " + numero + ", " + piso + ", " + puerta + ", " + codigopostal
				+ ", " + ciudad + ", " + provincia + "]";
	}
}
