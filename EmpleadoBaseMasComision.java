/**
 * Representa a un empleado que recibe un salario base más una comisión
 * calculada a partir del monto de sus ventas brutas.
 *
 * <p>
 * La clase valida los valores económicos al crear o modificar el objeto
 * para evitar ventas, salarios o tarifas de comisión inválidos.
 * </p>
 */
public class EmpleadoBaseMasComision {
   /** Nombre de pila del empleado; se establece una sola vez. */
   private final String primerNombre;

   /** Apellido paterno del empleado; se establece una sola vez. */
   private final String apellidoPaterno;

   /** Número de seguro social del empleado; se establece una sola vez. */
   private final String numeroSeguroSocial;

   /** Monto total de ventas realizadas por el empleado. */
   private double ventasBrutas;

   /** Porcentaje de comisión expresado como valor decimal entre 0 y 1. */
   private double tarifaComision;

   /** Cantidad fija que el empleado recibe además de la comisión. */
   private double salarioBase;

   /**
    * Crea un empleado y valida sus datos económicos.
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

      // Las ventas no pueden ser negativas porque representan un monto acumulado.
      if (ventasBrutas < 0.0)
         throw new IllegalArgumentException(
               "Las ventas brutas deben ser >= 0.0");

      // La tarifa debe expresarse como fracción: 0.10 equivale a una comisión del 10
      // %.
      if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
         throw new IllegalArgumentException(
               "La tarifa de comision debe ser > 0.0 y < 1.0");

      // El salario base debe ser cero o una cantidad positiva.
      if (salarioBase < 0.0)
         throw new IllegalArgumentException(
               "El salario base debe ser >= 0.0");

      this.primerNombre = primerNombre;
      this.apellidoPaterno = apellidoPaterno;
      this.numeroSeguroSocial = numeroSeguroSocial;
      this.ventasBrutas = ventasBrutas;
      this.tarifaComision = tarifaComision;
      this.salarioBase = salarioBase;
   }

   /** @return el nombre de pila del empleado */
   public String getPrimerNombre() {
      return primerNombre;
   }

   /** @return el apellido paterno del empleado */
   public String getApellidoPaterno() {
      return apellidoPaterno;
   }

   /** @return el número de seguro social del empleado */
   public String getNumeroSeguroSocial() {
      return numeroSeguroSocial;
   }

   /**
    * Actualiza el monto de ventas brutas después de validar que no sea negativo.
    *
    * @param ventasBrutas nuevo monto de ventas brutas
    * @throws IllegalArgumentException si el monto es negativo
    */
   public void setVentasBrutas(double ventasBrutas) {
      // Se repite la validación para mantener el objeto en un estado válido.
      if (ventasBrutas < 0.0)
         throw new IllegalArgumentException(
               "Las ventas brutas deben ser >= 0.0");

      this.ventasBrutas = ventasBrutas;
   }

   /** @return el monto actual de ventas brutas */
   public double getVentasBrutas() {
      return ventasBrutas;
   }

   /**
    * Actualiza la tarifa de comisión.
    *
    * @param tarifaComision nueva tarifa decimal, estrictamente entre 0 y 1
    * @throws IllegalArgumentException si la tarifa no está dentro del intervalo
    *                                  válido
    */
   public void setTarifaComision(double tarifaComision) {
      // Una tarifa de 0 o 1 no representa una comisión válida en este modelo.
      if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
         throw new IllegalArgumentException(
               "La tarifa de comision debe ser > 0.0 y < 1.0");

      this.tarifaComision = tarifaComision;
   }

   /** @return la tarifa de comisión expresada como valor decimal */
   public double getTarifaComision() {
      return tarifaComision;
   }

   /**
    * Actualiza el salario base después de comprobar que no sea negativo.
    *
    * @param salarioBase nuevo salario base
    * @throws IllegalArgumentException si el salario es negativo
    */
   public void setSalarioBase(double salarioBase) {
      // El salario base puede ser cero, pero nunca una cantidad negativa.
      if (salarioBase < 0.0)
         throw new IllegalArgumentException(
               "El salario base debe ser >= 0.0");

      this.salarioBase = salarioBase;
   }

   /** @return el salario base actual */
   public double getSalarioBase() {
      return salarioBase;
   }

   /**
    * Calcula los ingresos totales sumando el salario base y la comisión
    * obtenida sobre las ventas brutas.
    *
    * @return salario base más (tarifa de comisión × ventas brutas)
    */
   public double ingresos() {
      return salarioBase + (tarifaComision * ventasBrutas);
   }

   /**
    * Devuelve una descripción formateada con los datos principales del empleado.
    * Los valores monetarios y la tarifa se muestran con dos posiciones decimales.
    *
    * @return representación textual del empleado
    */
   @Override
   public String toString() {
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
            "empleado con salario base mas comision", primerNombre, apellidoPaterno,
            "numero de seguro social", numeroSeguroSocial,
            "ventas brutas", ventasBrutas, "tarifa de comision", tarifaComision,
            "salario base", salarioBase);
   }
}