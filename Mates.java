//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.lang.Math;
import java.util.ArrayList;
import java.util.List;
public class Mates {

    //Método ejercicio 1:
    public static int SumaI(int n) {
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            suma = suma + i;
        }
        return suma;
    }

    //Método ejercicio 2:
    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    //Método ejercicio 3:
    public static int Potencia(int n){
        int potencia = 1;
        for (int i = 1; i <= n; i++) {
            potencia = potencia * i;
        }
        return potencia;
    }

    //Método ejercicio 4:
    public static int Lista(int[] numeros) {
        int sumalista = 0;
        for (int num : numeros) {
            sumalista = sumalista + num;
        }
        return sumalista;
    }

    //Método ejercicio 5:
    public static double Media(int[] numeros){
        int sumamedia = 0;
        for (int num : numeros) {
            sumamedia = sumamedia + num;
        }
        return (double) sumamedia / numeros.length;
    }

    //Método ejercicio 6:
    public static double Desviacion(int[] numeros){
    //Establecemos la media mediante el ejercicio anterior
    double media = Media(numeros);
    double sumaDiferencia = 0;
    for (int num : numeros) {
        sumaDiferencia = sumaDiferencia + Math.pow(num - media, 2);
    }
    //calculamos la desviaciación tipica
    return Math.sqrt(sumaDiferencia/numeros.length);
    }

    //Método ejercicio 7:
    public static int Pares(int n){
        int sumapares = 0;

        if (n % 2 != 0) {
            n--;
        }
        for (int i = n; i >= 2; i -= 2){
            sumapares += i;
        }
        return sumapares;
    }

    //Método ejercicio 8:
    public static int ListaPares(int[] numeros){
        int sumalista = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                sumalista = sumalista + num;
            }
        }
        return sumalista;
    }

    //Método ejercicio 9:
    public static List<Integer> obtenerListaPares(int[] numeros){
        List<Integer> pares1 = new ArrayList<>();
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares1.add(num);
            }
        }
        return pares1;
    }

    //Método ejercicio 10:
    public static List<Integer> SacarPares(int n){
        List<Integer> pares2 = new ArrayList<>();

        if (n % 2 != 0) {
            n--;
        }
        for (int i = n; i >= 2; i -= 2){
            pares2.add(i);
        }
        return pares2;
    }

    //Método ejercicio 11:
    public static int calcularEscalar(int[] numeros, int[] numeros2) {
        int productoescalar = 0;

        //Verificamos que ambas listas tienen el mismo tamaño
        if (numeros.length != numeros2.length) {
            throw new IllegalArgumentException("Ambas listas deben tener el mismo tamaño");
        }

        for (int i = 0; i < numeros.length; i++) {
            productoescalar = productoescalar + numeros[i] * numeros2[i];
        }
        return productoescalar;
    }
}