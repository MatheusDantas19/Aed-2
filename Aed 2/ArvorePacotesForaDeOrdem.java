
public class ArvorePacotesForaDeOrdem {
	private NoPacoteTCP raiz;
	private int tamanho;
	private int ultimaSequencia;
	
	public ArvorePacotesForaDeOrdem(){
		
	}
	public NoPacoteTCP getRaiz() {
		return raiz;
	}
	
	public int tamanho() {
		return tamanho;
	}
	
	public int getUltimaSequencia() {
		return ultimaSequencia;
	}
	
	public void insere(int sequencia, int portaOrigem, int portaDestino) {
        NoPacoteTCP da_vez = this.raiz;

        if (raiz == null) {
            this.raiz = new NoPacoteTCP(sequencia,portaOrigem,portaDestino, null);
            this.tamanho++;
            return;
        }

        NoPacoteTCP pai;

        do {
            pai = da_vez;
            if (sequencia < da_vez.getSequencia()) {
                da_vez = da_vez.getEsquerda();
            } else if (sequencia > da_vez.getSequencia()) {
                da_vez = da_vez.getDireita();
            } else {
            	da_vez.setPortaOrigem(portaOrigem);
                da_vez.setPortaDestino(portaDestino);
                return;
            }
        } while (da_vez != null);

        NoPacoteTCP candidato = new NoPacoteTCP(sequencia,portaOrigem,portaDestino, pai);

        if (sequencia < pai.getSequencia()) {
            pai.setEsquerda(candidato);
        } else {
            pai.setDireita(candidato);
        }
        this.tamanho++;
        //verificarBalanceamento(candidato);

    }
	
	public NoPacoteTCP minimo() {
		return minimo(raiz);
	}
	public NoPacoteTCP minimo(NoPacoteTCP noAtual) {
		while(noAtual!=null && noAtual.getEsquerda()!=null) noAtual = noAtual.getEsquerda();
		return noAtual;
	}
	
	public NoPacoteTCP maximo() {
		return maximo(raiz);
	}
	
	public NoPacoteTCP maximo(NoPacoteTCP noAtual) {
		while(noAtual!=null && noAtual.getDireita()!=null) noAtual = noAtual.getDireita();
		return noAtual;
	}
	
	public NoPacoteTCP predecessor(NoPacoteTCP no) {
		if(no.getEsquerda()!=null)return maximo(no.getEsquerda());
		
		NoPacoteTCP noAtual = no.getPai();
		while(noAtual != null && no == noAtual.getEsquerda()) {
			no = noAtual;
			noAtual = noAtual.getPai();
		}
		return noAtual;
	}
	
	public NoPacoteTCP sucessor(NoPacoteTCP no) {
		if(no.getDireita()!=null)return minimo(no.getDireita());
		
		NoPacoteTCP noAtual = no.getPai();
		while(noAtual != null && no == noAtual.getDireita()) {
			no = noAtual;
			noAtual = noAtual.getPai();
		}
		return noAtual;
	}
	
	public int altura() {
		return altura(raiz);
	}
	public int altura(NoPacoteTCP noAtual) {
		if(noAtual == null)return 0;
		else {
			int altEsquerda = altura(noAtual.getEsquerda());
			int altDireita = altura(noAtual.getDireita());
			if(altEsquerda>altDireita)return altEsquerda + 1;
			else return altDireita + 1;
		}
	}

	public void remove(NoPacoteTCP noRemove) {
		tamanho--;
		NoPacoteTCP noPai = noRemove.getPai();
		if(noRemove.getEsquerda()==null && noRemove.getDireita()==null) {
			if(noPai==null)raiz = null;
			else {
				if(noRemove==noPai.getEsquerda()) noPai.setEsquerda(null);
				else noPai.setDireita(null);
			}
		}
		else if(noRemove.getEsquerda()==null || noRemove.getDireita()==null) {
			NoPacoteTCP y = noRemove.getEsquerda()!=null ? noRemove.getEsquerda() : noRemove.getDireita();
			y.setPai(noPai);
			if(noPai==null)raiz=y;
			else {
				if(noRemove == noPai.getEsquerda())noPai.setEsquerda(y);
				else noPai.setDireita(y);
			}
		}else {
			NoPacoteTCP noSucessor = sucessor(noRemove);
			noRemove.setSequencia(noSucessor.getSequencia());
			noRemove.setPortaDestino(noSucessor.getPortaDestino());
			noRemove.setPortaOrigem(noSucessor.getPortaOrigem());
			remove(noSucessor);
		}
		
	}
	 private void setBalanceamento(NoPacoteTCP no) {
	        no.setBalanceamento(altura(no.getDireita()) - altura(no.getEsquerda()));
	 }  
	 
	 public void verificarBalanceamento(NoPacoteTCP atual) {
	        setBalanceamento(atual);
	        int balanceamento = atual.getBalanceamento();
	 
	        if (balanceamento == -2) {
	 
	            if (altura(atual.getEsquerda().getEsquerda()) >= altura(atual.getEsquerda().getDireita())) {
	                atual = rotacaoDireita(atual);
	 
	            } else {
	                atual = duplaRotacaoEsquerdaDireita(atual);
	            }
	 
	        } else if (balanceamento == 2) {
	 
	            if (altura(atual.getDireita().getDireita()) >= altura(atual.getDireita().getEsquerda())) {
	                atual = rotacaoEsquerda(atual);
	 
	            } else {
	                atual = duplaRotacaoDireitaEsquerda(atual);
	            }
	        }
	 
	        if (atual.getPai() != null) {
	            verificarBalanceamento(atual.getPai());
	        } else {
	            this.raiz = atual;
	        }
	    }
	 
	 public NoPacoteTCP rotacaoEsquerda(NoPacoteTCP inicial) {
		 NoPacoteTCP direita = inicial.getDireita();
	        direita.setPai(inicial.getPai());
	 
	        inicial.setDireita(direita.getEsquerda());
	 
	        if (inicial.getDireita() != null) {
	            inicial.getDireita().setPai(inicial);
	        }
	 
	        direita.setEsquerda(inicial);
	        inicial.setPai(direita);
	 
	        if (direita.getPai() != null) {
	 
	            if (direita.getPai().getDireita() == inicial) {
	                direita.getPai().setDireita(direita);
	 
	            } else if (direita.getPai().getEsquerda() == inicial) {
	                direita.getPai().setEsquerda(direita);
	            }
	        }
	 
	        setBalanceamento(inicial);
	        setBalanceamento(direita);
	 
	        return direita;
	    }
	 
	    public NoPacoteTCP rotacaoDireita(NoPacoteTCP inicial) {
	    	NoPacoteTCP esquerda = inicial.getEsquerda();
	        esquerda.setPai(inicial.getPai());
	 
	        inicial.setEsquerda(esquerda.getDireita());
	 
	        if (inicial.getEsquerda() != null) {
	            inicial.getEsquerda().setPai(inicial);
	        }
	 
	        esquerda.setDireita(inicial);
	        inicial.setPai(esquerda);
	 
	        if (esquerda.getPai() != null) {
	 
	            if (esquerda.getPai().getDireita() == inicial) {
	                esquerda.getPai().setDireita(esquerda);
	 
	            } else if (esquerda.getPai().getEsquerda() == inicial) {
	                esquerda.getPai().setEsquerda(esquerda);
	            }
	        }
	 
	        setBalanceamento(inicial);
	        setBalanceamento(esquerda);
	 
	        return esquerda;
	    }
	 
	    public NoPacoteTCP duplaRotacaoEsquerdaDireita(NoPacoteTCP inicial) {
	        inicial.setEsquerda(rotacaoEsquerda(inicial.getEsquerda()));
	        return rotacaoDireita(inicial);
	    }
	 
	    public NoPacoteTCP duplaRotacaoDireitaEsquerda(NoPacoteTCP inicial) {
	        inicial.setDireita(rotacaoDireita(inicial.getDireita()));
	        return rotacaoEsquerda(inicial);
	    }
	   
	    public void pacoteRecebido(int seq, int pO, int pD){
	    	if(seq-1==getUltimaSequencia()){
	    		ultimaSequencia=seq;
            	System.out.println("Seq: " + seq +", Origem: " + pO + ", Destino: " + pD);
	    		//remove(raiz);
	    	}else{
	    		System.out.println("Fora de Ordem "+seq);
	    		insere(seq,pO,pD);
	    	}
	    	NoPacoteTCP aux = minimo();
	    		while(aux != null && aux.getSequencia() == getUltimaSequencia()+1){
            	ultimaSequencia=aux.getSequencia();
            	remove(aux);
            	aux = sucessor(aux);
        	}
	    }
	    	
	
}
