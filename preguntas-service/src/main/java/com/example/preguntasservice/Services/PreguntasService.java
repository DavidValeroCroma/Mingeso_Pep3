package com.example.preguntasservice.Services;

import com.example.preguntasservice.Entities.PreguntasEntity;
import com.example.preguntasservice.Repositories.PreguntasRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntasService {
    @Autowired
    PreguntasRespository preguntasRespository;

    public List<PreguntasEntity> obtenerPreguntas(){
        return (List<PreguntasEntity>) preguntasRespository.findAll();
    }
    public List<PreguntasEntity> obtenerPorDificultad(String dif){
        return (List<PreguntasEntity>) preguntasRespository.findByDificultad(dif);
    }

    public ResponseEntity<PreguntasEntity> savePregunta(PreguntasEntity pregunta){
        PreguntasEntity nuevaPregunta = preguntasRespository.save(pregunta);
        return ResponseEntity.ok(pregunta);
    }

}
