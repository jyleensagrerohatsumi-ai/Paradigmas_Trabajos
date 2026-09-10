/**
 * Clase Animal: Clase base (superclase) que define las características comunes de todos los animales
 * 
 * Esta es la clase PADRE en una jerarquía de herencia. Otras clases como Dog y Fish 
 * la extienden (heredan de ella) para reutilizar su código y funcionalidad.
 * 
 * Conceptos clave:
 * - Herencia: Dog y Fish heredan los atributos breed y colour de esta clase
 * - Encapsulación: Los atributos son privados, se acceden solo mediante getters/setters
 * - Abstracción: Define propiedades comunes que aplican a todos los animales
 * - Reutilización de código: Evita repetir el mismo código en subclases
 * 
 * Beneficios de usar esta clase base:
 * - Código más limpio y organizado
 * - Cambios en Animal se heredan automáticamente en Dog y Fish
 * - Si agregamos otro animal (Bird, Cat, etc.), puede heredar de Animal
 */
public class Animal {
    
    // ===== ATRIBUTOS (Variables de instancia) =====
    
    /**
     * La raza del animal.
     * Este atributo es privado, lo que significa que solo puede ser accedido 
     * desde dentro de esta clase o desde sus subclases.
     * Se declara como private para proteger la integridad de los datos.
     * Ejemplos: "Boerboel", "Goldfish", "Labrador", etc.
     */
    private String breed;
    
    /**
     * El color del animal.
     * Este atributo también es privado por razones de encapsulación.
     * Almacena el color característico del animal.
     * Ejemplos: "brown", "red", "black", "striped", etc.
     */
    private String colour;

    // ===== CONSTRUCTOR =====
    
    /**
     * Constructor general (o constructor parametrizado) de la clase Animal.
     * Este constructor se ejecuta AUTOMÁTICAMENTE cuando se crea un nuevo objeto Animal.
     * 
     * Propósito: Inicializar los atributos breed y colour con los valores proporcionados
     * 
     * Nota importante sobre HERENCIA en constructores:
     * Cuando Dog o Fish crean sus propios objetos, pueden llamar a super(breed, colour)
     * para invocar ESTE constructor y inicializar los atributos de Animal.
     * Esto garantiza que todos los datos heredados se inicialicen correctamente.
     * 
     * @param breed la raza/tipo del animal (recibido como parámetro)
     * @param colour el color del animal (recibido como parámetro)
     */
    public Animal(String breed, String colour) {
        
        /**
         * Asigna el parámetro breed al atributo breed de esta instancia.
         * this.breed hace referencia explícita al atributo de la clase Animal.
         * El parámetro breed (a la derecha) es el valor que recibimos como entrada.
         * El atributo this.breed (a la izquierda) es lo que almacenamos en el objeto.
         * 
         * Ejemplo: 
         * Si creamos Animal("Boerboel", "brown"), entonces:
         * - this.breed se asigna a "Boerboel"
         * - this.colour se asigna a "brown"
         */
        this.breed = breed; // Inicializa el atributo breed con el valor del parámetro
        
        /**
         * Asigna el parámetro colour al atributo colour de esta instancia.
         * Al igual que la línea anterior, usamos this para hacer referencia explícita
         * al atributo de la clase, distinguiéndolo del parámetro.
         */
        this.colour = colour; // Inicializa el atributo colour con el valor del parámetro
    }

    // ===== GETTERS (Métodos para OBTENER los valores de los atributos) =====
    
    /**
     * Getter para breed: Obtiene la raza del animal
     * Este método permite acceder al valor del atributo privado breed
     * desde código externo, manteniendo la encapsulación.
     * 
     * Ventajas de usar getters:
     * - Control: Podemos validar o procesar datos antes de devolverlos
     * - Seguridad: El atributo no se puede modificar accidentalmente
     * - Flexibilidad: Si cambiamos la implementación interna, el código externo sigue funcionando
     * 
     * @return el valor del atributo breed
     */
    public String getBreed() { 
        // Retorna el valor actual de la raza del animal
        return breed; 
    }
    
    // ===== SETTERS (Métodos para MODIFICAR los valores de los atributos) =====
    
    /**
     * Setter para breed: Cambia la raza del animal
     * Este método permite modificar el valor del atributo privado breed
     * de forma controlada desde código externo.
     * 
     * Ventajas de usar setters:
     * - Control: Podemos validar el nuevo valor antes de asignarlo
     * - Encapsulación: El usuario no accede directamente al atributo
     * - Lógica de negocio: Podemos ejecutar código adicional cuando se modifica un valor
     * 
     * @param breed el nuevo valor para la raza del animal
     */
    public void setBreed(String breed) { 
        // Asigna el nuevo valor del parámetro al atributo breed
        this.breed = breed; 
    }
    
    /**
     * Getter para colour: Obtiene el color del animal
     * Similar a getBreed(), este método permite acceder al atributo privado colour
     * de forma segura desde código externo.
     * 
     * @return el valor del atributo colour
     */
    public String getColour() { 
        // Retorna el valor actual del color del animal
        return colour; 
    }
    
    /**
     * Setter para colour: Cambia el color del animal
     * Similar a setBreed(), este método permite modificar el atributo privado colour
     * de forma controlada desde código externo.
     * 
     * @param colour el nuevo valor para el color del animal
     */
    public void setColour(String colour) { 
        // Asigna el nuevo valor del parámetro al atributo colour
        this.colour = colour; 
    }
}