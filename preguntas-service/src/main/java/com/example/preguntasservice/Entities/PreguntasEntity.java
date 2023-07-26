package com.example.preguntasservice.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "pregunta")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreguntasEntity {
    @Id
    @NonNull
    private Long id;
    private String dificultad;
    private String pregunta;
    private String codigo;
    private String respuesta;

}
