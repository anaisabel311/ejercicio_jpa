package es.cursosprhib.jpa01.ejemplo01;

import jakarta.persistence.EntityManager;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = EMF.getInstance().createEntityManager();
		Persona p = em.find(Persona.class, 1);
		System.out.println(p);
		
		Persona nuevo = new Persona (); nuevo.setApellidos("Fernadez Perez");
		nuevo.setApodo("Nando");
		nuevo.setApellidos("Fernandez Perez");
		nuevo.setDni("4567Nuevo");
		
		nuevo.setNombre("Fernando");
		 
		em.getTransaction().begin();
		em.persist(nuevo);
//		em.merge(p); // actualización
		em.getTransaction().commit();
		
		System.out.println(nuevo);
		
		
		
		
		

	}

}
