public class Main {

    /**
     * Método principal de la aplicación.
     *
     * <p>Este método es el punto de entrada de cualquier programa en Java.
     * Aquí se ejecuta la lógica de prueba para crear un objeto de la clase
     * {@link EmpleadoBaseMasComision} y mostrar sus datos e ingresos.</p>
     *
     * <p>La clase {@code EmpleadoBaseMasComision} hereda de
     * {@code EmpleadoPorComision} y agrega un salario base fijo que se suma a la
     * comisión obtenida por las ventas realizadas.</p>
     *
     * @param args argumentos enviados al programa desde la línea de comandos.
     *             En este ejemplo no se utilizan, pero Java exige que estén
     *             presentes en el método {@code main}.
     */
    public static void main(String[] args) {

        // ------------------------------------------------------------------
        // 1. Creamos un empleado con salario base y comisión.
        // ------------------------------------------------------------------
        // La firma del constructor es la siguiente:
        // EmpleadoBaseMasComision(String primerNombre,
        //                         String apellidoPaterno,
        //                         String numeroSeguroSocial,
        //                         double ventasBrutas,
        //                         double tarifaComision,
        //                         double salarioBase)
        //
        // Los valores elegidos representan:
        // - Nombre: "Ana"
        // - Apellido: "García"
        // - NSS: "123-45-6789"
        // - Ventas brutas: 5000.0
        // - Tarifa de comisión: 0.10 (10%)
        // - Salario base: 1200.0
        //
        // La clase padre EmpleadoPorComision valida que la comisión sea > 0 y
        // < 1, y que las ventas no sean negativas o cero. La clase hija valida
        // que el salario base no sea negativo.
        EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision(
                "Ana", "Garcia", "123-45-6789", 5000.0, 0.10, 1200.0
        );

        // ------------------------------------------------------------------
        // 2. Mostramos la información del empleado usando toString().
        // ------------------------------------------------------------------
        // El método toString() fue sobrescrito (override) en la clase hija para
        // mostrar el nombre, apellido, NSS, ventas, comisión y salario base.
        // Al imprimir el objeto directamente, Java llama automáticamente a este
        // método.
        System.out.println("=== Datos del empleado ===");
        System.out.println(empleado);

        // ------------------------------------------------------------------
        // 3. Calculamos e imprimimos los ingresos totales.
        // ------------------------------------------------------------------
        // La lógica de la clase hija dice:
        // ingresos = salarioBase + (tarifaComision * montoVentas)
        //
        // En este caso:
        // salarioBase = 1200.0
        // comisión = 0.10 * 5000.0 = 500.0
        // ingresos = 1200.0 + 500.0 = 1700.0
        double ingresosTotales = empleado.Ingresos();
        System.out.printf("Ingresos totales: %.2f%n", ingresosTotales);

        // ------------------------------------------------------------------
        // 4. Modificamos algunos valores para mostrar el uso de setters.
        // ------------------------------------------------------------------
        // Los setters permiten cambiar la información del empleado después de
        // crear el objeto, siempre validando que los datos sean correctos.
        empleado.setMontoVentas(7000.0);
        empleado.setComision(0.12);
        empleado.setSalarioBase(1500.0);

        // Se vuelve a mostrar la información para verificar que los cambios
        // se aplicaron correctamente.
        System.out.println("\n=== Datos actualizados ===");
        System.out.println(empleado);

        // Con los nuevos valores calculamos otra vez los ingresos:
        // comisión = 0.12 * 7000.0 = 840.0
        // salario base = 1500.0
        // ingresos = 1500.0 + 840.0 = 2340.0
        System.out.printf("Nuevos ingresos totales: %.2f%n", empleado.Ingresos());

        // ------------------------------------------------------------------
        // 5. Se muestra un ejemplo de validación.
        // ------------------------------------------------------------------
        // Si intentamos asignar una comisión inválida o un salario base negativo,
        // la clase lanzará IllegalArgumentException. Esto ayuda a mantener el
        // estado del objeto siempre en un formato correcto.
        //
        // Ejemplo comentado:
        // empleado.setComision(1.0); // lanza excepción
        // empleado.setSalarioBase(-50.0); // lanza excepción

        // ------------------------------------------------------------------
        // 6. Fin del programa.
        // ------------------------------------------------------------------
        System.out.println("\nPrograma finalizado correctamente.");
    }
}
