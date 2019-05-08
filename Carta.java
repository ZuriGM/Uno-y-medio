//! \class Clase carta de un deck de UNO y Medio

/*!
  Clase encargada de representar una carta de un deck. 
  Puede almacenar, retornar e imprimir los valores numéricos de la carta y una coloración que la representa
*/
public class Carta{
   
   private String color; // un atributo de tipo texto que contiene el color
   private int numero; // un atributo de tipo entero que contiene el numero

   public Carta(int numero, String color){
      this.numero = numero;
      this.color = color;
   }

   /*! \brief Asigna un color a la carta
    *
    \param String hilera que tendrá el tipo de carta (especiales o amarillo)
    */
   public void setcolor(String colorParametro){
      color = colorParametro;
   }

   /*! \brief Asigna un número a la carta
    *
    \param int el número que tendrá la carta entre 1 y 7; entre 8 y 10 para especiales
    */
   public void setNumero(int numeroParametro){
      numero = numeroParametro;
   }

   /*! \brief Retorna el valor numérico de la carta
    *
    \return int del valor numerico de la carta
    */
   public int getNumero(){
      return this.numero;
   }

   /*! \brief Retorna el valor del palo de la carta
    *
    \return String el palo que de la carta
    */
   public String getcolor(){
      return this.color;
   }

   /*! \brief Imprime el contenido de la carta
    *
    * Imprime el contenido de la carta en consola utilizando un método que convierte el valor y contenido
    * de una carta a un String. 
    */
   public void imprimir(){
      String contenido = "La carta es:\n";
      contenido = contenido +"\t"+ convertirNumeroCarta() + " de " + color + "\n";
      System.out.println(contenido);
   }

    /*! \brief Convierte a String el valor numerico de la carta
    *
    * Convierte el valor recibido a un String y le agrega el color.
    * 
    */
   public String toString(){
      return convertirNumeroCarta() + " " + color;
   }
   public String convertirNumeroCarta(){
      String valorCarta = "";
      switch(numero){
         case 8:
            valorCarta = "Especial!";
         break;
         case 9:
            valorCarta = "Parar!";
         break;
         case 10:
            valorCarta = "Busca!";
         break;
         default:
            valorCarta += this.numero;
      }
      return valorCarta;
   }


}