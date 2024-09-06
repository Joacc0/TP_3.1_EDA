package Clases;

/**
 *
 * @author Joaco y Fer
 */
public class Pila {
    
    
    int tope = -1;
    int n;
    int []pila;
    
    public Pila(int n){
        this.n = n;
        this.pila = new int [n];
    }
    
    public void push(int s){
        
        if (tope < n-1) {
            tope = tope + 1;
            pila[tope] = s;
        } else {
            System.out.println("La pila esta llena.");
        }
    }
    
    public int pop(){
        int elemento = 0;
        if (tope >= 0) {
            elemento = pila[tope];
            tope = tope - 1;
        } else {
            
        }
        return elemento;
    }
    
    public boolean pilaVacia(){
        
        return tope == -1;
    }
    
    public boolean pilaLlena(){
        
        return tope == n-1;
    }
    
    public void verElemento(Pila pila1){
        int contador = 0;
        for (int i = 0; i < n; i++) {
            contador = contador + 1;
            System.out.println(pila[i] + ", Posicion: " + contador);
        }
    }
    
    public void invierteSimple(Pila pila1){
        Pila pilaAux1 = new Pila(n); 
        Pila pilaAux2 = new Pila(n);
        
        while(!pila1.pilaVacia()){
            pilaAux1.push(pila1.pop());
        }
        while(!pilaAux1.pilaVacia()){
            pilaAux2.push(pilaAux1.pop());
        }
        while(!pilaAux2.pilaVacia()){
            pila1.push(pilaAux2.pop());
        }
            
    }
    
}
