
public class PalavraNo {

    private String palavra;
    private DocumentoNo documentosTopo;
    private int documentosTamanho;
    private PalavraNo prox;

    public PalavraNo(String palavra, String documento) {
        this.palavra = palavra;
        DocumentoNo aux = new DocumentoNo(documento);        
        documentosTopo = aux;
        this.insereDocumento(documento);
        documentosTamanho++;
    }

    public String getPalavra() {
        return this.palavra;
    }

    public DocumentoNo getDocumentosTopo() {
        return this.documentosTopo;
    }

    public int getDocumentosTamanho() {
        return this.documentosTamanho;
    }

    public DocumentoNo getDocumento(int indice) {
        int cont = 0;
        DocumentoNo aux = documentosTopo;
        for (; aux != null; aux = aux.getProx()) {
            if (cont == indice) {
                return aux;
            }
            cont++;
        }
        return null;
    }

    public DocumentoNo buscaDocumento(String documento) {
        if (documento == null) {
            return null;
        } else {
            DocumentoNo retorno;
            DocumentoNo aux = documentosTopo;
            while (aux != null && aux.toString() != documento) {
                aux = aux.getProx();
            }
            retorno = aux;
            if (retorno != null
                    && retorno.toString() == documento) {
                return retorno;
            } else {
                return null;
            }
        }
    }

    public boolean insereDocumento(String documento) {
        if (this.buscaDocumento(documento) != null) {
            return false;
        } else {
            DocumentoNo novoNo = new DocumentoNo(documento);
            novoNo.setProx(documentosTopo);
            documentosTopo = novoNo;
            documentosTamanho++;
            return true;
        }
    }

    public PalavraNo getProx() {
        return prox;
    }

    public void setProx(PalavraNo prox) {
        this.prox = prox;
    }

    public String toString(){
    	String res="";
    	res="Palavra '";
    	res+=palavra;
    	res+="': ";
    	DocumentoNo novoNo = documentosTopo;
    	for(;novoNo!=null;novoNo=novoNo.getProx()){
    		res+=novoNo.toString();
    	}
    	return res;
    }
    public void imprime() {
        System.out.println(toString());
    }
}

