
// Importa Date para recibir y conservar la fecha de nacimiento heredada de Persona.
import java.util.Date;

// Estudiante es una subclase de Persona: hereda sus datos y comportamientos comunes.
public class Estudiante extends Persona {
    // Identificador unico del estudiante.
    private String id;
    // Promedio actual; double permite almacenar valores con decimales.
    private double promCalif;
    // Carrera o programa academico que cursa el estudiante.
    private String carrera;
    // Titulo academico que espera obtener.
    private String titulo;
    // Anio esperado de graduacion; int almacena un numero entero.
    private int anioGraduacion;

    // Constructor de Estudiante: recibe los datos propios y los datos heredados de Persona.
    public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento,
            String id, String carrera, String titulo, int anioGraduacion) {
        // super llama al constructor de la clase padre para inicializar la parte Persona.
        super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento);
        // Inicializa el identificador del estudiante.
        this.id = id;
        // Inicializa la carrera actual.
        this.carrera = carrera;
        // Inicializa el titulo que desea obtener.
        this.titulo = titulo;
        // Inicializa el anio esperado de graduacion.
        this.anioGraduacion = anioGraduacion;
        // El promedio empieza en cero porque todavia no se han procesado calificaciones.
        this.promCalif = 0.0;
    }

    // Getter publico que permite consultar el ID sin exponer el atributo directamente.
    public String obtenerId() {
        return id;
    }

    // Devuelve el promedio calculado del estudiante.
    public double obtenerPromCalif() {
        return promCalif;
    }

    // Devuelve la carrera actual del estudiante.
    public String obtenerCarrera() {
        return carrera;
    }

    // Devuelve el titulo academico seleccionado.
    public String obtenerTitulo() {
        return titulo;
    }

    // Devuelve el anio esperado de graduacion.
    public int obtenerAnioGraduacion() {
        return anioGraduacion;
    }

    // Metodos mutadores (setters) permiten cambiar los atributos privados de la instancia.

    public void setId(String id) {
        this.id = id;
    }

    public void setPromCalif(double promCalif) {
        this.promCalif = promCalif;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnioGraduacion(int anioGraduacion) {
        this.anioGraduacion = anioGraduacion;
    }

    // Metodo mutador (setter): cambia la carrera sin permitir acceso directo al atributo.
    public void cambiarCarrera(String nuevaCarrera) {
        // Reemplaza la carrera anterior con el nuevo valor recibido.
        this.carrera = nuevaCarrera;
    }

    // Calcula el promedio usando un arreglo de calificaciones representadas por letras.
    // numCalificaciones indica cuantas posiciones del arreglo se deben procesar.
    public void calcularPromedio(int numCalificaciones, String[] calificaciones) {
        // Acumula los puntos equivalentes de todas las calificaciones.
        double sumaPuntos = 0.0;

        // Recorre las calificaciones desde la primera posicion hasta la cantidad indicada.
        for (int i = 0; i < numCalificaciones; i++) {
            // toUpperCase permite aceptar letras minusculas y compararlas con los casos definidos.
            switch (calificaciones[i].toUpperCase()) {
                // Cada caso convierte una letra en su valor numerico correspondiente.
                case "A":
                    sumaPuntos += 4.0;
                    break;
                case "A-":
                    sumaPuntos += 3.67;
                    break;
                case "B+":
                    sumaPuntos += 3.33;
                    break;
                case "B":
                    sumaPuntos += 3.0;
                    break;
                case "B-":
                    sumaPuntos += 2.67;
                    break;
                case "C+":
                    sumaPuntos += 2.33;
                    break;
                case "C":
                    sumaPuntos += 2.0;
                    break;
                case "D":
                    sumaPuntos += 1.0;
                    break;
                case "F":
                    sumaPuntos += 0.0;
                    break;
                default:
                    // Las entradas desconocidas no agregan puntos al acumulador.
                    break;
            }
        }

        // Evita dividir entre cero y calcula la media aritmetica de los puntos.
        if (numCalificaciones > 0) {
            this.promCalif = sumaPuntos / numCalificaciones;
        }
    }

    // Sobrescribe toString para proporcionar una descripcion completa y legible del objeto.
    @Override
    public String toString() {
        // Concatena los datos heredados, los datos propios y el promedio con dos decimales.
        return "--- Datos del Estudiante ---\n" +
                "Nombre: " + obtenerNombreCompleto() + "\n" +
                "Fecha de Nacimiento: " + obtenerFechaNacimientoFormateada() + "\n" +
                "ID: " + obtenerId() + "\n" +
                "Carrera: " + obtenerCarrera() + "\n" +
                "Grado Obtenido: " + obtenerTitulo() + "\n" +
                "Año Esperado de Graduación: " + obtenerAnioGraduacion() + "\n" +
                "Promedio Actual: " + String.format("%.2f", obtenerPromCalif());
    }
}
