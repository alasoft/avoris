import entities.Estudiante;
import entities.Materia;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EstudianteTest {

    @Test
    public void testMateriasCursadasInmutability() {

        Estudiante estudiante = this.newEstudiante();

        List<Materia> list = estudiante.getMateriasCursadas();

        try {
            list.add(new Materia("álgebra", 4));
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        assert (list.size() == 3);

    }

    @Test
    public void testFechaFinalizacion() {

        Estudiante estudiante = this.newEstudiante();

        String fechaFinalizacion = estudiante.getFechaFinalizacion();

        assert (fechaFinalizacion.equals("202301"));

    }

    private Estudiante newEstudiante() {
        List<Materia> materiasCursadas = new ArrayList<>();
        materiasCursadas.add(new Materia("matemática", 7));
        materiasCursadas.add(new Materia("geografía", 6));
        materiasCursadas.add(new Materia("ciencias sociales", 9));
        return new Estudiante("Juan", 10, LocalDate.of(2023, 1, 10), materiasCursadas);
    }


}
