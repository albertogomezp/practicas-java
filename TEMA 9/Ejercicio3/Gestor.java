public class Gestor{
  public static void main(String[] args) {

    Gato Kitty = new Gato(19, "Sasuke");
    Kitty.SetRaza("Somali");
    Kitty.SetPeso(1100);
    System.out.println(Kitty);

    Gato Sasuke = new Gato(19, "Sasuke");
    Kitty.SetRaza("Somali");
    Kitty.SetPeso(1100);
    System.out.println(Sasuke);
    System.out.println(Kitty.GetnumeroAnimales());

    Perro Golfo = new Perro(11, "Golfo", 80);
    Golfo.SetRaza("Mastin");
    Golfo.SetPeso(1500);
    System.out.println(Golfo);

    Canario Piquito = new Canario(12, "Piquito");
    Piquito.SetColor("Amarillo");
    Piquito.SetPeso(100);
    Piquito.Settamano("S");
    System.out.println(Piquito);
  }
}