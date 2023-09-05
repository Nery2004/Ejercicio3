import java.util.ArrayList;
import java.util.List;

public class Sistema {
    // Propiedades privadas
    private List<Estudiante> estudiantes;
    private List<Sede> sedes;

    // Constructor
    public Sistema() {
        this.estudiantes = new ArrayList<>();
        this.sedes = new ArrayList<>();
    }

    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método público para registrar los resultados de un examen para un estudiante específico
    public void registrarResultadoExamen(int codigoEstudiante, Examen examen) {
        // Implementa el registro del resultado del examen aquí
    }

    // Método público para calcular estadísticas para un estudiante dado
    public void calcularEstadisticasEstudiante(int codigoEstudiante) {
        // Implementa el cálculo de estadísticas aquí
    }

    // Método público para mostrar resultados de cada sede
    public void mostrarResultadosSede(String nombreSede) {
        // Implementa el mostrar resultados aquí
    }

    // Método público para agregar una sede al sistema
    public void agregarSede(Sede sede) {
        sedes.add(sede);
    }

    // Método público para obtener las estadísticas de los resultados de los exámenes para un estudiante específico
    public double[] obtenerEstadisticasEstudiante(int codigoEstudiante) {
        // Implementa la obtención de estadísticas aquí y devuelve un arreglo con los valores calculados
        // El arreglo debe contener los valores en el siguiente orden: promedio, mediana, moda, desviación estándar
        return null; // Devuelve null si no se encontraron estadísticas para el estudiante con el código especificado
    }
}
