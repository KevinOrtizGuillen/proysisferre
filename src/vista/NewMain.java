/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.sun.glass.ui.SystemClipboard;
import java.util.Scanner;

/**
 *
 * @author Ortiz
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Bienvenido pulse la tecla 1, para empezar la tecla 0 para salir");
    while("0"!=tc.next()){
       PedirOperacion();
    }
        System.out.println("Gracias por probar el programita");
     
}
static Scanner tc=new Scanner(System.in);
static void PedirOperacion (){
     System.out.println("Hola, que desea realizar?\n 1: Hallar area de un Cuadrado?\n2Hallar area de un triangulo\n3. halla area de un circulo");
     System.out.println("Ingrese la operación");
     Scanner tc=new Scanner(System.in);
     String ing=tc.next();
     switch(ing){
         case "1":
             System.out.println("Area de un Cuadrado");
             OpracionDatos(1);
             break;
         case "2":
             System.out.println("Area de un triangulo");
             OpracionDatos(2);
             break;
         case "3":
             System.out.println("Area de un circulo");
             OpracionDatos(3);
         default :             
             System.out.println("Opción desconocida por favor vuelva a ingresar una \nopción valida");            
         
      }



}

static void OpracionDatos(int op){
    switch (op){
        case 1:
            System.out.println("Ingrese altura del cuadrado");
            double alt=tc.nextDouble();
            System.out.println("Ingrese ancho del cuadrado");
            double anc=tc.nextDouble();
            System.out.println("El area es: "+hallarAreaCua(alt, anc));
            break;
        case 2:
            System.out.println("Ingrese altura del triangulo");
            double alt1=tc.nextDouble();
            System.out.println("Ingrese base del triangulo");
            double base=tc.nextDouble();
            System.out.println("El area es: "+hallarAreaTri(alt1,base));
            break;
        case 3:
            System.out.println("Ingrese radio del circulo");
            double radio=tc.nextDouble();
            System.out.println("El area es: "+hallarAreaCir(radio));
            break;
    }
} 

static double hallarAreaCua(double alt, double anc){
    return alt*anc;
}
static double hallarAreaTri(double base, double alt){
    return (base*alt)/2;
}
static double hallarAreaCir(double radio){
return Math.PI*Math.pow(radio, 2);
}
    
    
}
