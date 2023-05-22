package semana12.exercicios.exercicio1.exercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTest {

    @Test
    public void calculaVolumeComNumerosInteiros() {
        //AAA
        //Arrange
        double altura = 2f;
        double largura = 50;
        double profundidade = 63f;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        double volume = aquario.calcularVolume();
        
        //Assert
        assertEquals(6.300000190734863, volume);
    }

    @Test
    public void calculaVolumeComNumerosReais() {
        //AAA
        //Arrange
        double altura = 2.10f;
        double largura = 50.0f;
        double profundidade = 63.9f;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        double volume = aquario.calcularVolume();
        
        //Assert
        assertEquals(6.709499359130859, volume);
    }


    @Test
    public void calculaFiltragemMinimaComNumerosInteiros() {
        //AAA
        //Arrange
        double altura = 2f;
        double largura = 50;
        double profundidade = 63f;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        double filtragem = aquario.calcularFiltragemMinima();
        
        //Assert
        assertEquals(12.600000381469727, filtragem);
    }

    @Test
    public void calculaFiltragemMinimaComNumerosReais() {
        //AAA
        //Arrange
        double altura = 2.10f;
        double largura = 50.0f;
        double profundidade = 63.9f;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        double filtragem = aquario.calcularFiltragemMinima();
        
        //Assert
        assertEquals(13.418998718261719, filtragem);
    }

    @Test
    public void calculaFiltragemMaximaComNumerosInteiros() {
        //AAA
        //Arrange
        double altura = 2f;
        double largura = 50;
        double profundidade = 63f;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        double filtragem = aquario.calcularFiltragemMaxima();
        
        //Assert
        assertEquals(18.900001525878906, filtragem);
    }

    @Test
    public void calculaFiltragemMaximaComNumerosReais() {
        //AAA
        //Arrange
        double altura = 2.10f;
        double largura = 50.0f;
        double profundidade = 63.9f;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        double filtragem = aquario.calcularFiltragemMaxima();
        
        //Assert
        assertEquals(20.128498077392578, filtragem);
    }

    @Test
    public void calculaPotenciaPositivaNegativaComNumerosInteiros() {
        //AAA
        //Arrange
        double altura = 2f;
        double largura = 50;
        double profundidade = 63f;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        double tempMin = 56f;
        double tempMax = 23f;
        //Act
        double potencia = aquario.calcularPotenciaTermostato(tempMin, tempMax);
        //Assert
        assertEquals(10.395000457763672, potencia);
    }

    @Test
    public void calculaPotenciaPositivaNegativaComNumerosReais() {
        //AAA
        //Arrange
        double altura = 2.10f;
        double largura = 50.0f;
        double profundidade = 63.9f;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        double tempMin = 56.35f;
        double tempMax = 13.48f;
        //Act
        double potencia = aquario.calcularPotenciaTermostato(tempMin, tempMax);
        //Assert
        assertEquals(14.381811141967773, potencia);
    }

    @Test
    public void calculaPotenciaNegativaComNumerosInteiros() {
        //AAA
        //Arrange
        double altura = 2f;
        double largura = 50;
        double profundidade = 63f;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        double tempMin = 13f;
        double tempMax = 98f;
        //Act
        double potencia = aquario.calcularPotenciaTermostato(tempMin, tempMax);
        //Assert
        assertEquals(-26.775001525878906, potencia);
    }

    @Test
    public void calculaPotenciaNegativaComNumerosReais() {
        //AAA
        //Arrange
        double altura = 2.10f;
        double largura = 50.0f;
        double profundidade = 63.9f;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        double tempMin = 13.65f;
        double tempMax = 56.5478f;
        //Act
        double potencia = aquario.calcularPotenciaTermostato(tempMin, tempMax);
        //Assert
        assertEquals(-14.39113712310791, potencia);
    }

}
