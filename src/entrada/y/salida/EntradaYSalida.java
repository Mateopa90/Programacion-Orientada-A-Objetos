
package entrada.y.salida;

import java.util.Scanner;

public class EntradaYSalida {


    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);//Se crea un objeto 
       String cadena;
       System.out.println("Digite una cadena: ");
       cadena = entrada.nextLine(); // .nextLine lee toda la linea
        System.out.println(cadena);
        
       char caracter;
        System.out.println("DIGITE UN CARACTER: ");
        caracter = entrada.next().charAt(0);
        System.out.println(caracter);
       
       System.out.println(" COMO PUEDE VER SE IMPRIMIO LA CADENA Y EL CARACTER DIGITADO.");
        
    }
    
}
