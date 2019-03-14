
class NoAluno {

    private int matricula;
    private String nome;
    private String curso;
    private double coeficiente;
    private NoAluno esquerda;
    private NoAluno direita;
    private NoAluno pai;

    public NoAluno(int chave, String nome, String curso,double c, NoAluno pai) {
        this.matricula = chave;
        this.pai = pai;
        this.nome = nome;
        this.coeficiente = c;
        this.curso = curso;
    }
    public void setMatricula(int n){
        matricula=n;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setNome (String n){
        nome=n;
    }
    public String getNome(){
        return nome;
    }
    public void setCoeficiente(double c){
        coeficiente=c;
    }
    public double getCoeficiente(){
        return coeficiente;
    }
    public void setEsquerda(NoAluno n){
        esquerda=n;
    }
    public NoAluno getEsquerda(){
        return esquerda;
    }
    public void setDireita(NoAluno n){
        direita=n;
    }
    public NoAluno getDireita(){
        return direita;
    }
    public void setPai(NoAluno n){
        pai=n;
    }
    public NoAluno getPai(){
        return pai;
    }
    public void setCurso (String n){
        curso=n;
    }
    public String getCurso(){
        return curso;
    }



    // getChave, setChave, getValor, setValor ...
}
