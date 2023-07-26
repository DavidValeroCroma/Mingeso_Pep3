package com.example.preguntasservice.Repositories;

import com.example.preguntasservice.Entities.PreguntasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PreguntasRespository extends JpaRepository<PreguntasEntity, Long> {
    public List<PreguntasEntity> findByDificultad(String dificultad);

}
