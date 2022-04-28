/**Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto. */

public class coche{
    public int numPuertas =4;

    public void incrementarPuertas(){
        this.numPuertas++;
    }

    public static void main (String[]args){
        coche miCoche = new coche();
        System.out.println("Resultado: "+ miCoche.numPuertas);

    }
}