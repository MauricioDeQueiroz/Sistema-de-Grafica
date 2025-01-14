

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class SistemaGrafica {
    public static void main(String[] args) {

        try (Connection conn = DatabaseConnection.getConnection()) {
            System.out.println("Conexão bem-sucedida!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ProdutoDAO produtoDAO = new ProdutoDAO();
        ProdutosGrafica produto = new ProdutosGrafica();
        produto.setNm_nome("Caneta Azul");
        produto.setDe_descricao("Caneta esferográfica azul");
        produto.setVl_preco(1.50);
        produto.setQnt_estoque(100);

        try {
            // Salvar um produto
            produtoDAO.salvarProduto(produto);

            // Listar produtos
            ArrayList<ProdutosGrafica> produtos = produtoDAO.listarProdutos();
            for (ProdutosGrafica p : produtos) {
                System.out.println("Produto: " + p.getNm_nome() + ", Preço: " + p.getVl_preco());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
