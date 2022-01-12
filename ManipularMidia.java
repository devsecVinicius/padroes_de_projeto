import java.util.ArrayList;
import java.util.List;

public class ManipularMidia{
	InterfaceAdicionarMidia addMidia;
	String nome;
	
	public ManipularMidia(InterfaceAdicionarMidia addMidia, String nome){
		this.addMidia = addMidia;
		this.nome = nome;
	}
	
	public ManipularMidia(){
		
	}
	
	public void imprimirMidias(List<Midia> midias){
		int i = 0;
		for(i = 0; i < midias.size() ; ++i){
			System.out.println("Nome = " + midias.get(i).nome+"."+midias.get(i).extensao);
		}
	}
}

