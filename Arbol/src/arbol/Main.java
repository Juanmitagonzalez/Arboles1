
package arbol;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
       Arbol arbol= new Arbol ();
       int opcion=-1,nodo=0,cantidad=0;
        do {
            System.out.println("Elige opción:\n1.- Insertar Nodo" +
						"\n2.- imprimir inorden " +
						"\n3.- Imprimir postorden " +
						"\n4.- Imprimir preorden " +
						"\n0.- Salir ");
            opcion= read.nextInt();
            switch(opcion){
                case 1: 
                  
                    System.out.println(" ¿Cuantos nodos desea ingresar? ");
                    cantidad=read.nextInt();
                    for(int i=0;i<cantidad;i++){
                    System.out.println("     Ingrese el numero para el nodo :" + (i+1) );
                    nodo= read.nextInt();
                    arbol.insertar(nodo);
                    }
                    break; 
                case 2 :
                    System.out.println("INORDEN :");  
        
                    arbol.dispararInorden();
                    break; 
                case 3:
                 System.out.println("POSTORDEN:");
       
                arbol.dispararPostorden();
                System.out.println(" "); 
                break; 
                case 4: 
                           System.out.println("PREORDEN: ");
                           arbol.dispararPreorden();
                           System.out.println(   "  "   ); 
                           break; 
                case 0: 
					System.out.println("Adios!");
					break;           
            }
            
        } while (opcion!=0);
       /*
        arbol.insertar(43);
        arbol.insertar(10);
        arbol.insertar(8);
        arbol.insertar(54);
        arbol.insertar(15);
        arbol.insertar(50);
        arbol.insertar(53);
        
       
        System.out.println("INORDEN :");  
        
        arbol.dispararInorden();
        
        System.out.println(" ");
        
        System.out.println("POSTORDEN:");
       
        arbol.dispararPostorden();
        System.out.println(" ");
        
        System.out.println("PREORDEN: ");
        arbol.dispararPreorden();
        System.out.println(   "  "   );
*/
    }
}
