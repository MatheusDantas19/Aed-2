
public class NoPacoteTCP {
	private int sequencia;
	private int portaOrigem;
	private int portaDestino;
	private NoPacoteTCP esquerda;
	private NoPacoteTCP direita;
	private NoPacoteTCP pai;
	private int balanceamento;
	
	public NoPacoteTCP(int sequencia,int portaOrigem,int portaDestino,NoPacoteTCP pai){
		this.sequencia=sequencia;
		this.portaOrigem=portaOrigem;
		this.portaDestino = portaDestino;
		this.pai=pai;
	}
	public int getSequencia() {
		return sequencia;
	}
	public void setSequencia(int sequencia) {
		this.sequencia = sequencia;
	}
	public int getPortaOrigem() {
		return portaOrigem;
	}
	public void setPortaOrigem(int portaOrigem) {
		this.portaOrigem = portaOrigem;
	}
	public int getPortaDestino() {
		return portaDestino;
	}
	public void setPortaDestino(int portaDestino) {
		this.portaDestino = portaDestino;
	}
	public NoPacoteTCP getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(NoPacoteTCP esquerda) {
		this.esquerda = esquerda;
	}
	public NoPacoteTCP getDireita() {
		return direita;
	}
	public void setDireita(NoPacoteTCP direita) {
		this.direita = direita;
	}
	public NoPacoteTCP getPai() {
		return pai;
	}
	public void setPai(NoPacoteTCP pai) {
		this.pai = pai;
	}
	public int getBalanceamento() {
		return balanceamento;
	}
	public void setBalanceamento(int balanceamento) {
		this.balanceamento = balanceamento;
	}
	public String toString(){
		String res = "Seq: "+getSequencia()+
		", Origem: "+getPortaOrigem()+", Destino: "+
		getPortaDestino();
		return res;
	}
	
}
