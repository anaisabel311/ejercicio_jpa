package es.cursosprhib.ejemplo08;

import es.cursosprhib.ejemplo02.EMF;
import jakarta.persistence.EntityManager;

public class TestColecciones {

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Persona07 p=em.find(Persona07.class, 2);
		System.out.println(p);
		
		
		System.out.println(p.getTelefonos());
		
	}

}
