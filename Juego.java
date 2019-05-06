import javax.swing.JOptionPane;

public class Juego{
		Interfaz interfaz1 = new Interfaz();
		String cantidad = "Cuantos jugadores? 1 o 2 jugadores?";
		int cantidadJugadores = interfaz1.solicitarNumeroEntero(cantidad);
		boolean IA = false;
		int contadorIndiceJugadas = 0;

	public boolean jugador2EsIA (){
		if (this.cantidadJugadores > 0 && cantidadJugadores <= 2){

			if (this.cantidadJugadores == 1){
				IA = true;
				return true;
			}
			else {
				return false;
			}
		}

		else {
			System.out.println("el numero de jugadores digitado es erróneo, solo pueden jugar 1 o dos jugadores");
			return jugador2EsIA();
		}
	} 

public void inicializarPilaDeJugadas(String card){

		String[] deckJugador1 = new String[40];
		String[] deckJugador2 = new String[40];
		String[] deckJugadorCPU = new String[40];
		String[] cartasJugadas = new String [70];
		Mazo mazo = new Mazo();

	Mazo mazoParaEsteJuego = new Mazo();
		mazoParaEsteJuego = mazo;

	cartasJugadas[contadorIndiceJugadas++] = mazoParaEsteJuego[(int) Math.random()*73];

}


	public static void main (String args[]){
		Mazo mazo = new Mazo();
		mazo.revolver();
	
		Juego juego1 = new Juego();
		juego1.jugador2EsIA();
	
		Mazo mazoParaEsteJuego = new Mazo();
		mazoParaEsteJuego = mazo;
	}

}



/*{

	crear deck para cada jugadores
	agregar una carta de la pila


	crear contador de come 2

	crear métodos para come 2 

	cancelar
	hace que buscar en pila sea false y que contador de come 2 sea 0


	buscar en pila
	metodo imprimir pila

-----------------------
if jugador2EsIA = false

turno jugador: se revisa la ultima carta jugada 
if cancelar:
else if: en caso de ser "buscar pila, se realiza la accion

else if: en caso de ser un come 2, se aumenta en contador

else:
-
-pone carta valida (color y numero) (si no hay valida, coje de la baraja en su deck y se acaba turno)

se come la cantidad de veces que haya en el contador

revisar condicion ganar

imprimir "turno del siguiente jugador"


*************************************



if jugador2EsIA = true

turno jugador: se revisa la ultima carta jugada 
if cancelar:

else if: en caso de ser "buscar pila, se realiza la accion

else if: en caso de ser un come 2, se aumenta en contador

else:
-
-pone carta valida (color y numero) (si no hay valida, coje de la baraja en su deck y se acaba turno)

se come la cantidad de veces que haya en el contador

revisar condición ganar

imprimir "turno de la IA"



turno IA:

revisa la ultima carta jugada

si fue comer:  busque en todo el arreglo si hay un come, un busca pila o un cancelar y ponga el primero

si fue un busca pila: busque en todo el arreglo si hay un come, un busca pila o un cancelar y ponga el primero

si fue un cancelar: continue

else: buscar una carta de igual color o numero.
*/
