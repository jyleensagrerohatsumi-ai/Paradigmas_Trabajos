

/**
 * Clase que representa a un empleado pagado por horas.
 *
 * <p>Este empleado gana según el número de horas trabajadas y la tarifa por
 * hora. Si trabaja más horas, sus ingresos aumentan de manera proporcional.</p>
 */
public class EmpleadoPorHoras extends Empleado {

    /**
     * Cantidad de horas trabajadas por el empleado.
     */
    private double horasTrabajadas;

    /**
     * Tarifa por hora que se paga al empleado.
     */
    private double tarifaHora;

    /**
     * Constructor del empleado por horas.
     *
     * @param nombre nombre del empleado
     * @param apellidoPaterno apellido paterno
     * @param numeroSeguroSocial número de seguro social
     * @param horasTrabajadas número de horas trabajadas
     * @param tarifaHora pago por cada hora trabajada
     */
    public EmpleadoPorHoras(String nombre, String apellidoPaterno, String numeroSeguroSocial,
            double horasTrabajadas, double tarifaHora) {
        // Se inicializa la parte común de todos los empleados.
        super(nombre, apellidoPaterno, numeroSeguroSocial);

        // Se valida la cantidad de horas para evitar valores negativos.
        if (horasTrabajadas < 0.0) {
            throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas.");
        }

        // Se valida la tarifa por hora para evitar pagos negativos.
        if (tarifaHora < 0.0) {
            throw new IllegalArgumentException("La tarifa por hora no puede ser negativa.");
        }

        // Se guardan los valores correctos.
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    /**
     * Devuelve las horas trabajadas.
     *
     * @return horas trabajadas
     */
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * Cambia la cantidad de horas trabajadas.
     *
     * @param horasTrabajadas nuevas horas trabajadas
     */
    public void setHorasTrabajadas(double horasTrabajadas) {
        if (horasTrabajadas < 0.0) {
            throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas.");
        }
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * Devuelve la tarifa por hora.
     *
     * @return tarifa por hora
     */
    public double getTarifaHora() {
        return tarifaHora;
    }

    /**
     * Cambia la tarifa por hora.
     *
     * @param tarifaHora nueva tarifa por hora
     */
    public void setTarifaHora(double tarifaHora) {
        if (tarifaHora < 0.0) {
            throw new IllegalArgumentException("La tarifa por hora no puede ser negativa.");
        }
        this.tarifaHora = tarifaHora;
    }

    /**
     * Calcula los ingresos del empleado por horas.
     *
     * <p>En este caso, los ingresos se obtienen multiplicando la tarifa por la
     * cantidad de horas trabajadas. Es una operación directa y simple porque la
     * lógica de pago depende del tiempo trabajado.</p>
     *
     * @return pago total por horas trabajadas
     */
    @Override
    public double Ingresos() {
        if (horasTrabajadas <= 40.0) {
            return tarifaHora * horasTrabajadas;
        }

        double horasExtra = horasTrabajadas - 40.0;
        return (40.0 * tarifaHora) + (horasExtra * tarifaHora * 1.5);
    }

    /**
     * Presenta los datos del empleado por horas.
     *
     * @return texto con los datos del empleado
     */
    @Override
    public String toString() {
        return String.format("Empleado por horas: %s %s%nNúmero de seguro social: %s%nHoras trabajadas: %.2f%nTarifa por hora: %.2f",
                getNombre(), getApellidoPaterno(), getNumeroSeguroSocial(), horasTrabajadas, tarifaHora);
    }
}
