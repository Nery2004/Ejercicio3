public class Examen {
    // Propiedades privadas
    private String tipo;
    private int nota;
    private String sede;

    // Constructor
    public Examen(String tipo, int nota, String sede) {
        this.tipo = tipo;
        this.nota = nota;
        this.sede = sede;
    }

    // Método público para obtener el tipo de examen
    public String obtenerTipo() {
        return tipo;
    }

    // Método público para obtener la nota del examen
    public int obtenerNota() {
        return nota;
    }

    // Método público para obtener la sede del examen
    public String obtenerSede() {
        return sede;
    }
    
}
