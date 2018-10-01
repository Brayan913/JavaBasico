/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion;
import java.util.Scanner;


public class Operaciones {
    
    

    public static void main(String[] args) {
       
    Scanner ingresar = new Scanner (System.in);
        
    String Nombre;
    Integer Edad;
        
        System.out.print("Ingrese su nombre");
        Nombre = ingresar.nextLine();
        System.out.print("Ingrese su edad");
        Edad = ingresar.nextInt();
        System.out.print("Hola al mundo de Java "+Nombre);
        System.out.print(" Su edad es : "+Edad);
    }
    
}
