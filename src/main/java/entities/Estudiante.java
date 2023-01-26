package entities;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

final public class Estudiante {

    private final String nombre;
    private final Integer edad;
    private final LocalDate fechaFinalizacion;
    private final List<Materia> materiasCursadas;

    public Estudiante(final String nombre, final Integer edad, final LocalDate fechaFinalizacion, List<Materia> materiasCursadas) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaFinalizacion = fechaFinalizacion;
        this.materiasCursadas = materiasCursadas;
    }

    public String getFechaFinalizacion() {
        return String.valueOf(this.fechaFinalizacion.getYear()) + String.valueOf(String.format("%02d", this.fechaFinalizacion.getMonthValue()));
    }

    public Integer getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<Materia> getMateriasCursadas() {
        return Collections.unmodifiableList(this.materiasCursadas);
    }

}
