import java.util.Scanner;
class ListaVetor{
	private Object[] vet;
	private int tamanho;

	ListaVetor(int tam){
		vet = new Object[tam];
		tamanho=0;
	}

	public int tamanho(){
		return this.tamanho;
	}

	public void imprime(){
		for(int i=0;i<tamanho;i++){
			System.out.println(vet[i]);
		}
	}

	public Object retorna(int indice){
		if(indice>=0 && indice<tamanho) return vet[indice];
		return null;
	}

	public int busca(Object dado){
		for(int i=0;i<tamanho;i++){
			if(vet[i].equals(dado)) return i;
		}
		return -1;
	}

	public boolean insereInicio(Object dado){
		if(tamanho==vet.length) return false;
		for(int i=tamanho;i>0;i--){
			vet[i]=vet[i-1];
		}
		vet[0]=dado;
		tamanho++;
		return true;
	}

	public boolean insereFim(Object dado){
		if(tamanho==vet.length) return false;
		vet[tamanho++]=dado;
		return true;
	}

	public boolean insereAntes(Object posterior, Object dado){
		if(tamanho==vet.length) return false;
		int i=busca(posterior);
		if(i==-1) return false;
		for(int j=tamanho;j>i;j--){
			vet[j]=vet[j-1];
		}
		vet[i]=dado;
		tamanho++;
		return true;
	}

	public boolean insereApos(Object anterior, Object dado) {
    	if (tamanho == vet.length) return false;
 	    int i = busca(anterior);
    	if (i == -1) return false;
    	for (int j=tamanho; j>i+1; j--){
     		vet[j] = vet[j-1];
    	}
   	 	vet[i+1] = dado;
    	tamanho++;
   	 	return true;
  	}

  	public Object removeIndice(int indice) {
    	if (indice < 0 || indice >= tamanho) return null;
    	Object retorno = vet[indice];
		for (int i=indice; i<tamanho-1; i++){
      		vet[i] = vet[i+1];
      	}
		tamanho--;
    	return retorno;
  	}

  	public Object removeInicio() {
    	return removeIndice(0);
  	}

  	public Object removeFim() {
    	return removeIndice(tamanho-1);
  	}

 	public Object removeDado(Object dado) {
    	return removeIndice(busca(dado));
  	}

  	@SuppressWarnings({ "rawtypes", "unchecked" })
  	public boolean menorQue(Object e1, Object e2) {
    	Comparable c1 = (Comparable) e1;
    	Comparable c2 = (Comparable) e2;
    	return c1.compareTo(c2) < 0;
  	}

  	@SuppressWarnings({ "rawtypes", "unchecked" })
  	public boolean menorIgualQue(Object e1, Object e2) {
    	Comparable c1 = (Comparable) e1;
    	Comparable c2 = (Comparable) e2;
    	return c1.compareTo(c2) <= 0;
  	}
	
	public void ordenaSeletion(){
		//System.out.println("ordenaSeletion");

		for (int i=0;i<tamanho;i++){
			int indicemenor=i;
			for(int j=i+1;j<tamanho;j++){
				if(menorQue(vet[j],vet[indicemenor])) indicemenor = j;
			}
			Object temp = vet[i];
			vet[i]=vet[indicemenor];
			vet[indicemenor]=temp;
		}
	}	

	public void ordenaInsertion() {
    	for (int i=1; i<tamanho; i++) {
      		for (int j=i; j>0 && menorQue(dados[j], dados[j-1]); j--) {
      			Object temp = dados[j];
        		dados[j] = dados[j-1];
        		dados[k-1] = temp;
      		}
    	}
  	}
}
class main{
	public static void main(String [] args){
		ListaVetor vet = new ListaVetor(10);
		vet.insereInicio(9);
		vet.insereFim(1);
		vet.insereInicio(4);
		vet.insereFim(6);
		vet.imprime();
		System.out.println();
		vet.ordenaSeletion();
		vet.imprime();
	}
}

