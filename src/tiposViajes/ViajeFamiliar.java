package tiposViajes;

import viajes.Viaje;

public class ViajeFamiliar extends Viaje{
   
    /**
     * Cantidad de integrantes de la familia
     */
    private int familia;
    


    //Constructor getters and setters
    @Override
    public String descripcion() {
    return "Viaje para disfrutar con toda tu familia";
    }
    
    @Override
    public String cualquierMetodo2() {
    return "Método implementado en la clase hija viaje familiar";
    }

    public int getFamilia() {
        return familia;
    }
    public void setFamilia(int familia) {
        this.familia = familia;
    }

}
