package tp_3.pkg1_eda;

/**
 *
 * @author Joaco y Fer
 */
public class Pila {
    
    
    int tope = -1;
    int n = 10;
    int []pila = new int[n];
    
    public Pila(){
        
    }
    
    
    
    public void push(int s){
        
        if (tope < n-1) {
            tope = tope + 1;
            pila[tope] = s;
            System.out.println(pila[tope]);
        } else {
            System.out.println("La pila esta llena.");
        }
    }
    
    public void pop(){
        
        if (tope >= 0) {
            n = pila[tope];
            tope = tope - 1;
            System.out.println("Elemento eliminado: " + n);
        } else {
            System.out.println("La pila esta vacia, no se puede eliminar.");
        }
    }
    
    public boolean pilaVacia(){
        boolean vacia;
        if (tope == -1) {
            System.out.println("La pila esta vacia.");
            vacia = true;
        } else {
            System.out.println("La pila NO esta vacia.");
            vacia = false;
        }
        
        return vacia;
    }
    
    public boolean pilaLlena(){
        boolean llena;
        
        if (tope == n-1) {
            System.out.println("La pila esta llena.");
            llena = true;
        } else {
            System.out.println("La pila no esta llena.");
            llena = false;
        }
        return llena;
    }
    
    public void verElemento(){
        for (int i = 0; i < n; i++) {
            System.out.println(pila[i]);
        }
    }
    
}
