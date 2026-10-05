package com.salesianostriana.dam.ejerciciodto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
    private Long id;
    private String nombre;
    private String tipo;
    private String tutor;
    private String aula;
}
