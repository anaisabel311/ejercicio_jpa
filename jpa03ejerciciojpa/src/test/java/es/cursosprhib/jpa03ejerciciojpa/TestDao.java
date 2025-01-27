package es.cursosprhib.jpa03ejerciciojpa;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import es.cursosprhib.jpa03ejerciciojpa.modelo.dto.ClienteDto;
import es.cursosprhib.jpa03ejerciciojpa.negocio.ClienteMapper;
import es.cursosprhib.jpa03ejerciciojpa.persistencia.ClienteDao;
import es.cursosprhib.jpa03ejerciciojpa.persistencia.ClienteDaoImpl;

public class TestDao {

	public static void main(String[] args) {
		
		ClienteDao cDao = new ClienteDaoImpl();
		
		Cliente c = cDao.getById(14);
		System.out.println(c);
		System.out.println(c.getProductos());
		
		System.out.println("---ByNroCliente----");
		
		Cliente c1 = cDao.getByNroCliente(1987);
		System.out.println(c1);
		System.out.println(c1.getProductos());
		
		System.out.println("------findAll-----");
		
		List<ClienteDto> clis = cDao.findAll();
		for (ClienteDto clienteDto : clis) {
			System.out.println(clienteDto);
			
			System.out.println("------find Id 19 y muestra sus productos-----");
			if(clienteDto.getIdPersona()== 19) {
				Cliente buscado = cDao.getById(clienteDto.getIdPersona());
				System.out.println(buscado.getProductos());
			}
		}

		System.out.println("------findApellidos-----");
		List<ClienteDto> clisNuevo = cDao.findByApellidos("ez");
		for (ClienteDto clienteDto : clisNuevo) {
			System.out.println(clienteDto);
		}
		
		System.out.println("------Cliente nuevo-----");
		ClienteDto nuevo = new ClienteDto(null, "Perez Perez", 9893858);
		Cliente cliNuevo = cDao.save(ClienteMapper.toCliente(nuevo));
		System.out.println(cliNuevo);
		
		
		System.out.println("----Modificar cliente 14 -----");
		c.setCategoria("NUEVA");
		cDao.save(c);
		
		System.out.println("----Borrar cliente 19 -----");
//		cDao.deleteById(19);
	}

}
