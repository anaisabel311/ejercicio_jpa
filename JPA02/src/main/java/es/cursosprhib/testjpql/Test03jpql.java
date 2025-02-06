package es.cursosprhib.testjpql;

import es.cursosprhib.ejemplo02.EMF;

import es.cursosprhib.ejemplo08.Persona07;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class Test03jpql {

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
// BUSCAR CADA CONTACTO QUE TIENE DOMICILIO
//		String jpql = "select p from Persona07 p";
		
// BUSCAR,TAMBIEN, EL TELÉFONO DE CADA CONTACTO	Y CON SU DOMICILIO	
		String jpql = "select p from Persona07 p left join fetch p.telefonos left join fetch p.domicilio";
		TypedQuery<Persona07> q = em.createQuery(jpql, Persona07.class);

		
		
		
		for (Persona07 p : q.getResultList()) {
			System.out.println(p);
			for (String telefono : p.getTelefonos()) {
				System.out.println(telefono);
			}
			
		}
	}

}
