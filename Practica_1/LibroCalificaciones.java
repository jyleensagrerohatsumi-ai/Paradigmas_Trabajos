public class LibroCalificaciones {
    
    // 1. Variables de instancia con acceso privado (Parte III)
    private String nombreCurso;
    private String nombreProfesor;
    private int horasCurso;

    // 2. Constructor que inicializa los valores para corregir el error de valores nulos (Actividad)
    public LibroCalificaciones(String nombreCurso, String nombreProfesor, int horasCurso) {
        this.nombreCurso = nombreCurso;
        this.nombreProfesor = nombreProfesor;
        this.horasCurso = horasCurso;
    }

    // 3. Métodos de acceso (Getters) para obtener los valores (Parte III)
    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public int getHorasCurso() {
        return horasCurso;
    }

    // 4. Tres métodos mutadores particulares (Setters) (Actividad)
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public void setHorasCurso(int horasCurso) {
        this.horasCurso = horasCurso;
    }

    // 5. Método funcional sin parámetros que usa los getters (Parte III)
    public void mostrarMensaje() {
        System.out.println("\nBienvenido al libro de calificaciones");
        System.out.println("El nombre del curso es: " + getNombreCurso());
        System.out.println("El nombre del profesor asignado es: " + getNombreProfesor());
        System.out.println("Las horas asignadas al curso son: " + getHorasCurso());
    }
}