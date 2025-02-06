package es.cursosprhib.ejemplo08;

import es.cursosprhib.ejemplo02.EMF;
import jakarta.persistence.EntityManager;

public class TestBidireccional {

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Persona07 p=em.find(Persona07.class, 7);
		System.out.println(p);
		
		
		Domicilio02 dom = em.find(Domicilio02.class, 4);
		System.out.println(dom);
		System.out.println(dom.getPersona());
		
	}

}
