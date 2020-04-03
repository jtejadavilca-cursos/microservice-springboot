package pe.com.capacitacion.ms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="cliente")
public class ClientEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "estado_id")
	private Integer stateId;

	@Column(name = "codigo")
	private String code;

	@Column(name = "razon_social")
	private String name;

	public static void main(String[] args) {
		ClientEntity client = new ClientEntity();
		client.setName("Juan");
		client.setCode("C0001");
		
		client.getName();
		client.getCode();
		
		System.out.println("cliente : " + client);
	}
}
