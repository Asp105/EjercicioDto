package com.salesianostriana.dam.ejerciciodto.DTO;


import com.salesianostriana.dam.ejerciciodto.modelV2.Producto;

import lombok.Value;


@Value
public class ProductoDTO {

    String nombre;
    Double pvp;
    String imagen;
    String categoria;

    private ProductoDTO (Producto producto){
        this.nombre = producto.getNombre();
        this.pvp = producto.getPvp();
        this.imagen = (producto.getImagenes() != null && !producto.getImagenes().isEmpty())
                ? producto.getImagenes().get(0)
                : "";
        this.categoria = (producto.getCategoria() != null) ? producto.getCategoria().getNombre() : "";
    }

    public static ProductoDTO of(Producto producto){
        return new ProductoDTO(producto);
    }
}
