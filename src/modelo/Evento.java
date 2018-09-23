package modelo;

public class Evento {
	//-------------------atributos--------------------------
	private int codigo;
	private String nome;
	private String dataInicio;
	private String local;
	private String horaInicio;
	private String dataTermino;
	private String horaTermino;
	private String descricao;
	
	//-------------------metodos -----------------------------
	//construtores
	public Evento() {
		
	}
	public Evento(int codigo, String nome, String dataInicio, String local, String horaInicio) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.local = local;
		this.horaInicio = horaInicio;
	}
	//funcionais
	//acesso
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	public String getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}
	public String getHoraTermino() {
		return horaTermino;
	}
	public void setHoraTermino(String horaTermino) {
		this.horaTermino = horaTermino;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CODIGO: " +codigo+ " NOME: "+nome+" DIA: "+dataInicio+" HORA:"+horaInicio+" LOCAL:"+local;
	}
	
	
	
	

}
