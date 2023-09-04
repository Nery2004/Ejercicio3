import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int codigo;
    private int fechaNacimiento;
    private String correo;
    private ArrayList<Examen> examenesRealizados;

    public Estudiante(String nombre, String apellido, int codigo, int fechaNacimiento, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.examenesRealizados = new ArrayList<Examen>();
    }

    public void agregarExamen(Examen examen) {
        this.examenesRealizados.add(examen);
    }

    public ArrayList<Examen> obtenerExamenes() {
        return this.examenesRealizados;
    }
}
