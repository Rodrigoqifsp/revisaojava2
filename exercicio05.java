import java.util.List;

public class exercicio05 {
    public static void main(String[] args) {
    	List<Produto> produtos = TesteProduto.listaDeProdutos();
        exercicio04.buscarProdutoNome(produtos, "Notebook")
        	.ifPresent(produto -> System.out.println(produto));
        exercicio04.buscarProdutoNome(produtos, "Câmera")
        	.orElseThrow(() -> new RuntimeException("Produto não encontrado!"));
    }
}
