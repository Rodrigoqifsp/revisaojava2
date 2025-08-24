import java.util.ArrayList;
import java.util.List;

public class TesteProduto {
	public static List<Produto> listaDeProdutos() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Celular", 700.00, "Eletrônicos"));
        produtos.add(new Produto("Notebook", 3500.00, "Eletrônicos"));
        produtos.add(new Produto("Teclado", 500.00, "Eletrônicos"));
        produtos.add(new Produto("Mouse", 200.00, "Eletrônicos"));
        produtos.add(new Produto("A Divina Comédia", 53.00, "Livros"));
        produtos.add(new Produto("Roadside Picnic", 51.00, "Livros"));
        produtos.add(new Produto("Blood Meridian", 54.00, "Livros"));
        produtos.add(new Produto("The Witcher", 52.00, "Livros"));
        return produtos;
    }
}