//! \class Clase mazo de Uno y Medio

/*!
  Clase encargada de representar armar el deck inicial 
  Crea, almacena, baraja/revuelve y copia el deck inicial de 64 cartas especiales y 9 cartas especiales en arreglos de tipo Carta para su posterior uso.
*/

import javax.swing.*;
public class Mazo{
	
	private Carta [] cartas;

	public Mazo(){
		cartas = new Carta [73];
		int contador = 0;
		for (int j = 0 ; j < 4 ; j++){
			String [] colores = {"Azul", "Rojo" , "Verde" , "Amarillo"}; 
			for (int i = 0 ; i <=7 ; i++){
				Carta cartaInstancia = new Carta(i,colores[j]);
				cartas[contador] = cartaInstancia;
				contador ++;
				Carta cartaInstancia2 = new Carta(i,colores[j]);
				cartas[contador] = cartaInstancia;
				contador ++;
			}
		}
		for (int j = 0 ; j < 1 ; j++){
			String [] especial1= {"Come 2"};
			for (int i = 8; i==8; ++i){
				Carta cartaInstancia3 = new Carta(i,especial1[j]);
				cartas[contador] = cartaInstancia3;
				contador++;
				Carta cartaInstancia4 = new Carta(i,especial1[j]);
				cartas[contador] = cartaInstancia3;
				contador++;
				Carta cartaInstancia5 = new Carta(i,especial1[j]);
				cartas[contador] = cartaInstancia3;
				contador++;
			}
		}

		for (int j = 0 ; j < 1 ; j++){
			String [] especial2 = {"Cancelar"};
			for (int i = 9; i==9; ++i){
				Carta cartaInstancia6 = new Carta(i,especial2[j]);
				cartas[contador] = cartaInstancia6;
				contador++;
				Carta cartaInstancia7 = new Carta(i,especial2[j]);
				cartas[contador] = cartaInstancia6;
				contador++;
				Carta cartaInstancia8 = new Carta(i,especial2[j]);
				cartas[contador] = cartaInstancia6;
				contador++;
			} 
		}

		for (int j = 0 ; j < 1 ; j++){
			String [] especial3 = {"Busca en pila"};
			for (int i = 9; i==9; ++i){
				Carta cartaInstancia9 = new Carta(i,especial3[j]);
				cartas[contador] = cartaInstancia9;
				contador++;
				Carta cartaInstancia10 = new Carta(i,especial3[j]);
				cartas[contador] = cartaInstancia9;
				contador++;
				Carta cartaInstancia11 = new Carta(i,especial3[j]);
				cartas[contador] = cartaInstancia9;
				contador++;
			} 
		}
	}

	/*! \brief baraja/revuelve el mazo
    *
    * intercambio las celdas del arreglo de forma aleatoria
    * 
    */
	public void revolver(){
		for (int  i = 0 ; i  < cartas.length; i++){
			int aleatorio = (int)(Math.random()*73);
			intercambiarValores(cartas,i,aleatorio);
		}
	}

	/*! \brief intercambia valores entre celdas de un mismo arreglo
    *
    \param Carta[] es un arreglo de tipo carta
    \param int entero que indica la casilla de uno de los numeros a intecambiar
    \param int entero que indica la casilla de uno de los numeros a intecambiar
    */
	private void intercambiarValores(Carta [] arregloReferencia, int indice1, int indice2){
		if (indice1 >=0 && indice2 >= 0 && indice1 < arregloReferencia.length && indice2 < arregloReferencia.length){
			Carta contadororal = arregloReferencia[indice1];
			arregloReferencia[indice1] = arregloReferencia[indice2];
			arregloReferencia[indice2] = contadororal;	
		}
	}

	/*! \brief imprime las cartas
    *
    * Imprime el valor almacenado en las celdas, corresponde a cada carta dentro del arreglo
    * 
    */
	public void imprimir(){
		for(int i = 0 ; i< this.cartas.length; i++){
			System.out.println(this.cartas[i]);
		}
	}

	/*! \brief Convierte a String el valor numerico de la carta
    *
    * Convierte el valor recibido a un String y le agrega el color.
    * 
    */
	public String toString(){
		String contenido = "";
		for(int i = 0 ; i< this.cartas.length; i++){
			contenido += (this.cartas[i] + "\n");
		}
		return contenido;
	}
	/*! \brief imprime el numero de la carta
    *
    \param Int entero que contiene el valor numero de una carta
    */
	public void imprimirNumero(int numeroCarta){
		int numero = this.cartas[numeroCarta].getNumero();
		System.out.println(numero);
	}



	public static void main (String args[]){
		Mazo mazo = new Mazo();
		//JOptionPane.showMessageDialog(null, mazo);
		mazo.revolver();
		System.out.println(mazo);
	}



}