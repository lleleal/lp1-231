package semana12.exercicios.exercicio1.exercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    public void encontraUmImcBaixoPeso() {
        //AAA
        //Arrange
        double altura = 2.10;
        double peso = 50.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(0, classificacao);
    }

    @Test
    public void encontraUmImcPesoNormal() {
       //AAA
        //Arrange
        double altura = 1.75;
        double peso = 60.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(1, classificacao);
    }

    @Test
    public void encontraUmImcExecessoPeso() {
        //AAA
        //Arrange
        double altura = 1.70;
        double peso = 80.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(2, classificacao);
    }

    @Test
    public void encontraUmImcObesidade1() {
        //AAA
        //Arrange
        double altura = 1.70;
        double peso = 100.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(3, classificacao);
    }

    @Test
    public void encontraUmImcObesidade2() {
        //AAA
        //Arrange
        double altura = 1.70;
        double peso = 110.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(4, classificacao);
    }

    @Test
    public void encontraUmImcObesidade3() {
        //AAA
        //Arrange
        double altura = 1.70;
        double peso = 150.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(5, classificacao);
    }

    @Test
    public void calculaUmImcBaixoPeso() {
        //AAA
        //Arrange
        double altura = 2.10;
        double peso = 50.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        double imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(11.337869644165039, imc);
    }

    @Test
    public void calculaUmImcPesoNormal() {
       //AAA
        //Arrange
        double altura = 1.75;
        double peso = 60.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        double imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(19.59183692932129, imc);
    }

    @Test
    public void calculaUmImcExecessoPeso() {
        //AAA
        //Arrange
        double altura = 1.70;
        double peso = 80.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        double imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(27.681659698486328, imc);
    }

    @Test
    public void calculaUmImcObesidade1() {
        //AAA
        //Arrange
        double altura = 1.70;
        double peso = 100.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        double imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(34.602073669433594, imc);
    }

    @Test
    public void calculaUmImcObesidade2() {
        //AAA
        //Arrange
        double altura = 1.70;
        double peso = 110.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        double imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(38.06228256225586, imc);
    }

    @Test
    public void calculaUmImcObesidade3() {
        //AAA
        //Arrange
        double altura = 1.70;
        double peso = 150.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        double imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(51.90311050415039, imc);
    }

    @Test
    public void mostraASituaçãoParaUmImcBaixoPeso() {

        //AAA
        //Arrange
        double altura = 2.10;
        double peso = 50.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("GANHAR", pesoIdeal);
    }

    @Test
    public void mostraASituaçãoParaUmImcPesoNormal() {
       //AAA
        //Arrange
        double altura = 1.75;
        double peso = 60.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("NORMAL", pesoIdeal);
    }
  
    @Test
    public void mostraASituaçãoParaUmImcExecessoPeso() {
        //AAA
        //Arrange
        double altura = 1.70;
        double peso = 80.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("PERDER", pesoIdeal);
    }

    @Test
    public void mostraASituaçãoParaUmImcObesidade1() {
        //AAA
        //Arrange
        double altura = 1.70;
        double peso = 100.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("PERDER", pesoIdeal);
    }

    @Test
    public void mostraASituaçãoParaUmImcObesidade2() {
        //AAA
        //Arrange
        double altura = 1.70;
        double peso = 110.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("PERDER", pesoIdeal);
    }

    @Test
    public void mostraASituaçãoParaUmImcObesidade3() {
        //AAA
        //Arrange
        double altura = 1.70;
        double peso = 150.0;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("PERDER", pesoIdeal);
    }



}
