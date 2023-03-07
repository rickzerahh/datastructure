import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;


public class Cadastro {


    private Funcionario[] lista;
    private int total;


    public Cadastro(int tam) {
        this.lista = new Funcionario[tam];
    }


    public void admitir(String matr) {
        Scanner in = new Scanner(System.in);
        String nome, cargo;
        double salario;
        int ano;
        if (this.total == this.lista.length) {
            System.out.println("Cadastro cheio!!");
        } else {
            int result = this.busca(matr);
            if (result != -1) {
                System.out.println("Já existe um funcionário com esta matrícula!");
            } else {
                Funcionario f = new Funcionario(matr);
                System.out.println("Informe o nome do funcionário: ");
                nome = in.nextLine();
                f.setNome(nome);
                System.out.println("Informe o cargo que o funcioário irá ocupar: ");
                cargo = in.nextLine();
                f.setCargo(cargo);
                System.out.println("Informe o salário inicial do funcionário: ");
                salario = in.nextDouble();
                in.nextLine();
                f.setSalario(salario);
                Calendar cal = GregorianCalendar.getInstance();
                ano = cal.get(Calendar.YEAR);
                f.setAno(ano);
                this.lista[this.total] = f;
                this.total++;
                System.out.println("Cadastramento realizado");
            }
        }
        in.close();
    }


    public int busca(String matr) {
        int i;
        Funcionario procurado = new Funcionario(matr);
        for (i = 0; i <= this.total - 1; i++) {
            if (this.lista[i].compareTo(procurado) == 0) {
                return i;
            }
        }
        return -1;
    }


    public void exibirTodos() {
        int i;
        if (this.total == 0) {
            System.out.println("Cadastro de funcionários vazio!");
        } else {
            System.out.println("Dados dos funcionários da empresa");
            for (i = 0; i <= this.total - 1; i++) {
                System.out.println("Funcionário " + (i + 1));
                System.out.println(this.lista[i]);
            }
        }
    }
}
