package es.cursosprhib.ejemplo03;

import es.cursosprhib.ejemplo02.EMF;
import jakarta.persistence.EntityManager;

public class Test03 {

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Persona03 p=em.find(Persona03.class, 1);
		System.out.println(p);
	}

}
