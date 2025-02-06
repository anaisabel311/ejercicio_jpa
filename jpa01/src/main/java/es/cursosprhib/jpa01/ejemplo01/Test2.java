package es.cursosprhib.jpa01.ejemplo01;

import jakarta.persistence.EntityManager;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = EMF.getInstance().createEntityManager();
		Persona p = em.find(Persona.class, 2);
		System.out.println(p);
		
		
		
		em.getTransaction().begin();

		em.remove(p); // delete
		em.getTransaction().commit();
		
		System.out.println(p + "ha sido eliminado");
		
		
		
		
		

	}

}
