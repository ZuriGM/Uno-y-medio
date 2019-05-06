public class Carta{
   
   private String color; // un atributo de tipo texto que contiene el color
   private int numero; // un atributo de tipo entero que contiene el numero

   public Carta(int numero, String color){
      this.numero = numero;
      this.color = color;
   }

   public void setcolor(String colorParametro){
      color = colorParametro;
   }

   public void setNumero(int numeroParametro){
      numero = numeroParametro;
   }

   public int getNumero(){
      return this.numero;
   }

   public String getcolor(){
      return this.color;
   }


   public void imprimir(){
      String contenido = "La carta es:\n";
      contenido = contenido +"\t"+ convertirNumeroCarta() + " de " + color + "\n";
      System.out.println(contenido);
   }

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