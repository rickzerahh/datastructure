package revisao01;
import java.util.Scanner;

public class ControleDeFuncionario {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Cadastro cadFuncionarios = new Cadastro (3);
        int op;
        String matr;
        do {
            exibeOpcoes();
            op = in.nextInt(); in.nextLine();
            switch (op) {
                case 1: System.out.print("Informe a matrícula do funcionário: ");
                        matr = in.nextLine();
                        cadFuncionarios.admitir(matr);
                        break;
                case 2: cadFuncionarios.exibirTodos();
                        break;
                case 3: System.out.println("Em desenvolvimento");
                        break;
                case 4: System.out.println("Em desenvolvimento");
                        break;
                case 5: System.out.println("Em desenvolvimento");
                        break;
                case 6: System.out.println("Fim de programa");
                        break;
                default: System.out.println("Opção inválida!");
            }
        } while (op != 6);
        in.close();
    }
    public static void exibeOpcoes() {
        System.out.println("Programa de controle de cadastro de funcionários");
        System.out.println("OPÇÕES");
        System.out.println("1 – Admitir novo funcionário");
        System.out.println("2 – Exibir todos os funcionários da empresa");
        System.out.println("3 – Aplicar aumento de salário a um funcionário");
        System.out.println("4 – Exibir os dados de um funcionário");
        System.out.println("5 – Demitir um funcionário");
        System.out.println("6 – Encerrar o programa");
        System.out.print("Informe a opção: ");
    }
}  