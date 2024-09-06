package Clases;

import java.util.Scanner;

/**
 *
 * @author Joaco y Fer
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tamanio para el arreglo: ");
        int tamanio = leer.nextInt();
        
        Pila pila1 = new Pila(tamanio);
        
        pila1.push(3);
        pila1.push(4);
        pila1.push(2);
        pila1.push(8);
        pila1.push(6);
        pila1.push(20);
        pila1.push(17);
        pila1.push(12);
        pila1.push(15);
        pila1.push(10);
        
        pila1.verElemento(pila1);
        
        System.out.println("--------------------------------------------------------------------");

//        pila1.pop();
//        pila1.pop();
//        pila1.pop();
//        pila1.pop();
//        pila1.pop();
//        pila1.pop();
//        pila1.pop();
//        pila1.pop();
//        pila1.pop();
//        pila1.pop();
        
        System.out.println("--------------------------------------------------------------------");
        
        if (pila1.pilaVacia() == true) {
            System.out.println("La pila esta vacia.");
        } else {
            System.out.println("La pila NO esta vacia.");
        }
        
        System.out.println("--------------------------------------------------------------------");
        
        if (pila1.pilaLlena() == true) {
            System.out.println("La pila esta llena.");
        } else {
            System.out.println("La pila NO esta llena.");
        }
        
        pila1.invierteSimple(pila1);
        System.out.println("--------------------------------------------------------------------");
        pila1.verElemento(pila1);
        
        
        
        
    }
    
}
