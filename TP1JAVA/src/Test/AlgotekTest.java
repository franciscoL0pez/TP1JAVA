package Test;

import Main.Algotek;
import Main.Efectivo;
import Main.Tarjeta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlgotekTest {

    @Test
    public void shouldAnswerWithTrue()
    {

        assertTrue( true );
    }

    @Test
    public void test01SacarUnaEntradaParaUnArtistaEnUnaUbicacionEnParticularPoseeElSiguienteCosto(){
        String evento = "La Ultima Noche Magica En River";
        String ubicaconElegida = "D018";
        Efectivo efectivo = new Efectivo();


        Algotek algotek = new Algotek();
        algotek.registrarunArtistaNacional(evento,"Tan bionica",50000.0);
        algotek.registrarUbicacionPlatea(evento,"M912",25000.0);
        algotek.registrarUbicacionPlatea(evento,ubicaconElegida,2000.0);

        Double costoEsperado = Math.log(50000.0);
        costoEsperado = costoEsperado + 18*2000.0;

        Double costoApagar = algotek.costoDeEntrada(evento, ubicaconElegida,efectivo);

        assertEquals(costoEsperado, costoApagar);



    }
    @Test
    public void test05LaEntradaMasBarataParaUnArtistaInternacionalPoseeElSiguienteCosto(){
        String evento ="tour";

        Efectivo efectivo = new Efectivo();
        Algotek algotek = new Algotek();

        algotek.registrarunArtistaInternacional(evento,"TS",100000.0);
        algotek.registrarUbicacionPlatea(evento,"M912",25000.0);
        algotek.registrarUbicacionPlatea(evento,"M914",20000.0);
        algotek.registrarUbicacionVip(evento,"Karma",155000.0,2);
        algotek.registrarUbicacionCampo(evento,"Campo Trasero",40000.0);

        //Act
        Double costoEsperado = ((100000.0 * 2) / 5) + 1000;
        costoEsperado = costoEsperado + 40000;
        Double costoAPagar = algotek.costoEntradaMasBarata(evento, efectivo);

        //Assert
        assertEquals(costoEsperado,costoAPagar );


    }
}
