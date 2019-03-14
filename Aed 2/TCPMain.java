
public class TCPMain {
	public static void main(String[]args){
		ArvorePacotesForaDeOrdem a = new ArvorePacotesForaDeOrdem();
		a.pacoteRecebido(3, 1415, 80);
		a.pacoteRecebido(5, 1415, 80);
		a.pacoteRecebido(4, 1415, 80);
		a.pacoteRecebido(1, 1415, 80);
		a.pacoteRecebido(2, 1415, 80);
		System.out.println(a.tamanho());
	}
}
