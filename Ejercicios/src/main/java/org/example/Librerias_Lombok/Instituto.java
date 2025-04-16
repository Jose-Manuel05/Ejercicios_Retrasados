package org.example.Librerias_Lombok;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter @Setter
@AllArgsConstructor
@ToString
public class Instituto {

    @NonNull
    private String nombre;
    private String poblacion;
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private ArrayList<Curso> listaCursos = new ArrayList<>();

    public Instituto(String nombre) {
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
    }

    public List<Estudiante> getListaEstudiantes() {
        return new ArrayList<>(listaEstudiantes);
    }

    public List<Curso> getListaCursos() {
        return new ArrayList<>(listaCursos);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante == null) {
            System.out.println("No se puede agregar un estudiante null");
        }
        listaEstudiantes.add(estudiante);
    }

    public void agregarCurso(Curso curso) {
        if (curso == null) {
            System.out.println("No se puede agregar un curso null");
        }
        listaCursos.add(curso);
    }

}
