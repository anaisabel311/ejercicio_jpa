package es.cursosprhib.ejemplo09;

import es.cursosprhib.ejemplo02.EMF;
import jakarta.persistence.EntityManager;

public class TestPartidos {

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Partido p=em.find(Partido.class, 1);
		System.out.println(p);
		
		System.out.println("----------------");
		
		Campo c=em.find(Campo.class, 1);
		System.out.println(c);
		
		for (Partido partido : c.getPartidos()) {
			System.out.println(partido);
		}
	}

}
