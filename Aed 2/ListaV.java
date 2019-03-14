public class ListaV {
  private Object[] dados;
  private int tamanho;

  public ListaV(int maxTam) {
    dados = new Object[maxTam];
    tamanho = 0;
  }

  public int tamanho() {
    return tamanho;
  }

  public void imprime() {
    for (int i=0; i<tamanho; i++)
      System.out.println(dados[i]);
  }


  // Classe ListaVetor, atributos, métodos ...

  public Object get(int indice) {
    if (indice < 0 || indice >= tamanho) return null;
    return dados[indice];
  }

  public int busca(Object dado) {
    for (int i=0; i<tamanho; i++)
      if (dados[i].equals(dado)) return i;
    return -1;
  }


  // Classe ListaVetor, atributos, métodos ...

  public boolean insereInicio(Object dado) {
    if (tamanho == dados.length) return false;

    for (int i=tamanho; i>0; i--)
      dados[i] = dados[i-1];

    dados[0] = dado;
    tamanho++;

    return true;
  }


  // Classe ListaVetor, atributos, métodos...

  public boolean insereFim(Object dado) {
    if (tamanho == dados.length) return false;

    dados[tamanho++] = dado;
    return true;
  }


  // Classe ListaVetor, atributos, métodos ...

  public boolean insereAntes(Object posterior, Object dado) {
    if (tamanho == dados.length) return false;

    int i = busca(posterior);
    if (i == -1) return false;

    for (int j=tamanho; j>i; j--)
      dados[j] = dados[j-1];

    dados[i] = dado;

    tamanho++;
    return true;
  }


  // Classe ListaVetor, atributos, métodos ...

  public boolean insereApos(Object anterior, Object dado) {
    if (tamanho == dados.length) return false;

    int i = busca(anterior);
    if (i == -1) return false;

    for (int j=tamanho; j>i+1; j--)
      dados[j] = dados[j-1];

    dados[i+1] = dado;

    tamanho++;
    return true;
  }


  // Classe ListaVetor, atributos, métodos ...

  public Object removeIndice(int indice) {
    if (indice < 0 || indice >= tamanho) return null;

    Object retorno = dados[indice];

    for (int i=indice; i<tamanho-1; i++)
      dados[i] = dados[i+1];

    tamanho--;
    return retorno;
  }


  // Classe ListaVetor, atributos, métodos ...

  public Object removeInicio() {
    return removeIndice(0);
  }

  public Object removeFim() {
    return removeIndice(tamanho-1);
  }

  public Object removeDado(Object dado) {
    return removeIndice(busca(dado));
}

}

class main{
	public static void main(String [] args){
		ListaV alunos = new ListaV(10);
   alunos.insereInicio("Luke Skywalker");
    alunos.insereApos("Luke Skywalker", "Anakin Skywalker");
    alunos.insereFim("Obi-Wan Kenobi");
    alunos.insereFim("Qui-Gon Jinn");
    alunos.insereFim("Yoda");
    alunos.insereFim("N'Kata Del Gormo");
    alunos.imprime();
	}
}
