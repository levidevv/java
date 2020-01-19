import java.util.Scanner;

public class Ejercicio{

   public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    String nombre="";
    int numUno = 0, numDos = 0, resultado = 0, operacion = 0;

    System.out.println("Hola, ¿cuál es tu nombre? ");
    nombre = in.nextLine();
    System.out.println("Mucho gusto " + nombre);

    System.out.println("Selecciona la operación que necesitas por favor.");
    System.out.println("Suma = 1, Resta = 2, Multiplica = 3, Divide = 4");
    operacion = in.nextInt();

    System.out.println("Tu primer número por favor: ");
    numUno = in.nextInt();

    System.out.println("Tu segundo número por favor: ");
    numDos = in.nextInt();

    if(operacion == 1){
      resultado = numUno + numDos;
      System.out.println("El resultado de tu suma es: " + resultado);
    }else if(operacion ==2){
      resultado = numUno - numDos;
      System.out.println("El resultado de tu resta es; " + resultado);
     }else if(operacion == 3){
       resultado = numUno * numDos;
       System.out.println("El resultado de tu operación es: " + resultado);
      }else if(operacion == 4){
        resultado = numUno / numDos;
        System.out.println("El resultado de tu operación es: " + resultado);
    }else{
         System.out.println("No es opción valida");
        }

    System.out.println("Gracias " + nombre); 

  }
}