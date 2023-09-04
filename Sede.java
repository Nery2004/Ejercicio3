import java.util.ArrayList;
import java.util.List;

public class Sede {
    // Propiedades privadas
    private String nombre;
    private List<Estudiante> estudiantes;

    // Constructor
    public Sede(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    // Método público para agregar un estudiante a la sede
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método público para calcular estadísticas de los resultados de exámenes en la sede
    public void calcularEstadisticas() {
    }

    // Método público para obtener el nombre de la sede
    public String obtenerNombre() {
        return nombre;
    }
}