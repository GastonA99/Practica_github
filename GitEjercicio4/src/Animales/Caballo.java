package Animales;

/**
 *
 * @author Gastón
 */
public class Caballo {

    private String nombre;
    private int peso, altura;
    private boolean cola, duenho;
    
    public Caballo(String nombre, int peso, int altura, boolean cola, boolean duenho) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.cola = cola;
        this.duenho = duenho;
    }

    @Override
    public String toString() {
        return "Caballo{" + "nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + ", cola=" + cola + ", duenho=" + duenho + '}';
    }
}
