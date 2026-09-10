
// Permite capturar el error producido cuando una fecha no coincide con el formato esperado.
import java.text.ParseException;
// Permite interpretar fechas escritas por el usuario.
import java.text.SimpleDateFormat;
// Representa la fecha de nacimiento como un objeto de fecha.
import java.util.Date;
// Lee texto introducido desde la entrada estandar, normalmente el teclado.
import java.util.Scanner;

// Clase de prueba: contiene el flujo principal para crear y utilizar un Estudiante.
public class PruebaEstudiante {
    // main es el punto de entrada que la maquina virtual de Java ejecuta primero.
    public static void main(String[] args) {
        // Crea el lector asociado a System.in para recibir datos desde la consola.
        Scanner scanner = new Scanner(System.in);
        // Define el patron de fecha dia/mes/anio que se mostrara al usuario.
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        // Presenta el titulo de la pantalla de registro.
        System.out.println("--- REGISTRO DE ESTUDIANTE ---");

        // Solicita y almacena cada dato personal leyendo una linea completa.
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido Paterno: ");
        String apPaterno = scanner.nextLine();

        System.out.print("Apellido Materno: ");
        String apMaterno = scanner.nextLine();

        // Solicita la fecha y comienza con una referencia nula hasta obtener un valor valido.
        System.out.print("Fecha de nacimiento (dd/MM/yyyy): ");
        Date fechaNac = null;
        try {
            // parse convierte el texto introducido en un objeto Date.
            fechaNac = formatoFecha.parse(scanner.nextLine());
        } catch (ParseException e) {
            // Este bloque se ejecuta cuando el texto no puede interpretarse como fecha.
            System.out.println("Formato de fecha inválido. Se usará la fecha actual.");
            // new Date() usa la fecha y hora actuales como valor alternativo.
            fechaNac = new Date();
        }

        // Solicita y guarda los datos academicos del estudiante.
        System.out.print("ID del Alumno: ");
        String id = scanner.nextLine();

        System.out.print("Carrera (Matemática, Ciencias Informáticas, etc.): ");
        String carrera = scanner.nextLine();

        System.out.print("Título a obtener (Licenciatura, Master, Ph.D): ");
        String titulo = scanner.nextLine();

        // Inicializa el anio con cero antes de validarlo mediante el ciclo.
        int anioGrad = 0;
        while (true) {
            try {
                // Pide el anio hasta que el usuario proporcione un entero valido.
                System.out.print("Año de graduación esperado: ");
                // parseInt convierte la cadena leida en un valor int.
                anioGrad = Integer.parseInt(scanner.nextLine());
                // Sale del ciclo porque la conversion fue correcta.
                break;
            } catch (NumberFormatException e) {
                // Informa el error y permite volver a solicitar el dato.
                System.out.println("Entrada inválida. Debe ingresar un número entero.");
            }
        }

        // Instancia Estudiante usando todos los datos capturados y validados.
        Estudiante estudiante = new Estudiante(nombre, apPaterno, apMaterno, fechaNac, id, carrera, titulo, anioGrad);

        // Imprime la representacion definida por el toString sobrescrito de Estudiante.
        System.out.println("\n" + estudiante.toString() + "\n");

        // Solicita la cantidad de calificaciones que participaran en el promedio.
        int numCalificaciones = 0;
        while (true) {
            try {
                System.out.print("¿Cuántas calificaciones desea ingresar para el cálculo del promedio? ");
                numCalificaciones = Integer.parseInt(scanner.nextLine());
                if (numCalificaciones > 0) {
                    // Continua cuando existe al menos una calificacion.
                    break;
                }
                // Rechaza cero y valores negativos porque no permiten calcular un promedio valido.
                System.out.println("Debe ingresar al menos una calificación.");
            } catch (NumberFormatException e) {
                // Captura texto que no puede convertirse a entero.
                System.out.println("Entrada inválida. Debe ingresar un número entero.");
            }
        }

        // Reserva un arreglo con una posicion por cada calificacion solicitada.
        String[] calificaciones = new String[numCalificaciones];
        // Recorre el arreglo y guarda cada calificacion introducida por el usuario.
        for (int i = 0; i < numCalificaciones; i++) {
            System.out.print("Ingrese calificación #" + (i + 1) + " (A, A-, B+, B, B-, C+, C, D, F): ");
            calificaciones[i] = scanner.nextLine();
        }

        // Delega en Estudiante la conversion de letras y el calculo del promedio.
        estudiante.calcularPromedio(numCalificaciones, calificaciones);

        // Consulta el promedio mediante su getter y lo muestra con dos cifras decimales.
        System.out.println(
                "\nEl promedio calculado del estudiante es: " + String.format("%.2f", estudiante.obtenerPromCalif()));

        // Pregunta si se debe modificar la carrera almacenada en el objeto.
        System.out.print("\n¿Desea cambiar de carrera al estudiante? (si/no): ");
        String respuesta = scanner.nextLine();

        // equalsIgnoreCase compara sin distinguir mayusculas y minusculas.
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.print("Ingrese la nueva carrera: ");
            String nuevaCarrera = scanner.nextLine();

            // Usa el mutador para actualizar la carrera respetando el encapsulamiento.
            estudiante.cambiarCarrera(nuevaCarrera);
            // Confirma en pantalla el nuevo valor mediante el metodo accesor.
            System.out.println("La nueva carrera del estudiante es: " + estudiante.obtenerCarrera());
        }

        // Indica que todas las operaciones del programa terminaron.
        System.out.println("Fin del programa.");
        // Libera el recurso de entrada asociado al teclado.
        scanner.close();
    }
}