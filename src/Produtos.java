import java.util.HashSet;
import java.util.Set;

public class Produtos {
	Set<String> disponibilidade;
	
	public Produtos()
	{
		disponibilidade = new HashSet<String>();
		disponibilidade.add("rtx_2070");
		disponibilidade.add("playstation_5");
		disponibilidade.add("controle_dualsense");
		disponibilidade.add("xbox_series_x");
		disponibilidade.add("oculos_vr");
		disponibilidade.add("teclado_hyperx");
		disponibilidade.add("mouse_logitech");	
	}
	
	public boolean contem(String pedido)
	{
		if(disponibilidade.contains(pedido))
		{
			return true;
		}
		return false;
	}
	
	public void listaProdutos()
	{
		System.out.println(disponibilidade + "\n\n\n\n\n\n");
	}
	
	public void adicionaProduto(String nomeProd)
	{
		if(!disponibilidade.contains(nomeProd))
		{
			disponibilidade.add(nomeProd);
		}
		else
		{
			System.out.println("Produto já existe na loja\n\n\n\n\n\n");
		}
	}
	
	public void removeProduto(String nomeProd)
	{
		disponibilidade.remove(nomeProd);
	}
	
}
