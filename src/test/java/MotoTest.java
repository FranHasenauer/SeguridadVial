import org.junit.Assert;
import org.testng.annotations.Test;

public class MotoTest extends Vehiculo {

    @Test
    public void testMotoSegura() {
        Conductor conductor1 = new Conductor(false);
        Moto moto = new Moto(160, 2);
        //Que la velocidad no supere los 160km/Hr
        boolean velocidadSuperadaEsperada = false;
        boolean velocidadSuperadaObtenida = moto.velocidadSuperada();
        Assert.assertEquals(velocidadSuperadaEsperada, velocidadSuperadaObtenida);
        // Que tenga dos retrovisores o mas
        boolean tieneRetrovisoresEsperado = true;
        boolean tieneRetrovisoresObtenido = moto.tieneRetrovisoresSuficientes();
        Assert.assertEquals(tieneRetrovisoresEsperado, tieneRetrovisoresObtenido);


    }

}