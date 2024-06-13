import java.io.*;
        import java.util.ArrayList;
import java.util.List;

public class SistemaDeVendas {
    private List<ProdutoBase> produtos;

    public SistemaDeVendas() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(ProdutoBase produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(String nome) {
        produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nome));
    }

    public void listarProdutos() {
        for (ProdutoBase produto : produtos) {
            System.out.println(produto.detalhes());
            System.out.println("---------------------------");
        }
    }

    public void emitirRelatorio(String caminhoArquivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(caminhoArquivo))) {
            for (ProdutoBase produto : produtos) {
                writer.println(produto.detalhes());
                writer.println("---------------------------");
            }
        } catch (IOException e) {
            System.out.println("Erro ao emitir relatório: " + e.getMessage());
        }
    }

    // Métodos de serialização
    public void salvarSistema(String caminhoArquivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caminhoArquivo))) {
            oos.writeObject(produtos);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o sistema: " + e.getMessage());
        }
    }

    public void carregarSistema(String caminhoArquivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminhoArquivo))) {
            produtos = (List<ProdutoBase>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar o sistema: " + e.getMessage());
        }
    }
}