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
	
	public void imprimirMidias(List<MidiaAbstrata> midias){
		int i = 0;
		for(i = 0; i < midias.size() ; ++i){
			System.out.println("Nome = " + midias.get(i).getNome()+"."+midias.get(i).getExtensao());
		}
	}
	
	public MidiaAbstrata selecionarMidia(List<MidiaAbstrata> listaDeMidias, String nomeDaMidia){
		int i = 0;
		for(i = 0 ; i < listaDeMidias.size() ; ++i ){
			if(nomeDaMidia.equals(listaDeMidias.get(i).getNome()) ){
				return listaDeMidias.get(i);
			}
		}
		return new NullMidia();
	}
}

