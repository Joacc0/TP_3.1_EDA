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
        
        pila1.verElemento();
        
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Cuantos elementos desea eliminar?: / IGUAL O MENOR A 10");
        int dato = leer.nextInt();
        
        for (int i = 0; i < dato; i++) {
            pila1.pop();
        }
        
        System.out.println("--------------------------------------------------------------------");
        
        if (pila1.pilaVacia()) {
            System.out.println("La pila esta vacia.");
        } else {
            System.out.println("La pila NO esta vacia.");
        }
        
        System.out.println("--------------------------------------------------------------------");
        
        if (pila1.pilaLlena()) {
            System.out.println("La pila esta llena.");
        } else {
            System.out.println("La pila NO esta llena.");
        }
        
        pila1.invierteSimple();
        System.out.println("--------------------------------------------------------------------");
        pila1.verElemento();
        
        
        
        
    }
    
}
