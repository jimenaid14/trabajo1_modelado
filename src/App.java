import java.util.ArrayList;
import java.util.List;

import tiposViajes.ViajeFamiliar;
import tiposViajes.ViajeIndividual;
import viajes.Viaje;

public class App {

    /**
     * Arreglo polimórfico de viajes
     */
    public static List<Viaje> viajes = new ArrayList<Viaje>();
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        leerViajes();
        mostrarViajes(); 
    }

    /**
     * Lee viajes en el arreglo polimórfico
     */
    public static void leerViajes() {
       

        ViajeFamiliar viaje1 = new ViajeFamiliar();
         viaje1.setCosto(50);
         viaje1.setOrigen("Pasto");
         viaje1.setDestino("San Andres");
         viaje1.setFamilia(4);
         viajes.add(viaje1);


        ViajeIndividual viaje2 = new ViajeIndividual();
         viaje2.setCosto(100);
         viaje2.setOrigen("Popayan");
         viaje2.setDestino("Bogota");
        viajes.add(viaje2);
           

    }

    public static void mostrarViajes() {
        // En este caso vemos que todos los viajes ejecutan el método "descripcion()" de forma diferente
        // ya que al ser este método abstracto en la clase padre, les forzamos a as clases hijas a que
        // implementen ese método.
        for (Viaje viaje : viajes) {
            System.out.println("Origen: " + viaje.getOrigen());
            System.out.println("Destino: " + viaje.getDestino());
            System.out.println("Fecha salida: " + viaje.getFechaSalida());
            System.out.println("Fecha llegada: " + viaje.getFechaLlegada());
            System.out.println("Costo: " + viaje.getCosto());
            System.out.println("Descripción: " + viaje.descripcion());
            System.out.println("Cualquier método: " + viaje.cualquierMetodo());
            System.out.println("Cualquier método2: " + viaje.cualquierMetodo2());
            System.out.println("");
        }
    }
}
