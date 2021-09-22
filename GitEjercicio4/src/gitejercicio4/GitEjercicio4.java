
package gitejercicio4;

import Animales.Caballo;
import Animales.Gato;
import Animales.Pato;
import Animales.Perro;

public class GitEjercicio4 {

    public static void main(String[] args) {
        Gato gato = new Gato();
        Perro perro = new Perro("Dog", 10, 2, false, true);
        Caballo caballo = new Caballo("IJA", 50, 5, false, true);
        Pato pato = new Pato(2, "Mestizo", "Blanco", "Grande");
        System.out.println("Cuales son sus datos señor/a Gato");
        gato.setNombre("Cat");
        gato.setPeso(2);
        gato.setAltura(1);
        gato.setCola(true);
        gato.setDuenho(false);
        System.out.println(gato.toString());
        System.out.println("Cuales son sus datos señor/a Perro");
        System.out.println(perro.toString());
        System.out.println("Cuales son sus datos señor/a Caballo");
        System.out.println(caballo.toString());
        System.out.println(pato.toString());
                
    }
    
}
