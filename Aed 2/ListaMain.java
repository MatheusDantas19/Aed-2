public class ListaMain{
	public static void main(String [] args){
		ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
		ListaDuplamenteEncadeada l2 = new ListaDuplamenteEncadeada();
		l.insereInicio("An Unearthly Child");
		l.insereInicio("The Cave of Skulls");
		l.insereInicio("The Forest of Fear");
		l.insereInicio("The Firemaker");
		l2.insereInicio("The Dead Planet");
		l2.insereInicio("The Survivors");
		l2.insereInicio("The Escape");
		l.concatena(l2);
		l.insereIndice(5,"The Ambush");
	}
}