package com.salesianostriana.dam.ejerciciodto.DTO;

import com.salesianostriana.dam.ejerciciodto.model.Alumno;

import lombok.Value;


@Value
public class AlumnoDTO {
     String nombre;
     String apellidos;
     String email;
     String curso;
     String direccion;


    private AlumnoDTO(Alumno alumno) {
        this.nombre = alumno.getNombre();
        this.apellidos = alumno.getApellido1() + " " + alumno.getApellido2();
        this.email = alumno.getEmail();
        this.curso = (alumno.getCurso() !=null) ? alumno.getCurso().getNombre() : "";
        this.direccion = (alumno.getDireccion() !=null) ?
                alumno.getDireccion().getTipoVia()
                + " " + alumno.getDireccion().getLinea1() : "";
    }

    public static AlumnoDTO of(Alumno alumno){
        return new AlumnoDTO(alumno);
    }
}
