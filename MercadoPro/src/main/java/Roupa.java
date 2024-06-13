public class Roupa extends ProdutoBase {
    private String tamanho;
    private String cor;

    public Roupa(String nome, double preco, int quantidade, String tamanho, String cor) {
        super(nome, preco, quantidade);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    public String detalhes() {
        return String.format("Roupa: %s\nTamanho: %s\nCor: %s\nPreço: R$ %.2f\nQuantidade: %d",
                getNome(), tamanho, cor, getPreco(), getQuantidade());
    }
}