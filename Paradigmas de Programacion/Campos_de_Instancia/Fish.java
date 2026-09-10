/**
 * Clase Fish: Representa un pez con sus características específicas.
 * Hereda de la clase Animal, lo que significa que obtiene propiedades y métodos de su clase padre.
 * Esta clase demuestra conceptos importantes de Programación Orientada a Objetos como:
 * - Herencia (extiende Animal)
 * - Encapsulación (atributos privados con getters/setters)
 * - Reutilización de código (hereda breed y colour de Animal)
 * - Atributos específicos de la subclase (waterType es único de Fish)
 * 
 * A diferencia de Dog, Fish tiene un solo atributo adicional (waterType) 
 * que especifica el tipo de agua en el que vive el pez (fría, templada, cálida, etc.)
 */
public class Fish extends Animal {
    
    // ===== ATRIBUTOS (Variables de instancia) =====
    
    /**
     * El tipo de agua donde vive el pez.
     * Este es un atributo específico de la clase Fish que no existe en Animal.
     * Ejemplos: "cold" (agua fría), "warm" (agua cálida), "tropical" (tropical)
     * Este atributo caracteriza el hábitat natural del pez.
     */
    private String waterType;

    // ===== CONSTRUCTOR =====
    
    /**
     * Constructor de Fish: Crea un objeto pez con todos sus parámetros
     * A diferencia de Dog que tiene dos constructores sobrecargados,
     * Fish tiene solo UN constructor que requiere todos los parámetros.
     * 
     * El documento especifica que se deben exigir todos los valores, 
     * por lo que no hay un constructor por defecto ni constructores parciales.
     * 
     * @param breed la raza/tipo del pez (se pasa al constructor de Animal)
     *             Ejemplo: "Goldfish", "Betta", "Salmon", etc.
     * @param waterType el tipo de agua donde vive el pez (específico de Fish)
     *                  Ejemplo: "cold" (agua fría), "warm" (agua cálida)
     * @param colour el color del pez (se pasa al constructor de Animal)
     *               Ejemplo: "red", "blue", "striped", etc.
     */
    public Fish(String breed, String waterType, String colour) {
        /**
         * Llama al constructor de la clase padre (Animal) con dos parámetros.
         * super() invoca el constructor de la clase madre.
         * Aquí se pasan:
         * - breed: tipo/raza del pez que se almacena en el atributo breed de Animal
         * - colour: color del pez que se almacena en el atributo colour de Animal
         * 
         * Esto garantiza que los atributos heredados de Animal se inicialicen correctamente.
         */
        super(breed, colour); // Llama al constructor de la clase padre (Animal)
        
        /**
         * Asigna el tipo de agua recibido como parámetro al atributo waterType.
         * this.waterType hace referencia explícita al atributo de la clase actual.
         * Ejemplo: Si se pasa "cold", entonces this.waterType = "cold"
         * De esta forma, cada objeto Fish almacena su propio tipo de agua.
         */
        this.waterType = waterType; // Inicializa el atributo waterType con el parámetro recibido
    }

    // ===== GETTERS Y SETTERS =====
    
    /**
     * Getter para waterType: Obtiene el tipo de agua del pez
     * Este método permite acceder al valor del atributo privado waterType
     * desde fuera de la clase, manteniendo la encapsulación.
     * 
     * @return el tipo de agua donde vive el pez
     *         Ejemplo: "cold", "warm", "tropical", etc.
     */
    public String getWaterType() {
        /**
         * Retorna el valor actual del atributo waterType.
         * El keyword 'return' finaliza la ejecución del método y devuelve el valor.
         */
        return waterType; // Retorna el tipo de agua del pez
    }

    /**
     * Setter para waterType: Cambia el tipo de agua del pez
     * Este método permite modificar el valor del atributo privado waterType
     * desde fuera de la clase, pero de manera controlada.
     * 
     * @param waterType el nuevo tipo de agua para el pez
     *                  Ejemplo: "cold", "warm", "tropical", etc.
     */
    public void setWaterType(String waterType) {
        /**
         * Asigna el nuevo tipo de agua recibido como parámetro al atributo waterType.
         * this.waterType hace referencia al atributo de la instancia actual.
         * El parámetro waterType (a la derecha del =) es lo que recibimos.
         * El atributo this.waterType (a la izquierda del =) es lo que modificamos.
         * 
         * Ejemplo: Si llamamos setWaterType("warm"), entonces waterType cambia de 
         * su valor anterior a "warm".
         */
        this.waterType = waterType; // Actualiza el atributo waterType con el nuevo valor
    }
}