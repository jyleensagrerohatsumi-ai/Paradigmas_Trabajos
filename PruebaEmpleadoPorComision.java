/**
 * Programa de prueba para la clase {@link EmpleadoPorComision}.
 *
 * <p>La clase demuestra cómo crear un empleado, consultar sus datos mediante
 * métodos getter, modificar sus ventas mediante un método setter y mostrar la
 * información actualizada utilizando {@code toString()}.</p>
 */
public class PruebaEmpleadoPorComision {

    /**
     * Punto de entrada del programa.
     *
     * @param args argumentos recibidos desde la línea de comandos; no se utilizan
     */
    public static void main(String[] args) {
	// Crea un empleado por comisión con sus datos personales y laborales.
	// La tarifa 0.10 representa una comisión del 10 % sobre sus ventas.
	EmpleadoPorComision empleado = new EmpleadoPorComision(
		"Juan", "Pérez", "123-45-6789", 0.10, 15000.00);

	// Obtiene y muestra los datos del empleado mediante sus métodos getter.
	System.out.println("Información del empleado obtenida mediante getters:\n");
	System.out.printf("%s %s%n", "El nombre es:", empleado.getNombre());
	System.out.printf("%s %s%n", "El apellido paterno es:",
		empleado.getApellidoPaterno());
	System.out.printf("%s %s%n", "El número de Seguro Social es:",
		empleado.getNumeroSeguroSocial());
	System.out.printf("%s %.2f%n", "La comisión es:", empleado.getComision());
	System.out.printf("%s %.2f%n", "El monto de ventas es:",
		empleado.getMontoVentas());

	// Calcula y muestra los ingresos obtenidos por concepto de comisión.
	System.out.printf("%s %.2f%n", "Los ingresos por comisión son:",
		empleado.Ingresos());

	// Actualiza el monto de ventas usando el setter correspondiente.
	empleado.setMontoVentas(20000.00);

	// Muestra todos los datos actualizados mediante el método toString().
	// También se imprime nuevamente el ingreso, que cambia al aumentar las ventas.
	System.out.printf("%n%s%n%n%s%n", 
		"Información actualizada del empleado:", empleado.toString());
	System.out.printf("%s %.2f%n", "Los nuevos ingresos por comisión son:",
		empleado.Ingresos());
    }
}
