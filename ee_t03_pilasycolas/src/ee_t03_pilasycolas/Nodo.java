package ee_t03_pilasycolas;
/**
 * Esta clase genera un nodo de un tipo dado
 * @author Oscar Eduardo L�pez Guzm�n (Sheen)
 * 22/09/2016
 * @param <T> Tipo de dato que definir� de qu� tipo ser� el nodo
 */
public class Nodo<T>{
	 private T dato;
	 private Nodo<T> siguiente;
	 /**
	  * getter del Dato
	  * @return devuelve un dato de tipo T
	  */
	 public T getDato(){ 
		 return dato;
	 }
	 /**
	  * Setter de dato
	  * @param dato requiere un par�metro de tipo T
	  */
	 public void setDato(T dato){
		 this.dato=dato;
	 }
	 /**
	  * getter de siguiente
	  * @return regresa el valor a donde apunta siguiente, de tipo Nodo
	  */
	 public Nodo<T> getSiguiente(){
		 return siguiente;
	 }
	 /**
	  * Setter de siguiente 
	  * @param siguiente requiere un par�metro de tipo Nodo
	  */
	 public void setSiguiente(Nodo<T> siguiente){
		 this.siguiente=siguiente;
	 }
	 /**
	  * Constructor la clase nodo que incializa dato, y siguiente
	  * @param dato requiere un par�metro de tipo t, dato
	  */
	 public Nodo(T dato){
		 this.dato=dato;
		 siguiente=null;
	 }
	 /**
	  * Sobreescritura del m�todo toString
	  * @return String dato
	  */
	 public String ToString(){
		 return ""+dato;
	 }
}
