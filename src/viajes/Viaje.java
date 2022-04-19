package viajes;

import java.sql.Date;

public abstract class Viaje {
    protected String origen;
    protected String destino;
    protected int costo;
    protected Date fechaSalida;
    protected Date fechaLlegada;

    
    public String getOrigen() {
        return origen;
    }
    public Date getFechaLlegada() {
        return fechaLlegada;
    }
    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    public Date getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public abstract String descripcion();
    public String cualquierMetodo(){
    return "Cualquier método implementado en la clase base";
    }
    public String cualquierMetodo2() {
    return "Cualquier método2 implementado en la clase base";
 }

}
