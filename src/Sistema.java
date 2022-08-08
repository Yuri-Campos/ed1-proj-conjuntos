import java.util.Scanner;

public class Sistema {
	
	Produtos controle;
	Scanner scanner;
	
	int escolha;
	
	public Sistema()
	{
		controle = new Produtos();
		scanner = new Scanner(System.in);
	}
	
	public void menu()
	{
		do {
			System.out.println("Bem vindo ao sistema da loja.\nEscolha a opção desejada:\n1-Produtos\n2-Adicionar Produto\n3-Remover Produto\n4-Pesquisar Produto\\n0-Sair");
			escolha = scanner.nextInt();
			switch(escolha) {
				case 1:
					controle.listaProdutos();
					break;
				case 2:
					System.out.println("Insira o nome do produto a ser adicionado: ");
					String produto = scanner.next();
					controle.adicionaProduto(produto);
					break;
				case 3:
					System.out.println("Insira o nome do produto a ser removido: ");
					String produtoRem = scanner.next();
					controle.removeProduto(produtoRem);
					break;
				case 4:
					System.out.println("Insira o nome do produto a ser pesquisado: ");
					String produtoPesq = scanner.next();
					if(controle.contem(produtoPesq))
					{
						System.out.println("Produto em estoque\n\n\n\n\n\n\n\n\n");
						break;
					}
					System.out.println("Produto nao existe no estoque\n\n\n\n\n\n\n\n\n");
					break;
			     	
				case 0:
					break;
			}
	
	     	}while(escolha != 0);
	}
}
