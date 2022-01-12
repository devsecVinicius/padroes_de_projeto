public class Midia extends MidiaAbstrata{
	
	public Midia( String nome, String extensao ){
		this.nome = nome;
		this.extensao = extensao;
	}
	
	@Override
	public String getNome(){
		return this.nome;
	}
	@Override
	public String getExtensao(){
		return this.extensao;
	}
	
}
