// Crear una clase coche.
// Dentro de la clase coche, una variable númerica que almacene el número de puertas que tiene.
// Una función que incremente el número de puertas que tiene el coche.
// Crear un Objecto miCoche en el main y añadirle una puerta.
// Mostrar el número de puertas que tiene el Objecto.
class Main {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        System.out.println(miCoche.puertas);
    }
}

class coche{
    public int puertas = 0;
    
    public void agregarPuertas(){
        this.puertas++;
    }
}