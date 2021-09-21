package Animales;

/**
 *
 * @author Capoun
 */
public class Gato {
    private String nombre;
    private int peso, altura;
    private boolean cola, duenho;

    public Gato() {
    }

    public Gato(String nombre, int peso, int altura, boolean cola, boolean duenho) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.cola = cola;
        this.duenho = duenho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public boolean isDuenho() {
        return duenho;
    }

    public void setDuenho(boolean duenho) {
        this.duenho = duenho;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + ", cola=" + cola + ", duenho=" + duenho + '}';
    }
    
}

