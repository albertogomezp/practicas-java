//Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince (15 filas).
public class p638{ 
  public static void main(String[] args){
    String Result1 ="";
    String Resultx ="";
    String Result2 ="";
    String adjust ="";
    int Prob = 0;
    for(int bet = 1 ; bet <= 3 ; bet++){
      System.out.print("                    APUESTA #"+bet+"                  ");
    }
    System.out.println("");
    for (int bet2 =  1; bet2 <= 15; bet2++){
      for (int cont = 1; cont <=3; cont++){
         Prob = (int)((Math.random()*6)+1);
         if(Prob <= 3){
          Result1 ="1";
          Resultx =" ";
          Result2 =" ";
         }
         if(Prob >3 && Prob<=5){
          Result1 =" ";
          Resultx ="X";
          Result2 =" ";
         }
         if(Prob == 6){
          Result1 =" ";
          Resultx =" ";
          Result2 ="2";
         }
        if(bet2 <10){
          adjust="0";
        }
        else{
          adjust="";
        }
        if(bet2 <=14){
          System.out.print(" |        | EQUIPO #"+adjust+bet2+" - EQUIPO #"+(29-bet2)+" ["+Result1+"]"+" ["+Resultx+"]"+" ["+Result2+"] ");
        }
        else{
          System.out.print(" |  PLENO | EQUIPO #"+29+" - EQUIPO #"+(30)+" ["+Result1+"]"+" ["+Resultx+"]"+" ["+Result2+"] ");
        }
      } 
      System.out.println(""); 
    }
  }
}