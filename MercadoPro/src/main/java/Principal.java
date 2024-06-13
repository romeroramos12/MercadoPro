public class Principal {
    public static void main(String[] args) {
        SistemaDeVendas sistema = new SistemaDeVendas();

        // Adicionando alguns produtos
        sistema.adicionarProduto(new Eletronico("Notebook", 2500.00, 10, "Dell", "Inspiron"));
        sistema.adicionarProduto(new Roupa("Camiseta", 50.00, 20, "M", "Azul"));
        sistema.adicionarProduto(new Alimento("Chocolate", 5.00, 30, "12/2024"));

        // Listando produtos
        sistema.listarProdutos();

        // Emitindo relatório
        sistema.emitirRelatorio("relatorio.txt");

        // Salvando o estado do sistema
        sistema.salvarSistema("sistema.ser");

        // Carregando o estado do sistema
        sistema.carregarSistema("sistema.ser");

        // Listando produtos após carregar o sistema
        sistema.listarProdutos();
    }
}