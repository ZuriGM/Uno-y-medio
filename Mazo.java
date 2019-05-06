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


	public void revolver(){
		for (int  i = 0 ; i  < cartas.length; i++){
			int aleatorio = (int)(Math.random()*73);
			intercambiarValores(cartas,i,aleatorio);
		}
	}

	private void intercambiarValores(Carta [] arregloReferencia, int indice1, int indice2){
		if (indice1 >=0 && indice2 >= 0 && indice1 < arregloReferencia.length && indice2 < arregloReferencia.length){
			Carta contadororal = arregloReferencia[indice1];
			arregloReferencia[indice1] = arregloReferencia[indice2];
			arregloReferencia[indice2] = contadororal;	
		}
	}

	public void imprimir(){
		for(int i = 0 ; i< this.cartas.length; i++){
			System.out.println(this.cartas[i]);
		}
	}

	public String toString(){
		String contenido = "";
		for(int i = 0 ; i< this.cartas.length; i++){
			contenido += (this.cartas[i] + "\n");
		}
		return contenido;
	}

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