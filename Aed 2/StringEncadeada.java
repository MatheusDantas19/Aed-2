
public class StringEncadeada {

    private StringNo topo;
    private StringNo cauda;
    private int tamanho;

    public StringEncadeada() {
        topo = null;
        cauda = null;
        tamanho = 0;
    }

    /*public StringEncadeada(String dado) {
      insereInicio2(dado);
    }*/
    public StringEncadeada(char[] dado) {
        for (int i = 0; i < dado.length; i++) {
            insereFim(dado[i]);
        }
    }

    public StringEncadeada(String dado) {
        char aux[];
        aux = dado.toCharArray();
        for (int i = 0; i < aux.length; i++) {
            insereFim(aux[i]);
        }
    }

    public StringEncadeada(StringEncadeada dado) {
        for (StringNo no = dado.getTopo(); no != null; no = no.getProx()) {
            this.insereFim(no.getCaractere());
            //tamanho++;
        }
    }

    public StringNo getTopo() {
        return topo;
    }

    public StringNo getCauda() {
        return cauda;
    }

    public void insereInicio(char dado) {
        StringNo novoNo = new StringNo(dado);
        novoNo.setProx(topo);
        if (topo != null) {
            topo.setAnt(novoNo);
        } else {
            cauda = novoNo;
        }
        topo = novoNo;
        tamanho++;
    }

    public void insereFim(char dado) {
        StringNo novoNo = new StringNo(dado);
        novoNo.setAnt(cauda);
        tamanho++;
        if (cauda == null) {
            topo = cauda = novoNo;
            return;
        }
        cauda.setProx(novoNo);
        cauda = novoNo;
    }

    public boolean isEmpty() {
        if (topo == null && cauda == null) {
            return true;
        }
        return false;
    }

    public int length() {
        return tamanho;
    }

    public char charAt(int indice) {
        if (indice >= tamanho) {
            return 0;
        }
        StringNo noAtual = topo;
        while (indice-- > 0) {
            noAtual = noAtual.getProx();
        }
        return noAtual.getCaractere();
    }
    
    public int indexOf(int ch){
        char aux[]= new char[tamanho];
        int i=0;
        
        for (StringNo no = topo; no != null; no = no.getProx()) {
            aux[i]=no.getCaractere();
            i++;
        }
        for (i=0;i<tamanho;i++){
            if(this.charAt(i)==ch){
                return i;
            }
        }
        
        return -1;
    }
    
    public boolean equals(Object str){
        //Object res = this.toString();
        //System.out.println(res);
        char vet [] = new char[tamanho];
        int k=0;
        String s="";
        for(StringNo no=topo;no!=null;no=no.getProx()){
            vet[k]=no.getCaractere();
            k++;
        } 
        for(k=0;k<tamanho;k++){
          s+=vet[k];
        }     
        if(str.equals(s)){
            return true;
        }else{
            return false;
        }
    }

    public void concat(StringEncadeada lista2) {
        for (StringNo no = lista2.getTopo(); no != null; no = no.getProx()) {
            this.insereFim(no.getCaractere());
            //tamanho++;
        }
    }

    public void replace(char oldChar, char newChar) {
        int cont=0; 
        for (StringNo noAtual = topo; noAtual != null; noAtual = noAtual.getProx()) {
            if(oldChar==noAtual.getCaractere()) cont++;
        }
        for(int i=0;i<cont;i++)
        insereIndice(oldChar,newChar);
    }
    
    public int compareTo(StringEncadeada another){
        StringNo p1 = topo;
        StringNo p2 = another.getTopo();
        for(;p1!=null && p2!=null;p1=p1.getProx(),p2=p2.getProx()){
            if( p1.getCaractere() > p2.getCaractere()){
                return 1;
            }else if( p1.getCaractere() < p2.getCaractere()){
                return -1;
            }
        }
        return 0;
    }
    
    public String toString(){
       // Object retorno;
        char aux[] = new char[tamanho];
        int i=0;
        String res="";
        for (StringNo noAtual = topo; noAtual != null; noAtual = noAtual.getProx()) {
            aux[i]=noAtual.getCaractere();
            i++;
        }
        for (i = 0; i < tamanho; i++){   
      res += aux[i];   
  }
        //retorno = res;
        return res;
    }

    public boolean insereIndice(char indice, char dado) {
        if (indice < 0 || indice == tamanho) {
            return false;
        } else {
            StringNo novoNo = new StringNo(dado);
            StringNo noAtual = topo;
            int i = 0;
            while (indice!=noAtual.getCaractere()) {
                noAtual = noAtual.getProx();
            }
            if (noAtual == topo) {
                novoNo.setProx(topo.getProx());
                topo.setAnt(novoNo);
                topo = novoNo;
            } else {
                novoNo.setProx(noAtual.getProx());
                noAtual.getAnt().setProx(novoNo);
                novoNo.setAnt(noAtual.getAnt());
                noAtual.setAnt(novoNo);
            }
            return true;
        }

    }

    public void imprime() {
        for (StringNo noAtual = topo; noAtual != null; noAtual = noAtual.getProx()) {
            System.out.println(noAtual.getCaractere());
        }
    }
}
