
package intermain;

public class InterMain {

    public static void main(String[] args) {

        Vehiculo car = new Vehiculo();
        Bicicleta bike = new Bicicleta();
        
        car.avanzar();
        bike.avanzar();
        car.detenerse();
        
        bike.sentarse();
        
    }
}