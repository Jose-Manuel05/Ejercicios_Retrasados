package org.example.Copa_Rey;


public class Entrenador extends MutxamelFC implements AccionesDeportivas {


    private Equipos equipo;
    private String formacionPreferida = "4-3-3";

    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        setFormacionPreferida(formacionPreferida);
    }

    public void setFormacionPreferida(String formacionPreferida) {
        if(formacionPreferida.matches("\\d-\\d-\\d")) {
            this.formacionPreferida = formacionPreferida;
        } else {
            throw new FormacionInvalidaException("La formación debe tener el formato N-N-N. Formato recibido: " + formacionPreferida);
        }
    }

    public void palnificarEntrenamiento() {
        System.out.println("El entrenador " + this.getNombre() + " planifica el entrenamiento.");
    }

    public void hacerCambios() {
        System.out.println("El entrenador " + this.getNombre() + " hace cambios en el equipo.");
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + this.getNombre() + " se concentra con el equipo.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El entrenador " + this.getNombre() + " viaja a " + ciudad + " con el equipo.");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador " + this.getNombre() + " entrena al equipo.");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El entrenador " + this.getNombre() + " dirige el partido contra " + rival + ".");
    }

    @Override
    public void celebrarGol() {
        System.out.println("El entrenador " + this.getNombre() + " celebra el gol del equipo.");
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "nombre='" + getNombre() +
                ", edad=" + getEdad() +
                ", equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }
}
