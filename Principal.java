import java.util.List;

public class Principal {


    public static void main(String[] args) {
        //Establecemos la variable que nos servirá para los ejercicios:
        int n = 10;

        //Establecemos las List que nos servirá para los ejercicios:
        int[] numeros = {5, 10, 15, 20, 25, 30};
        int[] numeros2 = {3, 6, 9, 12, 15, 19};


        //Invocamos al método del Ejercicio 1:
        System.out.println("EJERCICIO 1:   La suma de 0 a " + n + " = " + Mates.SumaI(n));

        //Invocamos al método del Ejercicio 2:
        System.out.println("EJERCICIO 2:   El factorial de " + n + " = " + Mates.Factorial(n));

        //Invocamos al método del Ejercicio 3:
        System.out.println("EJERCICIO 3:   La potencia de " + n + " = " + Mates.Potencia(n));

        //Llamamos al método del Ejercicio 4:
        System.out.println("EJERCICIO 4:   La suma de la lista es = " + Mates.Lista(numeros));

        //Llamamos al método del Ejercicio 5:

        System.out.println("EJERCICIO 5:   La media aritmética de la lista es = " + Mates.Media(numeros));

        //Llamamos al método del Ejercicio 6:
        System.out.println("EJERCICIO 6:   La desviación típica de la lista es = " + Mates.Desviacion(numeros));

        //Llamamos al método del Ejercicio 7:
        System.out.println("EJERCICIO 7:   La suma de los primeros números pares hasta n es: " + Mates.Pares(n));

        //Llamamos al método del ejercicio 8:
        System.out.println("EJERCICIO 8:   La suma de los pares de la lista es: " + Mates.ListaPares(numeros));

        //Llamamos al método del ejercicio 9:
        List<Integer> listaPares = Mates.obtenerListaPares(numeros);

        System.out.println("EJERCICIO 9:   La lista de numeros pares es: " + Mates.obtenerListaPares(numeros));
        //Llamamos al método del ejercicio 10:

        List<Integer> sacarpares = Mates.SacarPares(n);
        System.out.println("EJERCICIO 10:   La lista que obtenemos es: " + Mates.SacarPares(n));

        //Llamamos al método del ejercicio 11:
        int resultado = Mates.calcularEscalar(numeros, numeros2);
        System.out.println("EJERCICIO 11:   El producto escalar de las dos listas es: " + Mates.calcularEscalar(numeros, numeros2));
    }
}

