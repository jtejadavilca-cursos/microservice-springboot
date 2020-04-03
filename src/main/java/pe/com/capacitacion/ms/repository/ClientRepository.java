package pe.com.capacitacion.ms.repository;

import org.springframework.data.repository.CrudRepository;

import pe.com.capacitacion.ms.entity.ClientEntity;

public interface ClientRepository extends CrudRepository<ClientEntity, Long>{

}
