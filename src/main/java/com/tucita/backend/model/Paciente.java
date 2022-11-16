package com.tucita.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("paciente")
public class Paciente {
	@Id
	private Long id;
	private String nombres;
	private String primerApellido;
	private String segundoApellido;
	private Byte genero;
	private Long edad;
}
