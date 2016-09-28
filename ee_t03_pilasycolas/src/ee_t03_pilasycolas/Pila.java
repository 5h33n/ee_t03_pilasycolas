package ee_t03_pilasycolas;
/**
 * Esta clase permite utilizar pilas de un tipo dado
 * @author Oscar Eduardo López Guzmán (Sheen)
 * 22/09/2016
 * @param <T> Tipo de dato que definirá de qué tipo será la pila
 */
public class Pila <T> {
	/** Se crea una lista ligada **/
	private ListaLigada<T> pila;
	/**
	 * getter de pila
	 * @return devuelve un dato de tipo Lista ligada
	 */
    public ListaLigada<T> getPila() {
		return pila;
	}
    /**
     * setter de pila
     * @param pila requiere un parámetro de tipo listaligada
     */
	public void setPila(ListaLigada<T> pila) {
		this.pila = pila;
	}
	/**
	 * Constructor de la pila, inicialuza una lista ligada vacía
	 */
	public Pila(){
		this.pila=new ListaLigada<T>();
	}
	/**
	 * El método push permite agregar un dato al final de la pila
	 * @param dato requiere un dato de tipo T
	 */
	public void push(T dato){
		pila.insertaInicio(dato);
	}
	/**
	 * El método pop elimina el último dato de la pila y lo devuelve
	 * @return Variable de tipo T con el dato eliminado
	 */
	public T pop(){
		T dato=pila.getInicio().getDato();
		pila.setInicio(pila.getInicio().getSiguiente());
		return dato;
	}
	/**
	 * El método peek permite visualizar el ultimo dato de la pila sin eliminarlo
	 * @return El último dato agregado a la pila
	 */
	public T peek(){
		T dato=pila.getInicio().getDato();
		return dato;
	}
}
