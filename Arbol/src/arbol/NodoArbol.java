
package arbol;


public class NodoArbol {
 int Valor,altura;
 private NodoArbol nodoIzq;
 private NodoArbol nodoDerecho;

    public NodoArbol(int Valor) {
        this.Valor = Valor;
        this.nodoIzq = null;
        this.nodoDerecho = null;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public NodoArbol getNodoIzq() {
        return nodoIzq;
    }

    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }
 public void insertar(int valor_){
     if (valor_<this.Valor){
         // Insertar nuevos nodos en el lado izquierdo
            if (this.nodoIzq==null) {
             this.nodoIzq = new NodoArbol(valor_);
                     
         } else {
                this.nodoIzq.insertar(valor_);
            }
            //Insertar nuevo nodo en el lado derecho
     }else{
         if (this.nodoDerecho==null) {
             
             this.nodoDerecho= new NodoArbol(valor_);
             
         } else{
             this.nodoDerecho.insertar(valor_);
         }
     }
             
 }
  
 
   
    
}
