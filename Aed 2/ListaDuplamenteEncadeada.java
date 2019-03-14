	public class ListaDuplamenteEncadeada {
		private No2 topo;
		private No2 cauda;
		private int tamanho;

		public ListaDuplamenteEncadeada() {
			topo = null;
			cauda = null;
			tamanho = 0;
		}

		public void insereInicio(Object dado) {
			No2 novoNo = new No2(dado);
			novoNo.setProx(topo);

			if (topo != null) topo.setAnt(novoNo);
			else cauda = novoNo;

			topo = novoNo;
			tamanho++;
		}

		public int getTamanho() {
			return tamanho;
		}

		public void imprime() {
			for (No2 noAtual=topo; noAtual!=null; noAtual=noAtual.getProx())
				System.out.println(noAtual.getDado());
		}

		public Object get(int indice) {
			if (indice >= tamanho) return null;
			No2 noAtual = topo;
			while (indice-- > 0) noAtual = noAtual.getProx();
			return noAtual.getDado();
		}

		public void imprimeInverso(){
			for(No2 noAtual=cauda; noAtual!=null; noAtual = noAtual.getAnt()){
				System.out.println(noAtual.getDado());
			}
		}
		public Object removeFim() {
			if (topo == null) return null;
			Object retorno = cauda.getDado();

			if (topo == cauda) topo = cauda = null;
			else {
				cauda = cauda.getAnt();
				cauda.setProx(null);
			}

			tamanho--;
			return retorno;
		}
		public void limpa(){
			topo=cauda=null;
			tamanho=0;
		}
		public No2 getTopo(){
			return topo;
		}
		public void insereFim(Object dado) {
			No2 novoNo = new No2(dado);
			novoNo.setAnt(cauda);
			tamanho++;
			if (cauda == null) { topo = cauda = novoNo; return; }
			cauda.setProx(novoNo);
			cauda = novoNo;
		}
		public void concatena(ListaDuplamenteEncadeada lista2){
			for(No2 no=lista2.getTopo();no!=null;no=no.getProx()){
				this.insereFim(no.getDado());
				//tamanho++;
			} 
		}
		public boolean insereIndice(int indice, Object dado){
			if(indice<0 || indice==tamanho){
				return false;
			}else{
				No2 novoNo = new No2(dado);
				No2 noAtual = topo;
				int i=0;
				while (i++<indice)
				 	noAtual = noAtual.getProx();
				if (noAtual == topo){
     				novoNo.setProx(topo);
     				topo.setAnt(novoNo);
     				topo = novoNo;
     			}else{
     				novoNo.setProx(noAtual);
     				noAtual.getAnt().setProx(novoNo);
     				novoNo.setAnt(noAtual.getAnt());
     				noAtual.setAnt(novoNo);
     			}
      			tamanho++;
      			return true;
			}

		}
		public Object[] vetor(){
			int i=0;
			Object vetor[]= new Object[tamanho];
			for (No2 noAtual=topo; noAtual!=null; noAtual=noAtual.getProx()){
				vetor[i]=noAtual.getDado();
				i++;
			}
	  	//for(i=0;i<tamanho;i++) System.out.println(vetor[i]+" ");
			return vetor;
		}
	}
