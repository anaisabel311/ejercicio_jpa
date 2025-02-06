package es.cursosprhib.ejemplo07;

import es.cursosprhib.ejemplo02.EMF;
import jakarta.persistence.EntityManager;

public class Test07 {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Circulo2 c = em.find(Circulo2.class, 67);
		if (c != null)
			System.out.println(c);
		
		
		Rectangulo2 r = em.find(Rectangulo2.class, 68);
		if (r != null)
			System.out.println(r);
			
		
		Circulo2 nuevo = new Circulo2(11., 12., 13.);
		em.persist(nuevo);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		
	}

}
