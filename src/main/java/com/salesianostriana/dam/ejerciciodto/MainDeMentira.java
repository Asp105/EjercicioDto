package com.salesianostriana.dam.ejerciciodto;

import com.salesianostriana.dam.ejerciciodto.DTO.AlumnoDTO;
import com.salesianostriana.dam.ejerciciodto.DTO.ProductoDTO;
import com.salesianostriana.dam.ejerciciodto.model.Alumno;
import com.salesianostriana.dam.ejerciciodto.model.Curso;
import com.salesianostriana.dam.ejerciciodto.model.Direccion;
import com.salesianostriana.dam.ejerciciodto.modelV2.Categoria;
import com.salesianostriana.dam.ejerciciodto.modelV2.Producto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MainDeMentira {

    public static void main(String[] args) {
        // 1. Probar la conversión de Alumno a AlumnoDTO
        Curso curso = new Curso(1L, "2º DAM", "Presencial", "Juan", "Aula 101");
        Direccion dir = new Direccion(1L, "Calle", "Mayor 15", "", "28001", "Madrid", "Madrid");
        Alumno alumno = new Alumno(1L, "Carlos", "García", "López", "600112233", "carlos@gmail.com", dir, curso);

        AlumnoDTO alumnoDTO = AlumnoDTO.of(alumno);
        System.out.println("RESULTADO ALUMNO DTO: " + alumnoDTO);

        // 2. Probar la conversión de Producto a ProductoDTO
        Categoria cat = new Categoria(1L, "Informática");
        Producto producto = new Producto(1L, "Portátil", "16GB RAM", 999.0, List.of("foto1.jpg"), cat);

        ProductoDTO productoDTO = ProductoDTO.of(producto);
        System.out.println("RESULTADO PRODUCTO DTO: " + productoDTO);
    }
}
