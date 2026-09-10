/**
 * Clase AnimalTester: Programa de prueba para demostrar la creación y uso de objetos
 * Esta clase sirve como un programa de prueba (Tester/Demo) que muestra:
 * - La creación de instancias de subclases (Dog y Fish) que heredan de Animal
 * - La sobrecarga de constructores (dog1 sin ruido personalizado vs dog2 con ruido personalizado)
 * - El acceso a métodos getters de diferentes objetos
 * - La herencia en acción: los objetos Dog y Fish pueden acceder a métodos getBreed() 
 *   y getColour() que vienen de la clase padre Animal
 * - La invocación de métodos específicos de cada subclase
 */
public class AnimalTester {
    
    /**
     * Método main: Punto de entrada del programa
     * Este es el primer método que se ejecuta cuando se corre el programa.
     * El parámetro String[] args permite pasar argumentos desde la línea de comandos
     * (aunque en este caso no los utilizamos).
     */
    public static void main(String[] args) {
        
        // ===== CREACIÓN DE OBJETOS (INSTANCIAS) =====
        
        /**
         * PERRO 1: Creamos el primer objeto Dog usando el Constructor 1
         * Este constructor NO especifica un sonido personalizado de ladrido,
         * por lo que usa el valor por defecto "Woof" definido en la clase Dog.
         * 
         * Los parámetros en orden son:
         * - "Bailey" = nombre del perro (parámetro de Dog)
         * - "Boerboel" = raza del perro (parámetro de Animal)
         * - 80.2 = peso del perro en kg (parámetro de Dog)
         * - "brown" = color del perro (parámetro de Animal)
         */
        Dog dog1 = new Dog("Bailey", "Boerboel", 80.2, "brown");
        
        /**
         * PERRO 2: Creamos el segundo objeto Dog usando el Constructor 2 (SOBRECARGADO)
         * Este constructor es diferente al primero porque ESPECIFICA un sonido personalizado.
         * Note que este constructor tiene 5 parámetros vs 4 del primero.
         * 
         * Los parámetros en orden son:
         * - "Bailey" = nombre del perro (parámetro de Dog)
         * - "Boerboel" = raza del perro (parámetro de Animal)
         * - "arf-arf" = sonido personalizado del ladrido (parámetro específico de este constructor)
         * - 80.2 = peso del perro en kg (parámetro de Dog)
         * - "brown" = color del perro (parámetro de Animal)
         */
        Dog dog2 = new Dog("Bailey", "Boerboel", "arf-arf", 80.2, "brown");
        
        /**
         * PEZ: Creamos un objeto Fish (otra subclase de Animal)
         * Este demuestra que la herencia funciona con múltiples subclases.
         * 
         * Los parámetros son:
         * - "Goldfish" = nombre/tipo de pez
         * - "cold" = tipo de agua donde vive el pez
         * - "red" = color del pez
         */
        Fish fish = new Fish("Goldfish", "cold", "red");

        // ===== SALIDA DE DATOS DEL PERRO 1 =====
        
        System.out.println("=== Dog 1 ===");

        /**
         * Imprime el nombre del perro 1
         * Llama al método getName() de dog1, que retorna la cadena "Bailey"
         * Esta información viene del atributo privado name de la clase Dog
         */
        System.out.println("Dog name: " + dog1.getName());
        
        /**
         * Imprime la raza del perro 1
         * Nota importante: getName() NO existe en la clase Dog, viene de Animal
         * Esto es HERENCIA en acción - dog1 hereda getBreed() de su clase padre
         * El método getBreed() retorna el valor almacenado en la clase Animal
         */
        System.out.println("Dog breed: " + dog1.getBreed()); // Lo obtiene de Animal
        
        /**
         * Prepara el texto "Bark noise: " sin salto de línea
         * Usamos System.out.print() en lugar de println() para NO añadir salto de línea
         * Esto permite que el siguiente println() aparezca en la misma línea
         */
        System.out.print("Bark noise: ");
        
        /**
         * Invoca el método bark() del perro 1
         * Este método imprime el valor almacenado en barkNoise (el ladrido)
         * En este caso, como dog1 fue creado con el Constructor 1, usa el valor por defecto "Woof"
         * El método bark() ejecutará System.out.println("Woof")
         */
        dog1.bark(); // Imprime el sonido del ladrido del perro 1
        
        /**
         * Imprime el peso del perro 1
         * Llama al método getWeight() que retorna el valor del atributo weight
         * El valor en este caso es 80.2 (kilogramos)
         */
        System.out.println("Dog weight: " + dog1.getWeight());
        
        /**
         * Imprime el color del perro 1
         * getColour() es un método heredado de la clase Animal
         * Retorna el valor del atributo colour que fue inicializado en el constructor
         * El valor en este caso es "brown"
         */
        System.out.println("Dog colour: " + dog1.getColour()); // Lo obtiene de Animal

        /**
         * Imprime una línea en blanco (sin argumentos)
         * System.out.println() sin parámetros simplemente hace un salto de línea
         * Esto se usa para separar visualmente diferentes grupos de salida en la consola
         */
        System.out.println(); // Línea en blanco para separar la salida

        // ===== SALIDA DE DATOS DEL PERRO 2 =====
        
        System.out.println("=== Dog 2 ===");

        /**
         * Imprime el nombre del perro 2
         * Al igual que dog1, llamamos getName() que retorna "Bailey"
         * Ambos perros tienen el mismo nombre, pero diferente sonido de ladrido
         */
        System.out.println("Dog name: " + dog2.getName());
        
        /**
         * Imprime la raza del perro 2
         * Otra llamada heredada a la clase Animal
         * El valor es "Boerboel" para ambos perros
         */
        System.out.println("Dog breed: " + dog2.getBreed()); // Lo obtiene de Animal
        
        /**
         * Prepara el texto "Bark noise: " sin salto de línea
         * Igual que antes, usamos print() para mantener el siguiente texto en la misma línea
         */
        System.out.print("Bark noise: ");
        
        /**
         * Invoca el método bark() del perro 2
         * DIFERENCIA IMPORTANTE: dog2 fue creado con el Constructor 2 que especifica "arf-arf"
         * Por lo tanto, este bark() imprimirá "arf-arf" en lugar de "Woof"
         * Esto demuestra cómo el Constructor 2 personaliza el comportamiento del objeto
         */
        dog2.bark(); // Imprime el sonido del ladrido del perro 2
        
        /**
         * Imprime el peso del perro 2
         * getWeight() retorna 80.2 (el mismo peso que dog1)
         * Aunque tienen el mismo peso, los objetos son instancias independientes
         */
        System.out.println("Dog weight: " + dog2.getWeight());
        
        /**
         * Imprime el color del perro 2
         * Color heredado de Animal, valor "brown"
         * Ambos perros tienen el mismo color
         */
        System.out.println("Dog colour: " + dog2.getColour()); // Lo obtiene de Animal

        /**
         * Imprime una segunda línea en blanco
         * Separa visualmente el grupo de datos de los perros del grupo de datos del pez
         */
        System.out.println(); // Línea en blanco para separar la salida

        // ===== SALIDA DE DATOS DEL PEZ =====

        System.out.println("=== Fish ===");
        
        /**
         * Imprime la raza/tipo del pez
         * getBreed() es heredado de Animal
         * El pez usa este atributo para almacenar su tipo "Goldfish"
         * Demuestra que múltiples subclases reutilizan los atributos de la clase padre
         */
        System.out.println("Fish breed: " + fish.getBreed()); // Lo obtiene de Animal
        
        /**
         * Imprime el tipo de agua del pez
         * getWaterType() es un método específico de la clase Fish (no heredado de Animal)
         * Retorna "cold" que fue especificado en el constructor del Fish
         * Este atributo es único de la subclase Fish y no existe en Animal
         */
        System.out.println("Water type: " + fish.getWaterType());
        
        /**
         * Imprime el color del pez
         * getColour() es heredado de Animal
         * El valor es "red" que fue especificado en el constructor
         * Esto muestra nuevamente que Fish también hereda atributos y métodos de Animal
         */
        System.out.println("Fish colour: " + fish.getColour()); // Lo obtiene de Animal
    }
}