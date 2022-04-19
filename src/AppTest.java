import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tiposViajes.ViajeFamiliar;

public class AppTest {
    @Test
    public void testLeerViajes() {
        ViajeFamiliar viaje1 = new ViajeFamiliar();
        
        viaje1.setOrigen("Pasto");
                
        assertTrue(viaje1.getOrigen().equals("Pasto")) ;
    }

    @Test
    public void testMostrarViajes() {
        ViajeFamiliar viaje = new ViajeFamiliar();
        
        viaje.setOrigen("Pasto");
        assertTrue(viaje.getOrigen().equals("Pasto")) ;
    }
}
