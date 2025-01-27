package es.cursosprhib.jpa03ejerciciojpa.modelo;


import jakarta.persistence.EntityManager;

public class Testjpa03Modelo {

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Persona p=em.find(Persona.class, 5);
		System.out.println(p);
		
		/*
		 * Cliente c = em.find(Cliente.class, 10);
		 * System.out.print("El siguiente cliente con número " + c.getNroCliente()+
		 * "y con los siguientes productos " + c.getProductos()+
		 * "tiene el siguiente número Id "+ c.getIdPersona()+
		 * "con el siguiente numero de empleado " + c.) + "y número de categoría " +
		 * c.getCategoria()+ "y colabora con las siguientes secciones " + c.;
		 */
	}

}
