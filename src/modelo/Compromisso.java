package modelo;

public class Compromisso extends Evento{

	public Compromisso(int codigo, String nome, String descricao, String dataInicio, String horaInicio, String dataTermino, String horaTermino) {
		super.setCodigo(codigo);
		super.setNome(nome);
		super.setDescricao(descricao);
		super.setDataInicio(dataInicio);
		super.setHoraInicio(horaInicio);
		super.setDataTermino(dataTermino);
		super.setHoraTermino(horaTermino);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CODIGO: " +super.getCodigo()+ " TITULO: "+super.getNome()+ " DESCRIÇÃO: "+super.getDescricao()+" DIA: "+super.getDataInicio()+" HORA:"+super.getHoraInicio()+
				" DIA ENCERRAMENTO:"+super.getDataTermino() +" HORA ENCERRAMENTO: "+super.getHoraTermino();
	}
	
}
