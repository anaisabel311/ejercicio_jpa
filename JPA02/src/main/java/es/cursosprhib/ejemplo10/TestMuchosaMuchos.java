package es.cursosprhib.ejemplo10;

import es.cursosprhib.ejemplo02.EMF;
import jakarta.persistence.EntityManager;

public class TestMuchosaMuchos {
	
	public static void main (String[]args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Jugador j = em.find(Jugador.class, 10);
		System.out.println(j);
		
		System.out.println(j.getEquipos());
	}
	

}
