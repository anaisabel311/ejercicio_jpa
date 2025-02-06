package es.cursosprhib.ejemplo06;

import es.cursosprhib.ejemplo02.EMF;
import jakarta.persistence.EntityManager;

public class Test06 {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Circulo c = em.find(Circulo.class, 27);
		if (c != null)
			System.out.println(c);
		
		
		Rectangulo r = em.find(Rectangulo.class, 26);
		if (r != null)
			System.out.println(r);
			
		
		Circulo nuevo = new Circulo(11., 12., 13.);
		em.persist(nuevo);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		
	}

}
