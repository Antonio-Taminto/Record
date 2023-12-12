//Definisci un oggetto Record che rappresenti un Punto con le coordinate x & y


public class Main {
    public static void main(String[] args) {
        Punto punto = new Punto(10, 20);

        System.out.println(punto.x() + " " + punto.y());
    }
}