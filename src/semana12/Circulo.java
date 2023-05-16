package semana12;

public class Circulo {
    public double raio;

    public Circulo(double raio) {
        if (raio <= 0.0) {
            throw new IllegalAccessError("Base inválida");
        }

        this.raio = raio;
    }

    
    public double calcularArea(){
        return Math.PI * (raio * raio);
    }
    
    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }

}
