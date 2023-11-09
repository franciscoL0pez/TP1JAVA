package Test;

import Main.ArtistaInternacional;
import Main.ArtistaNacional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ArtistaTest {

    @Test
    public void shouldAnswerWithTrue()
    {

        assertTrue( true );
    }


    @Test
    public void test01SecreaUnArtistaNacionalYSeCalculaSuTarifa(){

        //Arrange
        ArtistaNacional artista = new ArtistaNacional();
        artista.nombreConTarifa("Fredy",1000.0);

        //Act
        Double resultadoEsperado = Math.log(1000.0);

        //Assert
        assertEquals(resultadoEsperado, artista.calcularTarifa());
    }

    @Test
    public void test02SecreaUnArtistaInternacionalYSeCalculaSuTarifa(){
        //Arange
        ArtistaInternacional artista = new ArtistaInternacional();
        artista.nombreConTarifa("fran",1000.0);

        //Act
        Double costoEsperado = ((1000.0*2)/5) +1000;

        //Assert
        assertEquals(costoEsperado, artista.calcularTarifa());
    }
}
