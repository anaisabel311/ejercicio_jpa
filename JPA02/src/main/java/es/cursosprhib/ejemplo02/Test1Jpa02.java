package es.cursosprhib.ejemplo02;

import jakarta.persistence.EntityManager;

public class Test1Jpa02 {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Persona02 p1 = em.find(Persona02.class, 5);
		Persona02 p2 = em.find(Persona02.class, 10);
		
		p1.setApodo("NUEVO");
		
		Persona02 p = new Persona02();
		
		p.setApellidos("Díez Mendez");
		p.setApodo("Luli");
		p.setDni("934729");
		p.setGenero(Genero.f);
		p.setNombre("Lourdes");
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p);
		
		
	
		
	}

}
