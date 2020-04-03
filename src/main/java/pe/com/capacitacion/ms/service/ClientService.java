package pe.com.capacitacion.ms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.capacitacion.ms.entity.ClientEntity;
import pe.com.capacitacion.ms.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public ClientEntity buscarPorId( Long id ) {
		Optional<ClientEntity> optClient = clientRepository.findById(id);
		
		if(optClient.isPresent()) {
			return optClient.get();
		}
		
		return ClientEntity
			.builder()
			.name("No hay")
			.build();
	}
	
	public Iterable<ClientEntity> buscarTodos(){
		return clientRepository.findAll();
	}
}
