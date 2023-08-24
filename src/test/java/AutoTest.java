import org.junit.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AutoTest extends Vehiculo {


    @Test
    public void testAutoEsSeguro(){
        Auto auto = new Auto(true, 40);
        boolean ruedaAuxilioEsperado = true;
        boolean ruedaAuxilioObtenido = auto.isRuedaAuxilio();
        Assert.assertEquals(ruedaAuxilioEsperado,ruedaAuxilioObtenido);
        boolean velocidadSuperadaEsperado= false;
        boolean velocidadSuperadaObtenido = auto.velocidadSuperada();
        Assert.assertEquals(velocidadSuperadaEsperado,velocidadSuperadaObtenido);
    }

}