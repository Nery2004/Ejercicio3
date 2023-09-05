import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de sedes
        List<Sede> sedes = new ArrayList<>();
        sedes.add(new Sede("Sur"));
        sedes.add(new Sede("Central"));
        sedes.add(new Sede("Norte"));

        // Crear un sistema y agregar las sedes
        Sistema sistema = new Sistema();
        for (Sede sede : sedes) {
            sistema.agregarSede(sede);
        }

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar el menú principal
        while (true) {
            System.out.println("Menú principal:");
            System.out.println("1. Registrar datos de los estudiantes");
            System.out.println("2. Registrar resultados de los exámenes");
            System.out.println("3. Mostrar datos analíticos");
            System.out.println("4. Mostrar resultados de cada sede");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                // Registrar datos de los estudiantes
                System.out.print("Ingrese el nombre del estudiante: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el apellido del estudiante: ");
                String apellido = scanner.nextLine();
                System.out.print("Ingrese el código único del estudiante: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese la fecha de nacimiento del estudiante (AAAAMMDD): ");
                int fechaNacimiento = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese el correo electrónico del estudiante: ");
                String correo = scanner.nextLine();

                // Crear un nuevo estudiante y agregarlo al sistema
                Estudiante estudiante = new Estudiante(nombre, apellido, codigo, fechaNacimiento, correo);
                sistema.registrarEstudiante(estudiante);

                // Almacenar los datos del alumno en un archivo CSV
                // Implementa el almacenamiento de datos en un archivo CSV aquí

                System.out.println("Estudiante registrado con éxito.");
            } else if (opcion == 2) {
                // Registrar resultados de los exámenes
                System.out.print("Ingrese el código único del estudiante: ");
                int codigoEstudiante = scanner.nextInt();
                scanner.nextLine();

                while (true) {
                    System.out.println("Exámenes disponibles: Matemática, Lenguaje, Química, Física, Comprensión Lectora, Estadística");
                    System.out.print("Ingrese el tipo de examen o 'salir' para volver al menú principal: ");
                    String tipoExamen = scanner.nextLine();
                    if (tipoExamen.equalsIgnoreCase("salir")) {
                        break;
                    }
                    System.out.print("Ingrese la nota del examen: ");
                    int notaExamen = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese la sede donde se realizó el examen: ");
                    String sedeExamen = scanner.nextLine();

                    // Registrar el resultado del examen para el estudiante
                    Examen examen = new Examen(tipoExamen, notaExamen, sedeExamen);
                    sistema.registrarResultadoExamen(codigoEstudiante, examen);

                    System.out.println("Resultado del examen registrado con éxito.");
                }
            } else if (opcion == 3) {
                // Mostrar datos analíticos
                System.out.print("Ingrese el código único del alumno: ");
                int codigoEstudiante = scanner.nextInt();
                scanner.nextLine();

                // Obtener las estadísticas para el estudiante específico
                double[] estadisticas = sistema.obtenerEstadisticasEstudiante(codigoEstudiante);

                // Mostrar las estadísticas calculadas
                if (estadisticas != null) {
                    System.out.println("Promedio: " + estadisticas[0]);
                    System.out.println("Mediana: " + estadisticas[1]);
                    System.out.println("Moda: " + estadisticas[2]);
                    System.out.println("Desviación estándar: " + estadisticas[3]);
                } else {
                    System.out.println("No se encontraron estadísticas para el estudiante con código " + codigoEstudiante);
                }
            } else if (opcion == 4) {
                // Mostrar resultados de cada sede
                for (Sede sede : sedes) {
                    sistema.mostrarResultadosSede(sede.obtenerNombre());
                }
            } else if (opcion == 5) {
                // Salir del programa
                break;
            } else {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
