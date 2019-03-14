public class StringNo {

    private char caractere;
    private StringNo prox;
    private StringNo ant;

    public StringNo(char dado) {
        this.caractere = dado;
        this.prox = null;
        this.ant = null;
    }

    public void setCaractere(char dado) {
        this.caractere = dado;
    }

    public char getCaractere() {
        return caractere;
    }

    public StringNo getProx() {
        return prox;
    }

    public void setProx(StringNo prox) {
        this.prox = prox;
    }

    public StringNo getAnt() {
        return ant;
    }

    public void setAnt(StringNo ant) {
        this.ant = ant;
    }
};