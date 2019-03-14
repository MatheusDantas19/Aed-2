public class DocumentoNo {
  private String  documento;
  private DocumentoNo prox;
  
  public DocumentoNo(String destino) { this.documento = destino; }

  public void setProx(DocumentoNo prox) { this.prox=prox; }

  public DocumentoNo getProx() { return prox; }

  public String toString() {
    return this.documento;
  }

}
