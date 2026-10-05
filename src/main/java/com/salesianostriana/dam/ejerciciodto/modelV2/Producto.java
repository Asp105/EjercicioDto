package com.salesianostriana.dam.ejerciciodto.modelV2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    private Long id;
    private String nombre;
    private String desc;
    private Double pvp;
    private List<String> imagenes;
    private Categoria categoria;
}
