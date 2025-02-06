package es.cursosprhib.ejemplo10;

import java.util.List;

import es.cursosprhib.ejemplo02.EMF;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class TestJpql {

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
// buscamos objetos		
		String jpql = "select j from Jugador j";
		TypedQuery<Jugador> q = em.createQuery(jpql, Jugador.class);
		List <Jugador> jugadores = q.getResultList();
		
		for (Jugador jugador : jugadores) {
			System.out.println(jugador);
			for(Equipo equipo : jugador.getEquipos()) {
				System.out.println(equipo);
				
			}
		}
		

// vamos a buscar objetos por parámetros
		
		String nombre ="Pedro";
		jpql ="select j from Jugador j where j.nombreCompleto like :nom";
		q = em.createQuery(jpql, Jugador.class);
		q.setParameter("nom","%"+ nombre+"%");
		for(Jugador jugador : q.getResultList()) {
			System.out.println(jugador);
		}
		
		
	}

}
