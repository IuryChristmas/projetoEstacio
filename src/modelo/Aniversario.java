package modelo;

public class Aniversario extends Evento{

	private String nomeAniversariante;
	private String dataFesta;
	
	public Aniversario(int codigo, String nomeAniversariante, String dataInicio, String local, String horaInicio, String dataFesta) {
		super.setCodigo(codigo);
		super.setDataInicio(dataInicio);
		super.setHoraInicio(horaInicio);
		super.setLocal(local);
		this.nomeAniversariante = nomeAniversariante;
		this.dataFesta = dataFesta;
	}
	
	public String getNomeAniversariante() {
		return nomeAniversariante;
	}
	
	public void setNomeAniversariante(String nomeAniversariante) {
		this.nomeAniversariante = nomeAniversariante;
	}
	
	public String getDataFesta() {
		return dataFesta;
	}
	
	public void setDataFesta(String dataFesta) {
		this.dataFesta = dataFesta;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CODIGO: " +super.getCodigo()+ " NOME ANIVERSARIANTE: "+nomeAniversariante+" DIA DO ANIVERSARIO: "+super.getDataInicio()
				+" DATA FESTA: "+this.dataFesta+" HORA: "+super.getHoraInicio()+" LOCAL:"+super.getLocal();
	}
	
}
