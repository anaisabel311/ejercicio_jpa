package es.cursosprhib.testjpql;

import es.cursosprhib.ejemplo02.EMF;
import es.cursosprhib.ejemplo08.Persona06;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class Test01jpql {

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
// BUSCAR PERSONAS QUE VIVEN EN MADRID
		
		String paramciudad = "Madrid";
		String jpql = "select p from Persona06 p where p.domicilio.ciudad = :ciudad";
		TypedQuery<Persona06> q = em.createQuery(jpql, Persona06.class);
		q.setParameter("ciudad", paramciudad);
		
		
		
		for (Persona06 p : q.getResultList()) {
			System.out.println(p);
			
		}
	}

}
