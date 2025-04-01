import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando produtos com diferentes construtores
        Produto produto1 = new Produto(1);
        produto1.inserir("Jogo Batalha Naval", 10, "jogo", 100.00);
        
        Produto produto2 = new Produto(2, "Jogo Master", 20);
        produto2.comprar(5); // Compra sem alterar o valor
        
        Produto produto3 = new Produto(3, "Jogo Quebra-Cabeça", 30, "jogo", 50.00);
        
        // Vender produtos
        produto1.vender(5);
        produto2.vender(50); // Tentativa de vender mais do que a quantidade disponível
        produto3.vender(10);
        
        // Consultar produtos
        System.out.println(produto1.consultar());
        System.out.println(produto2.consultar());
        System.out.println(produto3.consultar());

        // Comparar produtos
        boolean saoIguais = produto1.igual(produto2);
        System.out.println("Produto 1 é igual ao Produto 2? " + saoIguais);

        scanner.close();
    }
}