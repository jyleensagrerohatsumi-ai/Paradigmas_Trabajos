
// Importa la clase necesaria para convertir objetos Date en texto con un formato definido.
import java.text.SimpleDateFormat;
// Importa la clase Date, utilizada para representar la fecha de nacimiento.
import java.util.Date;

// Clase base que representa los datos comunes de cualquier persona.
// Sus atributos son privados para aplicar encapsulamiento y controlar el acceso mediante metodos.
public class Persona {
    // Nombre de la persona; String permite almacenar una cadena de caracteres.
    private String nombre;
    // Primer apellido de la persona.
    private String apellidoPaterno;
    // Segundo apellido de la persona.
    private String apellidoMaterno;
    // Fecha de nacimiento; Date representa una fecha y hora.
    private Date fechaNacimiento;

    // Constructor: recibe todos los datos basicos y los asigna al nuevo objeto.
    // this identifica el atributo de la instancia y evita confundirlo con el parametro.
    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento) {
        // Guarda el nombre recibido en el atributo privado del objeto.
        this.nombre = nombre;
        // Guarda el apellido paterno recibido.
        this.apellidoPaterno = apellidoPaterno;
        // Guarda el apellido materno recibido.
        this.apellidoMaterno = apellidoMaterno;
        // Guarda la fecha de nacimiento recibida.
        this.fechaNacimiento = fechaNacimiento;
    }

    // Metodo accesor (getter): devuelve el nombre sin modificarlo.
    public String obtenerNombre() {
        return nombre;
    }

    // Devuelve el apellido paterno almacenado en la instancia.
    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    // Devuelve el apellido materno almacenado en la instancia.
    public String obtenerApellidoMaterno() {
        return apellidoMaterno;
    }

    // Devuelve la fecha original como objeto Date para poder reutilizarla en calculos.
    public Date obtenerFechaNacimiento() {
        return fechaNacimiento;
    }

    //setters para modificar los atributos privados de la clase Persona

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Crea un formateador local usando dia/mes/anio y devuelve la fecha como texto.
    public String obtenerFechaNacimientoFormateada() {
        // El patron dd/MM/yyyy exige dos digitos para dia y mes y cuatro para el anio.
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        // format transforma el objeto Date en una cadena legible.
        return formatoFecha.format(fechaNacimiento);
    }

    // Concatena los tres nombres para obtener una representacion completa de la persona.
    public String obtenerNombreCompleto() {
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno;
    }
}