import java.util.Scanner;

public class PruebaLibroCalificaciones {
    
    public static void main(String[] args) {
        // Inicializamos el Scanner para leer desde el teclado
        Scanner entrada = new Scanner(System.in);

        // 1. Instanciación creando un objeto con el constructor (evitando valores nulos)
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones("Sin asignar", "Sin asignar", 0);

        // 2. Despliegue de las líneas de caracteres con los valores iniciales (Parte III)
        System.out.println("El nombre inicial del curso: es " + miLibroCalificaciones.getNombreCurso());
        System.out.println("El profesor es: " + miLibroCalificaciones.getNombreProfesor());
        System.out.println("y las horas a la semana son: " + miLibroCalificaciones.getHorasCurso());
        System.out.println("--------------------------------------------------");

        // 3. Pedir al usuario que ingrese los valores desde el teclado y almacenarlos en variables locales (Parte III)
        System.out.println("Escribe el nombre del curso: ");
        String nombreCursoIngresado = entrada.nextLine();

        System.out.println("\nEscribe el nombre del profesor asignado: ");
        String nombreProfesorIngresado = entrada.nextLine();

        System.out.println("\nEscribe las horas del curso a la semana: ");
        int horasIngresadas = entrada.nextInt();

        // 4. Invocar a los métodos mutadores (setters) pasando las variables locales (Parte III / Actividad)
        miLibroCalificaciones.setNombreCurso(nombreCursoIngresado);
        miLibroCalificaciones.setNombreProfesor(nombreProfesorIngresado);
        miLibroCalificaciones.setHorasCurso(horasIngresadas);

        // 5. Invocar al método mostrarMensaje (Parte III)
        miLibroCalificaciones.mostrarMensaje();

        // Cerrar el scanner
        entrada.close();
    }
}