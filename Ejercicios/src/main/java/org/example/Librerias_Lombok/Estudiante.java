package org.example.Librerias_Lombok;

import lombok.*;

@Getter @Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class Estudiante {

    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;

}
