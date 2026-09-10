/**
 * Clase Dog: Representa un perro con sus características específicas.
 * Hereda de la clase Animal, lo que significa que obtiene propiedades y métodos de su clase padre.
 * Esta clase demuestra conceptos importantes de Programación Orientada a Objetos como:
 * - Herencia (extiende Animal)
 * - Encapsulación (atributos privados con getters/setters)
 * - Sobrecarga de constructores (múltiples formas de crear un objeto)
 * - Sobrecarga de métodos (el método bark con diferentes parámetros)
 */
public class Dog extends Animal {
    
    // ===== ATRIBUTOS (Variables de instancia) =====
    
    // El nombre del perro - identifica de forma única a cada perro
    private String name;
    
    // El sonido que hace el perro al ladrar. 
    // Se inicializa con un valor por defecto "Woof", pero puede ser cambiado
    private String barkNoise = "Woof";
    
    // El peso del perro en unidades de medida (generalmente kilogramos)
    private double weight;

    // ===== CONSTRUCTORES =====
    
    /**
     * Constructor 1: Crea un perro sin especificar el sonido del ladrido
     * Este constructor usa el valor por defecto "Woof" para barkNoise.
     * 
     * @param name el nombre del perro
     * @param breed la raza del perro (se pasa al constructor de Animal)
     * @param weight el peso del perro
     * @param colour el color del perro (se pasa al constructor de Animal)
     */
    public Dog(String name, String breed, double weight, String colour) {
        super(breed, colour); // Llama al constructor de la clase padre (Animal) con la raza y color
        this.name = name; // Asigna el nombre recibido como parámetro al atributo name
        this.weight = weight; // Asigna el peso recibido como parámetro al atributo weight
    }

    /**
     * Constructor 2: Crea un perro especificando todos los parámetros, incluyendo el sonido del ladrido
     * Este es un ejemplo de SOBRECARGA de constructores - mismo nombre, diferentes parámetros.
     * 
     * @param name el nombre del perro
     * @param breed la raza del perro (se pasa al constructor de Animal)
     * @param noise el sonido personalizado que hará el perro al ladrar
     * @param weight el peso del perro
     * @param colour el color del perro (se pasa al constructor de Animal)
     */
    public Dog(String name, String breed, String noise, double weight, String colour) {
        super(breed, colour); // Llama al constructor de la clase padre (Animal) con la raza y color
        this.name = name; // Asigna el nombre recibido como parámetro
        this.barkNoise = noise; // Asigna el sonido personalizado del ladrido
        this.weight = weight; // Asigna el peso recibido como parámetro
    }

    // ===== GETTERS (Métodos para obtener los valores de los atributos) =====
    
    /**
     * Obtiene el nombre del perro
     * @return el nombre almacenado en el atributo name
     */
    public String getName() {
        return name; // Retorna el valor del atributo name
    }

    // ===== SETTERS (Métodos para modificar los valores de los atributos) =====
    
    /**
     * Cambia el nombre del perro
     * @param name el nuevo nombre del perro
     */
    public void setName(String name) {
        this.name = name; // Asigna el nuevo nombre al atributo name
    }

    /**
     * Obtiene el sonido que hace el perro al ladrar
     * @return el valor del atributo barkNoise
     */
    public String getBarkNoise() {
        return barkNoise; // Retorna el sonido del ladrido almacenado
    }

    /**
     * Cambia el sonido que hace el perro al ladrar
     * @param barkNoise el nuevo sonido del ladrido
     */
    public void setBarkNoise(String barkNoise) {
        this.barkNoise = barkNoise; // Asigna el nuevo sonido del ladrido al atributo
    }

    /**
     * Obtiene el peso del perro
     * @return el valor del atributo weight
     */
    public double getWeight() {
        return weight; // Retorna el peso del perro
    }

    /**
     * Cambia el peso del perro
     * @param weight el nuevo peso del perro
     */
    public void setWeight(double weight) {
        this.weight = weight; // Asigna el nuevo peso al atributo weight
    }

    // ===== MÉTODOS FUNCIONALES (Métodos que realizan acciones) =====
    
    /**
     * Hace que el perro ladre usando su sonido de ladrido por defecto (barkNoise)
     * Este es un ejemplo de SOBRECARGA de métodos - mismo nombre, sin parámetros.
     * Este método imprime en la consola el sonido del ladrido almacenado en barkNoise.
     */
    public void bark() {
        System.out.println(barkNoise); // Imprime en la consola el sonido del ladrido
    }

    /**
     * Hace que el perro ladre con un sonido personalizado específico
     * Este es otro ejemplo de SOBRECARGA de métodos - mismo nombre, pero con un parámetro String.
     * La diferencia con el método anterior es que este acepta un parámetro personalizado.
     * 
     * @param bark el sonido personalizado que queremos que haga el perro en este momento
     */
    public void bark(String bark) {
        System.out.println(bark); // Imprime en la consola el sonido personalizado pasado como parámetro
    }

}