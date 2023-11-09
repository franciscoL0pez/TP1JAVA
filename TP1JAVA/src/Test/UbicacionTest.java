package Test;

import Main.Platea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UbicacionTest {

    @Test
    public void shouldAnswerWithTrue()
    {

        assertTrue( true );
    }

    @Test
    public void test01SeCreaUnaPlateaYSeCalculaSuTarifa(){

        //Arrange
        Platea platea = new Platea();
        platea.nombreConTarifa("AB21",1000.0);

        //Act
        double resultadoEsperado = 1000.0*21;

        //Assert
        assertEquals(resultadoEsperado, platea.calcularTarifa());

    }
}
