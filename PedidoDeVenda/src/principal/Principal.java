package principal;

import java.util.Date;

import controller.ClienteController;
import controller.PedidoController;
import controller.ProdutoController;
import model.Cliente;
import model.Pedido;
import model.Produto;

public class Principal {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		
		//instancia e exibe cliente
		ClienteController clienteController = new ClienteController();
		Cliente cliente = clienteController.criarCliente(2, "eduardo", "eduardo@gmail.com");
		clienteController.exibirDetalhesCliente(cliente);
		
		//instancia e exibe produto
		ProdutoController produtoController = new ProdutoController();
		Produto produto = produtoController.criarProduto(3, "camisa", 30.99);
		produtoController.exibirDetalhesProduto(produto);
		
		
		//instancia data para ser usado em pedido
		Date data = new Date();
		
		//instancia e exibe pedido
		PedidoController pedidoController = new PedidoController();
		Pedido pedido = pedidoController.criarPedido(10, 2, data, cliente, produto);
		pedidoController.exibirDetalhesPedido(pedido);
	}
}
