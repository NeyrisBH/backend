package com.tucita.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tucita.backend.model.Cita;

@Service
public interface CitaService {
	public List<Cita> consultarCitas();
}
