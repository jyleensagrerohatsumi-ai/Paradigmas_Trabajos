

/**
 * Clase que representa a un empleado asalariado.
 *
 * <p>Un empleado asalariado recibe un sueldo fijo semanal o mensual, sin
 * importar directamente la cantidad de horas trabajadas o las ventas que haga.
 * Por eso, su cálculo de ingresos consiste solamente en regresar el valor de su
 * salario semanal.</p>
 */
public class EmpleadoAsalariado extends Empleado {

    /**
     * Salario semanal fijo del empleado.
     *
     * <p>Se usa un double porque puede existir dinero con centavos, por ejemplo,
     * 1500.75.</p>
     */
    private double salarioSemanal;

    /**
     * Constructor del empleado asalariado.
     *
     * @param nombre nombre del empleado
     * @param apellidoPaterno apellido paterno
     * @param numeroSeguroSocial número de seguro social
     * @param salarioSemanal sueldo semanal que recibirá
     */
    public EmpleadoAsalariado(String nombre, String apellidoPaterno, String numeroSeguroSocial, double salarioSemanal) {
        // Se ejecuta el constructor de la clase base para inicializar los datos
        // comunes de todos los empleados.
        super(nombre, apellidoPaterno, numeroSeguroSocial);

        // Se valida que el salario no sea negativo.
        if (salarioSemanal < 0.0) {
            throw new IllegalArgumentException("El salario semanal no puede ser negativo.");
        }

        // Se guarda el valor validado en el atributo de la clase.
        this.salarioSemanal = salarioSemanal;
    }

    /**
     * Obtiene el salario semanal del empleado.
     *
     * @return salario semanal
     */
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    /**
     * Cambia el salario semanal del empleado después de validarlo.
     *
     * @param salarioSemanal nuevo salario semanal
     */
    public void setSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0.0) {
            throw new IllegalArgumentException("El salario semanal no puede ser negativo.");
        }
        this.salarioSemanal = salarioSemanal;
    }

    /**
     * Calcula los ingresos del empleado asalariado.
     *
     * <p>Como su pago es fijo, el método retorna directamente el salario
     * semanal.</p>
     *
     * @return salario semanal del empleado
     */
    @Override
    public double Ingresos() {
        return salarioSemanal;
    }

    /**
     * Muestra la información del empleado asalariado.
     *
     * <p>Se usa String.format para presentar texto organizado y con dos
     * decimales en el salario por ejemplo: 1500.00.</p>
     *
     * @return cadena con los datos del empleado
     */
    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s %s%nNúmero de seguro social: %s%nSalario semanal: %.2f",
                getNombre(), getApellidoPaterno(), getNumeroSeguroSocial(), salarioSemanal);
    }
}
