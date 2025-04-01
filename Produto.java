public class Produto {
    int codigo;
    String nome;
    int quantidade;
    String tipo;
    double valor;

    public Produto(int codigo) {        
        this.codigo = codigo;    
    }
    public Produto(int codigo, String nome) {
        this.codigo = codigo;        
        this.nome = nome;    
    }
    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;        
        this.nome = nome;        
        this.quantidade = quantidade;    
    }
    public Produto(int codigo, String nome, int quantidade, String tipo, double valor) {
        this.codigo = codigo;        
        this.nome = nome;        
        this.quantidade = quantidade;        
        this.tipo = tipo;        
        this.valor = valor;    
    }

    public void vender(int qtd) {        
        if (qtd > quantidade) {            
            System.out.println("Estoque insuficiente para vender " + qtd + " unidades de " + nome);        
        } else {            
            quantidade -= qtd;            
            double totalVenda = qtd * valor;            
            System.out.println("Venda realizada: " + qtd + " unidades de " + nome + " - Total: R$ " + totalVenda);        
        }    
    }

    public void comprar(int qtd, double novoValor) {        
        quantidade += qtd;        
        valor = novoValor;        
        System.out.println("Compra realizada: " + qtd + " unidades de " + nome + " - Novo valor: R$ " + valor);    
    }

    public void comprar(int qtd) {        
        quantidade += qtd;        
        System.out.println("Compra realizada: " + qtd + " unidades de " + nome);    
    }

    public String consultar() {        
        return "Código: " + codigo + ", Nome: " + nome + ", Quantidade: " + quantidade + ", Tipo: " + tipo + ", Valor: R$ " + valor;    
    }

    public void inserir(String nome, int quantidade, String tipo, double valor) {        
        this.nome = nome;        
        this.quantidade = quantidade;        
        this.tipo = tipo;        
        this.valor = valor;        
        System.out.println("Dados do produto atualizados.");    
    }

    public boolean igual(Produto outroProduto) {        
        return this.nome.equals(outroProduto.nome) && this.tipo.equals(outroProduto.tipo);    
    }
}