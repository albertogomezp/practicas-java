/* Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código ascii entre el 32 y el 126. 
Puedes hacer casting con (char) para convertir un entero en un carácter. */ 
public class p6312{ 
  public static void main(String[] args){
    char ascii = 0;
    for(long print = 0; print <= 99999999; print++){
      ascii = (char)((Math.random()*95)+32);
      System.out.print(ascii+" ");
    }    
  }
}