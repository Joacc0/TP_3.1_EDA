package tp_3.pkg1_eda;

/**
 *
 * @author Joaco y Fer
 */
public class TP_31_EDA {

    public static void main(String[] args) {
        
        Pila pila1 = new Pila();
        int longitud = 10;
        
        pila1.push(3);
        pila1.push(4);
        pila1.push(2);
        pila1.push(8);
        pila1.push(6);
        pila1.push(3);
        pila1.push(3);
        pila1.push(3);
        pila1.push(3);
        pila1.push(3);
        pila1.push(18);
        
        pila1.verElemento();
        
        System.out.println("--------------------------------------------------------------------");

        pila1.pop();
        pila1.pop();
        pila1.pop();
        pila1.pop();
        pila1.pop();
        pila1.pop();
        pila1.pop();
        pila1.pop(); //aca
//        pila1.pop();
//        pila1.pop();
//        pila1.pop();
        
        System.out.println("--------------------------------------------------------------------");
        
        pila1.pilaVacia();
        
        System.out.println("--------------------------------------------------------------------");
        
        pila1.pilaLlena();
        
        
        
    }
    
}
