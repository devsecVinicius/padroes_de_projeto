public abstract class MidiaAbstrata{
	protected String nome;
	
	public Midia( String nome ){
		this.nome = nome;
	}
	
	public String getNome();
  
	public String getExtensao();
	
	public void setNome(String nome);
  
	public void setExtensao(String extensao);
}
