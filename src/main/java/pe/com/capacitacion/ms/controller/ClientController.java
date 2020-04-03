package pe.com.capacitacion.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.capacitacion.ms.entity.ClientEntity;
import pe.com.capacitacion.ms.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping("/{id}")
	public ClientEntity buscarPorId(@PathVariable Long id) {
		return clientService.buscarPorId(id);
	}
	
	@GetMapping("/")
	public Iterable<ClientEntity> buscarTodos() {
		return clientService.buscarTodos();
	}

}
