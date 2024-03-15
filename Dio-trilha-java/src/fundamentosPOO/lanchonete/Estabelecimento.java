package fundamentosPOO.lanchonete;

import fundamentosPOO.lanchonete.areaCliente.Cliente;
import fundamentosPOO.lanchonete.atendimento.Atendente;
import fundamentosPOO.lanchonete.atendimento.cozinha.Almoxarife;
import fundamentosPOO.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();

		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();

		
		Atendente atendente = new Atendente();
		atendente.receberPagamento();
		atendente.servindoMesa();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
	}
}