package semana12.exercicios.exercicio1.exercicio1;

public class Aquario {
    
    double altura, largura, comprimento;

    public Aquario(double altura, double largura, double comprimento){
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public Aquario(double valorUnico){
        this.altura = valorUnico;
        this.largura = valorUnico;
        this.comprimento = valorUnico;
    }


    public double calcularVolume() {
        return (altura*largura*comprimento)/1000;
    }
    
    public double calcularPotenciaTermostato(double temperaturaAmbiente, double temperaturaDesejada) {
        return calcularVolume() * 0.05f * (temperaturaAmbiente - temperaturaDesejada);
    }
    
    public String calcularQuantidadeLitrosFiltro(){
        return "Filtragem mínima: " + calcularFiltragemMinima() + "\n Filtragem Máxima: " + calcularFiltragemMaxima();
    }

    public double calcularFiltragemMinima() {
        return calcularVolume() * 2;
    }
    
    public double calcularFiltragemMaxima() {
        return calcularVolume() * 3;
    }
}
