import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LojaVirtualTest {

    private LojaVirtual lojaVirtual;

    @BeforeEach
    public void init(){
        lojaVirtual = new LojaVirtual();
        System.out.println("Iniciando um novo caso de teste");
    }

    @Test
    public void testeCriarProduto() {
        lojaVirtual.criarProduto();
        Produto produto = lojaVirtual.criarProduto();
        Assertions.assertNotNull(produto);
        assertEquals(1, produto.getId());
        assertEquals("mouse", produto.getNome());
        assertEquals(50D, produto.getPreco());
    }

    @Test
    public void testeCriarCarrinho() {
        Carrinho carrinho = lojaVirtual.criarCarrinho();

        assertNotNull(carrinho);
        assertTrue(carrinho.getItens().isEmpty());
    }

    @Test
    public void testeAdicionarAoCarrinho() {
        Produto produto = lojaVirtual.criarProduto();

        lojaVirtual.criarCarrinho();
        lojaVirtual.adicionarAoCarrinho(produto);

        Carrinho carrinho = lojaVirtual.getCarrinho();

        assertNotNull(carrinho);
        assertTrue(carrinho.getItens().contains(produto));
    }
}
