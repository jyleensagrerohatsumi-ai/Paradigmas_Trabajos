

/**
 * Representa a un empleado que recibe un salario base más una comisión.
 *
 * <p>Esta clase hereda de {@link EmpleadoPorComision} los datos personales,
 * la tarifa de comisión y el monto de ventas. Además, agrega el atributo
 * {@code salarioBase}, que representa una cantidad fija adicional.</p>
 *
 * <p>Los ingresos totales se calculan sumando el salario base a la comisión
 * obtenida sobre las ventas. Los valores económicos se validan al crear o
 * modificar el objeto para evitar datos inválidos.</p>
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision {

   /**
    * Cantidad fija que el empleado recibe además de la comisión.
    *
    * <p>Este valor no depende directamente del monto de ventas, pero forma
    * parte de los ingresos totales del empleado.</p>
    */
   private double salarioBase;

   /**
   * Crea un empleado con salario base y comisión, validando sus datos
   * económicos antes de almacenarlos.
   *
   * <p>Primero se ejecuta el constructor de la superclase mediante
   * {@code super(...)}. Esto inicializa los atributos heredados, como el
   * nombre, las ventas y la comisión. Después se comprueba que el salario
   * base no sea negativo.</p>
    *
    * @param primerNombre       nombre de pila del empleado
    * @param apellidoPaterno    apellido paterno del empleado
    * @param numeroSeguroSocial número de seguro social del empleado
    * @param ventasBrutas       monto inicial de ventas brutas; debe ser no
    *                           negativo
    * @param tarifaComision     tarifa decimal de comisión; debe ser mayor que 0 y
    *                           menor que 1
    * @param salarioBase        salario fijo inicial; debe ser no negativo
    * @throws IllegalArgumentException si algún valor económico no cumple las
    *                                  reglas
    */

   public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno,
         String numeroSeguroSocial, double ventasBrutas,
         double tarifaComision, double salarioBase) {

      // Invoca al constructor de EmpleadoPorComision. Esta instrucción debe
      // ser la primera del constructor y prepara los atributos heredados:
      // nombre, apellido, número de seguro social, comisión y ventas.
      // La firma correcta del constructor padre es:
      // EmpleadoPorComision(String nombre, String apellidoPaterno,
      // String numeroSeguroSocial, double comision, double montoVentas)
      super(primerNombre, apellidoPaterno, numeroSeguroSocial,
         tarifaComision, ventasBrutas);

      // Comprueba que el salario base represente una cantidad válida. Se
      // permite el valor cero, pero no se permiten cantidades negativas.
      if (salarioBase < 0.0)
         throw new IllegalArgumentException(
               "El salario base debe ser >= 0.0");

      // Guarda el salario base en el atributo de esta clase. La palabra clave
      // this distingue el atributo salarioBase del parámetro del constructor.
      this.salarioBase = salarioBase;
   }

   /**
   * Modifica el salario base del empleado después de validar el nuevo valor.
   *
   * <p>La validación se repite cada vez que se modifica el atributo para
   * conservar el objeto en un estado válido durante toda su existencia.</p>
    *
    * @param salarioBase cantidad fija que el empleado recibe además de la
    *                    comisión; debe ser no negativa
    * @throws IllegalArgumentException si el salario base es negativo
    */

   public void setSalarioBase(double salarioBase) {
      // Evita que el objeto almacene un salario base negativo.
      if (salarioBase < 0.0)
         throw new IllegalArgumentException(
               "El salario base debe ser >= 0.0");

      // Actualiza el valor únicamente después de superar la validación.
      this.salarioBase = salarioBase;
   }

   /**
    * Obtiene el salario base actual del empleado.
    *
    * @return cantidad fija que recibe el empleado además de su comisión
    */
   public double getSalarioBase() {
      return salarioBase;
   }

   /**
    * Calcula los ingresos totales del empleado.
    *
    * <p>La comisión se obtiene multiplicando la tarifa de comisión heredada
    * por el monto de ventas heredado. A ese resultado se le suma el salario
    * base:</p>
    *
    * <p>{@code ingresos = salarioBase + (comision * montoVentas)}</p>
    *
    * @return ingresos totales del empleado
    */
   @Override
   public double Ingresos() {
      // Obtiene los valores heredados mediante sus métodos públicos y suma
      // la comisión calculada al salario base fijo.
      return salarioBase + (getComision() * getMontoVentas());
   }

   /**
    * Construye una representación textual del empleado.
    *
    * <p>El método utiliza {@link String#format(String, Object...)} para
    * organizar los datos en varias líneas. {@code %s} inserta texto,
    * {@code %.2f} muestra valores decimales con dos posiciones y
    * {@code %n} agrega un salto de línea compatible con el sistema operativo.</p>
    *
    * @return información personal, ventas, comisión y salario base del empleado
    */
   @Override
   public String toString() {
      // Recupera los datos heredados mediante getters y los combina con el
      // salario base para producir una descripción legible del objeto.
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
         "empleado por comision con sueldo base", getNombre(), getApellidoPaterno(),
            "numero de seguro social", getNumeroSeguroSocial(),
         "ventas brutas", getMontoVentas(),
         "tarifa de comision", getComision(),
            "salario base", getSalarioBase());
   }

}