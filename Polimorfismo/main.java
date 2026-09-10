public class main {

    public static void main(String[] args) {
	EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(
		"Ana", "Lopez", "SS-001", 15000.00);

	EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras(
		"Bruno", "Garcia", "SS-002", 45.0, 200.00);

	EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision(
		"Carla", "Martinez", "SS-003", 0.10, 50000.00);

	EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision(
		"Diego", "Hernandez", "SS-004", 60000.00, 0.08, 12000.00);

	empleadoBaseMasComision.setSalarioBase(
		empleadoBaseMasComision.getSalarioBase() * 1.10);

	Empleado[] empleados = {
		empleadoAsalariado,
		empleadoPorHoras,
		empleadoPorComision,
		empleadoBaseMasComision
	};

	System.out.println("=== NOMINA POLIMORFICA ===");
	for (Empleado empleado : empleados) {
	    System.out.println(empleado);
	    System.out.printf("Ingresos: $%.2f%n%n", empleado.Ingresos());
	}

	Empleado referenciaSuperclase = empleadoBaseMasComision;
	EmpleadoBaseMasComision referenciaSubclase =
		(EmpleadoBaseMasComision) referenciaSuperclase;
	System.out.printf("Salario base despues del aumento: $%.2f%n",
		referenciaSubclase.getSalarioBase());
    }
}
