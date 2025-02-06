package es.cursosprhib.testjpql;

import es.cursosprhib.ejemplo02.EMF;
import es.cursosprhib.ejemplo08.Persona06;
import es.cursosprhib.ejemplo09.Campo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class Test02jpql {

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
// CAMPOS DONDE SE JUGARON PARTIDOS DE SEMIFINAL
		
		String paramPartido = "Semifinal";
		String jpql = "select c from Campo c join c.partidos p where p.partido = :part";
		TypedQuery<Campo> q = em.createQuery(jpql, Campo.class);
		q.setParameter("part","%"+ paramPartido + "%");
		
		
		
		for (Campo c : q.getResultList()) {
			System.out.println(c);
			
		}
	}

}
