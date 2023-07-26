package com.example.preguntasservice.Controllers;

import com.example.preguntasservice.Entities.PreguntasEntity;
import com.example.preguntasservice.Services.PreguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/preguntas")
public class PreguntasController {
    @Autowired
    PreguntasService preguntasService;

    @GetMapping
    public ResponseEntity<List<PreguntasEntity>> findAllPreguntas(){
        List<PreguntasEntity> preguntas = preguntasService.obtenerPreguntas();
        if (preguntas.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(preguntas);
    }
    @GetMapping("/{dificultad}")
    public ResponseEntity<List<PreguntasEntity>> findPreguntasByDif(@PathVariable("difucultad") String difucultad ){
        List<PreguntasEntity> preguntas = preguntasService.obtenerPorDificultad(difucultad);
        if (preguntas.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(preguntas);
    }
    @PostMapping("/upload")
    public ResponseEntity<PreguntasEntity> savePregunta(@RequestBody PreguntasEntity pruebasEntity) {
        ResponseEntity<PreguntasEntity> response = preguntasService.savePregunta(pruebasEntity);
        return response;
    }
}
