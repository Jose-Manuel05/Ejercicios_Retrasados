package org.example.Librerias_Lombok;

import lombok.*;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class Curso {

    @NonNull
    private String nombre;
    private int horas;

}
