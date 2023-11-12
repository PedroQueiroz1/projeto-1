import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoTest {

    private Carrinho carrinho;
    private Produto produto;

    @BeforeEach
    public void init(){
        carrinho = new Carrinho();
        produto = new Produto();
        System.out.println("Iniciando um novo caso de teste");
    }

    @Test
    public void testeCarrinhoVazio() {
        assertTrue(carrinho.isVazio());
    }

    @Test
    public void testeAdicionarProduto() {
        carrinho.adicionar(produto);
        assertFalse(carrinho.isVazio());
        assertEquals(1, carrinho.getQtde());
    }

    @Test
    public void testeContemProduto() {
        carrinho.adicionar(produto);
        assertTrue(carrinho.contem(produto));
    }

    @Test
    public void testeQuantidadeDeProdutos() {
        carrinho.adicionar(produto);
        assertEquals(1, carrinho.getQtde());
    }
}
