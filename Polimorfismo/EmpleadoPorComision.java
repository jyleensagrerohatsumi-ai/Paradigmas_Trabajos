

/**
 * Clase que representa a un empleado pagado por comisión.
 *
 * <p>Este tipo de empleado gana una parte del dinero obtenido por sus ventas.
 * La comisión se expresa como un decimal entre 0 y 1, por ejemplo 0.10
 * significa 10%.</p>
 */
public class EmpleadoPorComision extends Empleado {

    /**
     * Porcentaje de comisión aplicado a las ventas del empleado.
     */
    private double comision;

    /**
     * Total de ventas realizadas por el empleado.
     */
    private double montoVentas;

    /**
     * Constructor de la clase.
     *
     * @param nombre nombre del empleado
     * @param apellidoPaterno apellido paterno
     * @param numeroSeguroSocial número de seguro social
     * @param comision tarifa de comisión, debe estar entre 0 y 1
     * @param montoVentas total de ventas realizadas
     */
    public EmpleadoPorComision(String nombre, String apellidoPaterno, String numeroSeguroSocial,
            double comision, double montoVentas) {
        // Se ejecuta el constructor de la clase base para inicializar los datos
        // comunes de todos los empleados.
        super(nombre, apellidoPaterno, numeroSeguroSocial);

        // Validación: la comisión debe ser positiva y menor que 1 para representar
        // un porcentaje válido entre 0% y 100% sin incluir el 100%.
        if (comision <= 0.0 || comision >= 1.0) {
            throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");
        }

        // Validación: las ventas no pueden ser negativas.
        if (montoVentas < 0.0) {
            throw new IllegalArgumentException("El monto de ventas brutas debe ser >= 0.0");
        }

        // Se asignan los atributos válidos al objeto.
        this.comision = comision;
        this.montoVentas = montoVentas;
    }

    /**
     * Obtiene la comisión del empleado.
     *
     * @return comisión almacenada
     */
    public double getComision() {
        return comision;
    }

    /**
     * Cambia la tarifa de comisión si el valor es válido.
     *
     * @param comision nueva comisión
     */
    public void setComision(double comision) {
        if (comision <= 0.0 || comision >= 1.0) {
            throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");
        }
        this.comision = comision;
    }

    /**
     * Obtiene el monto total de ventas.
     *
     * @return monto de ventas
     */
    public double getMontoVentas() {
        return montoVentas;
    }

    /**
     * Modifica el monto de ventas del empleado.
     *
     * @param montoVentas nuevo monto de ventas
     */
    public void setMontoVentas(double montoVentas) {
        if (montoVentas < 0.0) {
            throw new IllegalArgumentException("El monto de ventas brutas debe ser >= 0.0");
        }
        this.montoVentas = montoVentas;
    }

    /**
     * Calcula los ingresos del empleado por comisión.
     *
     * <p>La comisión es un porcentaje aplicado a las ventas brutas. Por ejemplo,
     * si la comisión es 0.10 y las ventas son 1000, los ingresos serán 100.</p>
     *
     * @return cantidad total a pagar por comisión
     */
    @Override
    public double Ingresos() {
        return comision * montoVentas;
    }

    /**
     * Muestra la información del empleado por comisión.
     *
     * @return texto legible con los datos del empleado
     */
    @Override
    public String toString() {
        return String.format("Empleado por comisión: %s %s%nNúmero de seguro social: %s%nMonto de ventas: %.2f%nComisión: %.2f",
                getNombre(), getApellidoPaterno(), getNumeroSeguroSocial(), montoVentas, comision);
    }
}