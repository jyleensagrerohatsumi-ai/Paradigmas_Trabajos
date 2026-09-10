

/**
 * Clase abstracta base de la jerarquía de empleados.
 *
 * <p>Representa a cualquier persona que trabaja para una empresa y que, en
 * general, puede calcular sus ingresos de acuerdo con su tipo de contrato.</p>
 *
 * <p>Se declara abstracta porque no tiene sentido crear objetos de tipo
 * Empleado sin especificar cómo se pagan sus ingresos. La lógica concreta se
 * define en cada subclase.</p>
 */
public abstract class Empleado {

    /**
     * Nombre del empleado.
     *
     * <p>Es privado para proteger la integridad del objeto y solo se puede
     * consultar a través del método getter correspondiente.</p>
     */
    private String nombre;

    /**
     * Apellido paterno del empleado.
     */
    private String apellidoPaterno;

    /**
     * Número de seguro social del empleado.
     */
    private String numeroSeguroSocial;

    /**
     * Constructor común para todas las clases hijas.
     *
     * @param nombre nombre del empleado
     * @param apellidoPaterno apellido paterno
     * @param numeroSeguroSocial número de seguro social
     */
    public Empleado(String nombre, String apellidoPaterno, String numeroSeguroSocial) {
        // Se valida que el nombre no venga vacío para evitar objetos incompletos.
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }

        // Se valida también el apellido, ya que es un dato obligatorio del empleado.
        if (apellidoPaterno == null || apellidoPaterno.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellido paterno no puede estar vacío.");
        }

        // El número de Seguro Social también debe incluirse para identificar al empleado.
        if (numeroSeguroSocial == null || numeroSeguroSocial.trim().isEmpty()) {
            throw new IllegalArgumentException("El número de seguro social no puede estar vacío.");
        }

        // Se asignan los valores recibidos al objeto actual usando this.
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    /**
     * Devuelve el nombre del empleado.
     *
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del empleado.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    /**
     * Devuelve el apellido paterno del empleado.
     *
     * @return apellido paterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Modifica el apellido paterno del empleado.
     *
     * @param apellidoPaterno nuevo apellido
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        if (apellidoPaterno == null || apellidoPaterno.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellido paterno no puede estar vacío.");
        }
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Devuelve el número de seguro social del empleado.
     *
     * @return número de seguro social
     */
    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    /**
     * Cambia el número de seguro social.
     *
     * @param numeroSeguroSocial nuevo número
     */
    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        if (numeroSeguroSocial == null || numeroSeguroSocial.trim().isEmpty()) {
            throw new IllegalArgumentException("El número de seguro social no puede estar vacío.");
        }
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    /**
     * Método abstracto que cada tipo de empleado debe implementar.
     *
     * <p>La forma de calcular los ingresos cambia según la categoría del
     * empleado: por horas, por comisión o asalariado.</p>
     *
     * @return cantidad de ingresos del empleado
     */
    public abstract double Ingresos();

    /**
     * Devuelve una representación textual del empleado.
     *
     * <p>Este método se puede sobreescribir en cada subclase para mostrar la
     * información específica de cada tipo de empleado.</p>
     *
     * @return información personal del empleado
     */
    @Override
    public String toString() {
        return String.format("Empleado: %s %s%nNúmero de seguro social: %s",
                nombre, apellidoPaterno, numeroSeguroSocial);
    }
}
