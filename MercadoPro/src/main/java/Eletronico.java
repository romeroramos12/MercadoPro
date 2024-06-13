public class Eletronico extends ProdutoBase {
    private String marca;
    private String modelo;

    public Eletronico(String nome, double preco, int quantidade, String marca, String modelo) {
        super(nome, preco, quantidade);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String detalhes() {
        return String.format("Eletrônico: %s\nMarca: %s\nModelo: %s\nPreço: R$ %.2f\nQuantidade: %d",
                getNome(), marca, modelo, getPreco(), getQuantidade());
    }
}