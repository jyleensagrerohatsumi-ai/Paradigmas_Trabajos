// Fig. 9.7: PruebaEmpleadoBaseMasComision.java
// Programa de prueba de la clase EmpleadoBaseMasComision.

public class PruebaEmpleadoBaseMasComision
{
   public static void main(String[] args)
   {
      // crea una instancia del objeto EmpleadoBaseMasComision
      EmpleadoBaseMasComision empleado = 
         new EmpleadoBaseMasComision("Ana", "Luisa", "123456", 5000, .05, 8000);

      // obtiene datos del empleado con salario base más comisión
      System.out.println("Informacion del empleado obtenida por metodos establecer:\n");
      System.out.printf("%s %s%n", "El primer nombre es: ",
         empleado.getPrimerNombre());
      System.out.printf("%s %s%n", "El apellido paterno es: ",
         empleado.getApellidoPaterno());
      System.out.printf("%s %s%n", "El numero de seguro social es: ",
         empleado.getNumeroSeguroSocial());
      System.out.printf("%s %.2f%n", "Las ventas brutas son: ",
         empleado.getVentasBrutas());
      System.out.printf("%s %.2f%n", "La tarifa de comision es: ",
         empleado.getTarifaComision());
      System.out.printf("%s %.2f%n", "El salario base es: ",
         empleado.getSalarioBase());

      empleado.setSalarioBase(5000);

      System.out.printf("%n%s:%n%n%s%n",
         "Informacion actualizada del empleado obtenida por toString: ",
         empleado.toString());
   } 
}
