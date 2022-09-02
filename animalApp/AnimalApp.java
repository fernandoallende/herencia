/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente:
 */
package animalApp;

import animales.Animal;
import animales.Caballo;
import animales.Gato;
import animales.Perro;
import java.util.ArrayList;


public class AnimalApp {

     
    public static void main(String[] args) {
        ArrayList<Animal> p = new ArrayList();
        System.out.println("ingrese los datos del perro ");
        Animal perro = new Perro();
        perro.alimentarse();
        p.add(perro);
        System.out.println("ingrese los datos del gato ");
        Animal gato = new Gato();
        gato.alimentarse();
        p.add(gato);
        System.out.println("ingrese los datos del Caballo ");
        Animal caballo = new Caballo();
        caballo.alimentarse();
        p.add(caballo);

        for (Animal animal : p) {
            if (animal instanceof Perro) {
                Perro object = (Perro) animal;
                System.out.println("el perro se alimenta de: " + perro.getAlimento());
                continue;
            }
            if (animal instanceof Gato) {
                Gato object = (Gato) animal;
                System.out.println("el gato se alimenta de: " + gato.getAlimento());
                continue;
            }
            if (animal instanceof Caballo) {
                Caballo object = (Caballo) animal;
                System.out.println("el caballo se alimenta de: " + caballo.getAlimento());
            }
        }
    }
}
