import org.junit.Assert;
import org.testng.annotations.Test;

public class ConductorTest extends Vehiculo {

    @Test
    public void testIsTieneRegistro() {
        Conductor conductor1 = new Conductor(true);
        Auto auto = new Auto(true, 45);
        boolean esperado = true;
        boolean obtenido = conductor1.tieneRegistro;
        Assert.assertEquals(esperado, obtenido);
    }


    @Test
    public void testEsConductorSeguro() {
        Conductor conductor1 = new Conductor(true);
        Auto auto = new Auto(true, 39);
        boolean tieneRegistroEsperado = true;
        boolean tieneRegistroObtenido = conductor1.tieneRegistro;
        boolean autoSeguroEsperado = true;
        boolean autoSeguroObtenido = auto.esSeguro();
        Assert.assertEquals(tieneRegistroEsperado,tieneRegistroObtenido);
        Assert.assertEquals(autoSeguroEsperado,autoSeguroObtenido);
    }
}