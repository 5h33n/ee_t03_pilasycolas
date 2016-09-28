package ee_t03_pilasycolas;
/**
 * Esta clase permite crear colas de un tipo dado
 * @author Oscar Eduardo López Guzmán (Sheen)
 * 22/09/2016
 * @param <T> Tipo de dato que definirá de qué tipo será la cola
 */
public class Cola<T> {
	private ListaLigada<T> cola;
	/**
	 * getter de Cola
	 * @return devuelve una lista ligada
	 */
    public ListaLigada<T> getCola() {
		return cola;
	}
    /**
     * setter de cola
     * @param cola requiere un parámetro de tipo lista ligada
     */
	public void setCola(ListaLigada<T> cola) {
		this.cola = cola;
	}
	/**
	 * Inserta un dato en la cola
	 * @param dato requiere un parámetro de tipo T a insertar en la cola
	 */
	public void insertar(T dato){
		if(cola.getInicio()!=null){
			cola.insertaFinal(dato);
		}else{
			cola.insertaInicio(dato);
		}
    
    }
	/**
	 * Elimina el primer dato introducido a la cola
	 * @return devuelve el dato que se eliminó
	 */
	public T eliminar(){
		Nodo<T> temporal=cola.getInicio();
		cola.setInicio(temporal.getSiguiente());
		return temporal.getDato();
    }
}