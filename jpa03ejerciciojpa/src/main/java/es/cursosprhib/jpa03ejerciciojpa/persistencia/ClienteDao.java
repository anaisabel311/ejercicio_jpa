package es.cursosprhib.jpa03ejerciciojpa.persistencia;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import es.cursosprhib.jpa03ejerciciojpa.modelo.dto.ClienteDto;

public interface ClienteDao {

	// Método Grabar
	
	public Cliente save (Cliente cliente);
	
	// Método Eliminar por ID
	
	public void deleteById (Integer id);
	
	// Método Eliminar Objeto
	
	public void delete (Cliente cliente);
	
	//Método buscar por ID
	
	public Cliente getById (Integer id);
	
	// Método buscar todos
	
	public List<ClienteDto> findAll(); // creado ClienteDto, sólo para mandar a la capa vista.
	
	// Método Buscar por Apellidos
	
	public List<ClienteDto> findByApellidos (String apellidos);
	
	// Método Buscar por nroCliente
	
	public Cliente getByNroCliente (Integer nroCliente);
	
	
}
