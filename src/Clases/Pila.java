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
            pila[++tope] = s;
        } else {
            System.out.println("La pila esta llena.");
        }
    }
    
    public int pop(){
        int elemento = 0;
        if (tope >= 0) {
//            elemento = pila[tope];
//            tope = tope - 1;
                return pila[tope--];
        } else {
            System.out.println("No hay nada para popear");
            return 0;
        }
    }
    
    public boolean pilaVacia(){
        
        return tope == -1;
    }
    
    public boolean pilaLlena(){
        
        return tope == n-1;
    }
    
    public void verElemento(){
        for (int i = 0; i <= tope; i++) {
            System.out.println(pila[i] + ", Posicion: " + (i + 1));
        }
    }
    
    public Pila invierteSimple(){
        Pila pilaAux1 = new Pila(n); 
        Pila pilaAux2 = new Pila(n);
        
        while(!this.pilaVacia()){
            pilaAux1.push(this.pop());
        }
        while(!pilaAux1.pilaVacia()){
            pilaAux2.push(pilaAux1.pop());
        }
        while(!pilaAux2.pilaVacia()){
            this.push(pilaAux2.pop());
        }
            return this;
    }
    
}
