package ee_t03_pilasycolas;
import java.io.*;
/**
 * Esta clase prueba la funcionalidad de las pilas y las colas
 * @author Oscar Eduardo L�pez Guzm�n (Sheen)
 * @version 2.0.1
 * 22/09/2016
 */
public class Test {
	/**
	 * M�todo inicial en en cual se 
	 * @param args (en el argumento 0 debe pasarse un archivo de texto)
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void main(String...args) throws FileNotFoundException, IOException{
		Test x = new Test();
		try{
			x.leer(args[0]);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	/**
	 * El Este m�todo leer� un archivo y seg�n las instrucciones del mismo, arrojar� un resultado
	 * despu�s de procesar una cadena
	 * @param archivo (Un archivo de texto pasado como par�metro)
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void leer(String archivo) throws FileNotFoundException, IOException {
        FileReader fR = new FileReader(archivo);
        BufferedReader bR = new BufferedReader(fR);
        String n = bR.readLine();
        String r;
        /**
         * Se comprueba el primer caracter
         */
        if(n.equals("0")){
        	Pila<Integer> pilita = new Pila<Integer>();
        	r=bR.readLine();
        	while (r!=null) {
				if(r.charAt(0)=='0'){
					pilita.push(Integer.parseInt(Character.toString(r.charAt(1))));
				}else if(r.charAt(0)=='1'){
					System.out.println(pilita.pop());
				}else if(r.charAt(0)=='2'){
					System.out.println(pilita.peek());
				}else{
					System.out.println("Opci�n introducida fuera de rango");
				}
				r=bR.readLine();
			}
        }else if(n.equals("1")){
        	Cola<Integer> colita = new Cola<Integer>();
        	r=bR.readLine();
        	while (r!=null) {
				if(r.charAt(0)=='0'){
					colita.insertar(Integer.parseInt(Character.toString(r.charAt(1))));
				}else if(r.charAt(0)=='1'){
					System.out.println(colita.eliminar());
				}else{
					System.out.println("Opci�n introducida fuera de rango");
				}
				r=bR.readLine();
			}
        }else{
        	System.out.println("Opci�n incorrecta en la primer linea");
        }
        bR.close();
    }
}
