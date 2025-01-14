

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProdutoDAO {
    public void salvarProduto(ProdutosGrafica produtosGrafica) throws SQLException {
        String sql = "INSERT INTO produtos (nm_nome, de_descricao, vl_preco, qnt_estoque) VALUES (?,?,?,?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, produtosGrafica.getNm_nome());
            stmt.setString(2, produtosGrafica.getDe_descricao());
            stmt.setDouble(3, produtosGrafica.getVl_preco());
            stmt.setInt(4, produtosGrafica.getQnt_estoque());

            System.out.println("Executando SQL: " + sql);
            System.out.println("Dados: "
                    + produtosGrafica.getNm_nome() + ", "
                    + produtosGrafica.getDe_descricao() + ", "
                    + produtosGrafica.getVl_preco() + ", "
                    + produtosGrafica.getQnt_estoque());

            stmt.executeUpdate();
        }
    }

    public ArrayList<ProdutosGrafica> listarProdutos() throws SQLException {
        String sql = "SELECT * FROM produtos";
        ArrayList<ProdutosGrafica> produtos = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                ProdutosGrafica produto = new ProdutosGrafica();
                produto.setId_produto(rs.getInt("id_produto"));
                produto.setNm_nome(rs.getString("nm_nome"));
                produto.setDe_descricao(rs.getString("de_descricao"));
                produto.setVl_preco(rs.getDouble("vl_preco"));
                produto.setQnt_estoque(rs.getInt("qnt_estoque"));
                produtos.add(produto);
            }
        }
        return produtos;
    }
}

