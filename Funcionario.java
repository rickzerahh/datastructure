package revisao01;

    public class Funcionario implements Comparable <Funcionario> {
    private String matr;
    private String nome;
    private String cargo;
    private double salario;
    private int ano; 
    public Funcionario (String matr) {
        this.matr = matr;
    }    
    public String getMatr() {
        return this.matr;
    }
    public String getNome() {
        return this.nome;
    }
    public String getCargo() {
        return this.cargo;
    }
    public double getSalario() {
        return this.salario;
    }
    public int getAno() {
        return this.ano;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setCargo (String cargo) {
        this.cargo = cargo;
    }
    public void setSalario (double salario) {
        this.salario = salario;
    }
    public void setAno (int ano) {
        this.ano = ano;
    }
    public String toString () {
        return this.matr + " " + this.nome + " " + this.cargo + " R$" + this.salario + " " + this.ano;
    }
    public int compareTo (Funcionario outro) {
        int result;
        result = this.matr.compareTo(outro.matr);
        return result;
    }
    public void aplicarAumento (double perc) {
        this.salario = this.salario + this.salario * perc / 100;
    }
}