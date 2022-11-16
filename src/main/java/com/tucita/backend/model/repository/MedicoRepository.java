package com.tucita.backend.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.tucita.backend.model.Medico;

@Repository
public interface MedicoRepository extends MongoRepository<Medico, Long>{

}
