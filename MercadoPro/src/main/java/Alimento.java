public class Alimento extends ProdutoBase {
    private String dataValidade;

    public Alimento(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String detalhes() {
        return String.format("Alimento: %s\nData de Validade: %s\nPreço: R$ %.2f\nQuantidade: %d",
                getNome(), dataValidade, getPreco(), getQuantidade());
    }
}