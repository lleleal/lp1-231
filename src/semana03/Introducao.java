package semana03;

public class Introducao {
    
    public static void main(String[] args) {
        // Comentário de 1 linha

        /*
         *  Coementário de várias linhas
         */

         // Tipos Primitivos
         // Inteiros
         // byte, short, int, long

         byte n1 = 100; //1 byte - -128 a 127
         short n2 = 3000; // 2 bytes - -32768 a 32767
         int n3 = 321321321; // 4 bytes- 2 bilhões
         long n4 = 3232323232L; //8 bytes
     
         // Ponto Flutuante
         float nota1 = 10.34343f; // 4 bytes
         double nota2 = 10.3434343; // 8 bytes

         //char
         char letra = 'A';

         //boolean
         boolean ligado = true;
         boolean teste = false;

         //String (mais complexo que usa tipos primitivos, começa com maiúscula = classe)
         String nome = "João da Silva";
         System.out.println(nome);
         System.out.println(nome.toLowerCase());
         System.out.println(nome.toUpperCase());
         

    }
}
