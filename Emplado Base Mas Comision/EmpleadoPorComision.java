/**
 * Representa a un empleado cuya información incluye una comisión y un monto
 * de ventas.Object
 *
 * <p>
 * La clase utiliza encapsulamiento: sus atributos son privados y se consultan
 * o modifican mediante métodos públicos getter y setter.
 * </p>
 */
public class EmpleadoPorComision {
    /**
     * Nombre o nombres del empleado.
     *
     * <p>Este atributo es privado para proteger la información y únicamente
     * puede consultarse o modificarse mediante sus métodos getter y setter.</p>
     */
    private String nombre, apellidoPaterno, numeroSeguroSocial;

    /**
     * Porcentaje de comisión que recibe el empleado por sus ventas.
     *
     * <p>El valor se maneja como una fracción decimal; por ejemplo, {@code 0.10}
     * representa una comisión del 10 %.</p>
     */
    private double comision, montoVentas;

    /**
     * Crea un empleado por comisión con sus datos personales y laborales.
     *
     * @param nombre             nombre del empleado
     * @param apellidoPaterno    apellido paterno del empleado
     * @param numeroSeguroSocial número de Seguro Social del empleado
     * @param comision           porcentaje o valor de comisión asignado
     * @param montoVentas        cantidad total de ventas realizadas
     */
    public EmpleadoPorComision(String nombre, String apellidoPaterno, String numeroSeguroSocial, double comision,
            double montoVentas) {
        // "this" identifica los atributos del objeto actual. De esta manera,
        // se diferencian de los parámetros del constructor, que tienen los
        // mismos nombres.
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.comision = comision;
        this.montoVentas = montoVentas;
    }

    /**
     * Obtiene el nombre del empleado.
     *
     * @return nombre almacenado
     */
    public String getNombre() {
        // Devuelve el nombre que actualmente está almacenado en el objeto.
        return this.nombre;
    }

    /**
     * Modifica el nombre del empleado.
     *
     * @param nombre nuevo nombre que se almacenará
     */
    public void setNombre(String nombre) {
        // Reemplaza el nombre anterior por el nuevo valor recibido.
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido paterno del empleado.
     *
     * @return apellido paterno almacenado
     */
    public String getApellidoPaterno() {
        // Devuelve el apellido paterno almacenado en el objeto.
        return this.apellidoPaterno;
    }

    /**
     * Modifica el apellido paterno del empleado.
     *
     * @param apellidoPaterno nuevo apellido paterno
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        // Actualiza el apellido paterno del empleado.
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Obtiene el número de Seguro Social del empleado.
     *
     * @return número de Seguro Social almacenado
     */
    public String getNumeroSeguroSocial() {
        // Devuelve el número de Seguro Social registrado.
        return numeroSeguroSocial;
    }

    /**
     * Modifica el número de Seguro Social del empleado.
     *
     * @param numeroSeguroSocial nuevo número de Seguro Social
     */
    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        // Actualiza el número de Seguro Social del empleado.
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    /**
     * Obtiene la comisión asignada al empleado.
     *
     * @return comisión almacenada
     */
    public double getComision() {
        // Devuelve la tarifa de comisión expresada como fracción decimal.
        return this.comision;
    }

    /**
     * Modifica la comisión asignada al empleado.
     *
     * @param comision nuevo porcentaje o valor de comisión
     */
    public void setComision(double comision) {
        // La tarifa debe ser mayor que 0 y menor que 1; esto equivale a
        // aceptar porcentajes mayores que 0 % y menores que 100 %.
        if (comision <= 0.0 || comision >= 1.0) {
            throw new IllegalArgumentException("La tarifa decomisión debe ser > 0.0 y < 1.0");
        }
        // Guarda la tarifa únicamente después de comprobar que es válida.
        this.comision = comision;
    }

    /**
     * Obtiene el monto total de ventas del empleado.
     *
     * @return monto de ventas almacenado
     */
    public double getMontoVentas() {
        // Devuelve el total de ventas utilizado para calcular los ingresos.
        return this.montoVentas;
    }

    /**
     * Modifica el monto total de ventas del empleado.
     *
     * @param montoVentas nuevo monto total de ventas
     */
    public void setMontoVentas(double montoVentas) {
        // Comprueba que el monto de ventas sea positivo antes de almacenarlo.
        if (montoVentas <= 0.0) {
            throw new IllegalArgumentException("El monto de ventas brutas debe ser >= 0.0");
        }
        // Guarda el monto solamente cuando pasó la validación anterior.
        this.montoVentas = montoVentas;
    }

    /**
     * Calcula los ingresos del empleado por concepto de comisión.
     *
     * <p>La operación multiplica la tarifa de comisión por el monto total de
     * ventas. Por ejemplo, una comisión de {@code 0.10} sobre ventas de
     * {@code 1000.00} produce ingresos de {@code 100.00}.</p>
     *
     * @return ingresos calculados a partir de la comisión y las ventas
     */
    public double Ingresos() {
        // La tarifa es una fracción decimal, por lo que la multiplicación
        // obtiene directamente el importe que corresponde al empleado.
        return comision * montoVentas;
    }

    /**
     * Construye una representación legible del objeto.
     *
     * <p>Incluye el nombre completo, el número de Seguro Social, el monto de
     * ventas y la comisión. Los valores decimales se muestran con dos cifras
     * después del punto decimal.</p>
     *
     * @return información del empleado en formato de texto
     */
    @Override
    public String toString() {
        // String.format combina los datos del objeto con etiquetas y saltos
        // de línea para facilitar su lectura al imprimirlo.
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "Empleado por comisión", nombre, apellidoPaterno,
                "Número de Seguro Social", numeroSeguroSocial, "Monto de ventas", montoVentas, "Comisión", comision);
    }

}