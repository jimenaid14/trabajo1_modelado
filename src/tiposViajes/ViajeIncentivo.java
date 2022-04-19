package tiposViajes;

import viajes.Viaje;

public class ViajeIncentivo extends Viaje {
    
    

    /**
     * Empresa que patrocina el viaje al empleado
     */
    private String empresa;
    //Constructor, getters and setters
    @Override
    public String descripcion() {
    return "Viaje incentivo que te envia la empresa " + empresa;
    }
    
    public String cualquierMetodo2() {
    return "Método implementado en la clase hija viaje de incentivo";
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
