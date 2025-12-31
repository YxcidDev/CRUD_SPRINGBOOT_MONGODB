package com.app.web.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.app.web.entidad.Estudiante;

@Repository
public interface EstudianteRepositorio extends MongoRepository<Estudiante, String> {
}
