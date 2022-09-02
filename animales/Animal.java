/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
 */
package animales;

import java.util.Scanner;

public class Animal {
    //ATRIBUTOS
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + '}';
    }
    
    
    public void alimentarse(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el nombre ");
        setNombre(leer.next());
        System.out.println("ingrese el alimento qe consume");
        setAlimento(leer.next());
        System.out.println("ingrese la edad ");
        setEdad(leer.nextInt());
        System.out.println("ingrese la raza ");
        setRaza(leer.next());
        
        
    }
   
}
