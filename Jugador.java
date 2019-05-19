//! \class Clase Juego que se utiliza para ejecutar el juego

/*!
  Crea y ejecutael programa, además de nombrar ciertos atributos que permiten la ejecuión de la mayoría
  métodos.
*/

public class Jugador {
		
		Mazo[] cartasJugador = new Mazo[73];
		int indiceDeck = 0; ///< contador que permite saber cúal es la siguiente celda disponible en la mano y que permita agregar una carta
		Interfaz interfaz = new Interfaz();
	
	public Jugador() {

		String[] cartasJugador = new String[73];
	}
	
    /*! \brief retorna el valor actual del indiceDeck
    *
    * Imprime el valor almacenado en IndiceDeck, lo que significa que imprime el indice de la última celda agregada en el arreglo la ultima que vez que se modifcó con algun método
    * 
    */
	public int getIndiceDeck(){
		return indiceDeck;
	}
    /*! \brief Asigna un número al indiceDeck
    *
    \param int el número que asignará
    */
	public void setIndiceDeck(int valor){
		indiceDeck = valor;
	}
	/*! \brief retorna el arreglo que contiene las cartas del jugador
    *
    * retorna un arreglo de tipo Mazo que contiene las cartas del jugador
    * 
    */
	public Mazo[] getCartasJugador(){
		
		return cartasJugador;
	}
	
	/*! \brief crea los manos iniciales de cada jugador
    *
    \param int el número de cartas que se agregaran a la mano
    */
	public Mazo[] crearMazos(int cartas, Mazo[] mazoParaEsteJuego)
	{
		int indice = indiceDeck;
		cartasJugador[indiceDeck] = mazoParaEsteJuego[indice++];
		indiceDeck++;

		return cartasJugador;
	}

	/*! \brief método que permite agarrar una carta de la pila
    *
    *método que permite agarrar una carta de la pila
    */

    public int cantidadDeCartasRestante(){
    	return cartasJugador.length;
    }

	public void agarrarDeLaPila(Mazo[] cartasJugadas){
		int indice = indiceDeck;
		cartasJugador[indiceDeck] = cartasJugadas[cartasJugadas.length];
		indiceDeck++;
	}

	public void imprimirCartasJugador(){
		for(int i=0; i<=cartasJugador.length; i++){
			System.out.println("en la celda " + i + "está la carta: " + cartasJugador[i]);
		}
	}
	
	/*! \brief Agrega 2 cartas a la mano del jugadores
	 * este método agrega ejecuta una accion llamada come 2, que agrega 2 cartas a la mano de un jugador x cantidad de veces (cantidad de cartas come dos acuimuladas)
	 * 
	 */
	public void come2 (int contadorCome2, Mazo[] deck){

		for(int i = 0; i<=contadorCome2; i++){
		int variable=0;
		cartasJugador[indiceDeck] = deck[variable++];
		}
	}

		/*! \brief ejecuta la acción de buscar cartas en la pila de cartas ya jugadas
	 * este método imprime la lista de cartas ya jugadas y le permite al jugador elegir una carta
	 * 
	 */
	public void buscarEnPila(Mazo[] cartasJugadas){
		for(int i= 0; i<=cartasJugadas.length; i++){
			System.out.println("En la celda " + i + " esta: " + cartasJugadas[i]);
		}
		int indice = interfaz.solicitarNumeroEntero("digite la celda con la carta que quiere coger de la pila");
		
		cartasJugador[indiceDeck] = cartasJugadas[indice];
		indiceDeck++;
	}



	public static void main (String args[]){
	}

}