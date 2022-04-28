/**Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores. */

public class ejercicio1{

    public static void main(String[] args){
        int resultado = suma(1,2,3);
        System.out.println("resultado: "+resultado);
    }

        
    public static int suma(int num1, int num2, int num3 ){
        return num1+num2+num3;
    }

}