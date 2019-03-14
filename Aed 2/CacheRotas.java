public class CacheRotas{
  
  private CacheItem tabela[];
  private int tamanho;
  
  public CacheRotas(int maxTam) {
    tabela = new CacheItem[maxTam];
  }
  
  public int tamanho() {
    return tamanho;
  }
  
  public void imprime() {
    for (int i=0; i<tabela.length; i++)
      if (tabela[i] != null)
        System.out.println(tabela[i].getDestino() + " = " +  
       tabela[i].getDestino());
  }

  private int funcaoHash(String chave) {
    int soma = 0;

    for (int i=0; i<chave.length(); i++)
      soma += chave.charAt(i);

    return soma % tabela.length;
  }
   public CacheItem busca(String chave) {
    if (chave == null) return null;
    
    int indice = funcaoHash(chave);
    int i = 0;
    while (tabela[indice] != null &&
           tabela[indice].getDestino() != chave &&
           i < tabela.length) {
      i++;
      indice = (indice + 1) % tabela.length;
    }
    
    CacheItem retorno = tabela[indice];
    
    if (retorno != null &&  
        retorno.getDestino() == chave)
      return retorno;
    else
      return null;
  }


  public boolean insere(String chave, int valor) {
    if (tamanho == tabela.length || busca(chave) != null) return false;
    
    int indice = funcaoHash(chave);
    int i = 0;
    while (
        tabela[indice] != null &&
        i < tabela.length
        ) {
      i++;
      indice = (indice + 1) % tabela.length;
    }
    
    tabela[indice] = new CacheItem(chave, valor);

    tamanho++;
    return true;
  }
   public boolean remove(String chave) {
    CacheItem item = busca(chave);
    
    if (item == null) return false;
    
    item.setDestino(null);
    item.setInterfaceSaida(0);
    
    tamanho--;
    return true;
  }


  // Métodos ...
}