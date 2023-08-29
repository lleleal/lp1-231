package semana21;

// Interface = contrato
// Conjunto de métodos (somente assinatura, sem corpo)
// Clase concreta que IMPLEMENTA a interface

// abstract class FiguraGeometrica

// Quadrado - lado - calcular area/perímetro
// Retângulo - base, altura - calcular area/perímetro
// Circulo- ?
// ???

public class Main {
    public static void main(String[] args) {
        System.out.println("Main...");

        Tela tela = new Tela();

        Quadrado q1 = new Quadrado (10);
        Quadrado q2 = new Quadrado (20);
        Retangulo r1 = new Retangulo (10, 5);

        tela.addFigura(q1);
        tela.addFigura(q2);
        tela.addFigura(r1);

        System.out.println(tela.areaTotal());
        System.out.println(tela.perimetroTotal());
    }
}
