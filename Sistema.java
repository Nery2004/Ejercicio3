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
        
    }

    // Método público para calcular estadísticas para un estudiante dado
    public void calcularEstadisticasEstudiante(int codigoEstudiante) {
        
    }

    // Método público para mostrar resultados de cada sede
    public void mostrarResultadosSede(String nombreSede) {
        
    }

    // Método público para agregar una sede al sistema
    public void agregarSede(Sede sede) {
        sedes.add(sede);
    }
}