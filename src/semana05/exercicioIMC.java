package semana05;
import java.util.Scanner;

public class exercicioIMC {
    public static void main(String[] args) {
        
        final double IMCnormal = 24.9;

        Scanner speso = new Scanner(System.in);
        System.out.println("Qual o seu peso(Kg): ");
        float peso = speso.nextFloat();

        Scanner saltura = new Scanner(System.in);
        System.out.println("Qual a sua altura(m): ");
        float altura = saltura.nextFloat();

        float IMC = peso / (altura * altura);
        System.out.println("Seu IMC é:" + IMC);

        if (IMC <= 18.5) {                       
            System.out.println("Baixo peso");
        } else if (IMC > 18.5 && IMC <= 24.9 ) {
            System.out.println("Peso Normal");
        } else if (IMC >= 25.0 && IMC <= 29.9 ){
            System.out.println("Excesso de peso");
        } else if (IMC >= 30.0 && IMC <= 34.9 ){
            System.out.println("Obesidade de Classe 1");
        } else if (IMC >= 34.9 && IMC <= 39.9 ){
                System.out.println("Obesidade de Classe 1");
        } else if (IMC >= 40.0)  {
            System.out.println("Obesidade de Classe 3");
        }
    }
}

