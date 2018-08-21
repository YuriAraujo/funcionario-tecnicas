package br.unifor.tecnicas;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int option = 999;
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        Funcionario func3 = new Funcionario();
        Gerente ger1 = new Gerente(null, null, null);
        Gerente ger2 = new Gerente(null, null, null);

        func1.setNome("Joao");
        func2.setNome("Jose");
        func3.setNome("Pedro");
        ger1.setNome("Paulo");
        ger2.setNome("Carlos");

        func1.setSalario(new BigDecimal(3000.00));
        func2.setSalario(new BigDecimal(2000.00));
        func3.setSalario(new BigDecimal(2500.00));
        ger1.setSalario(new BigDecimal(4000.00));
        ger2.setSalario(new BigDecimal(5000.00));

        func1.setDataContratacao(LocalDate.of(2017, 8, 20));
        func2.setDataContratacao(LocalDate.of(2018, 3, 15));
        func3.setDataContratacao(LocalDate.of(2017, 12, 1));
        ger1.setDataContratacao(LocalDate.of(2016, 3, 5));
        ger2.setDataContratacao(LocalDate.of(2015, 7, 2));

        funcionarios.addAll(Arrays.asList(func1, func2, func3, ger1, ger2));

        func1.mensagemPolimorfica(ger1);

        ger1.mensagemPolimorfica(func1);

        while (option != 0) {
            System.out.println("O que deseja fazer?");
            System.out.println("1) Cadastrar funcionario");
            System.out.println("2) Cadastrar gerente");
            System.out.println("3) Exibir todos os funcionários cadastrados");
            System.out.println("0) Sair");

            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();

            switch (option) {
                case 1:
                    Funcionario func = new Funcionario();
                    System.out.println("Qual o nome do funcionário?");
                    sc = new Scanner(System.in);
                    func.setNome(sc.nextLine());
                    System.out.println("Qual a data de contratação do funcionario? Ex.: 2018-08-20");
                    sc = new Scanner(System.in);
                    func.setDataContratacao(LocalDate.parse(sc.nextLine()));
                    System.out.println("Qual o salario do funcionario?");
                    sc = new Scanner(System.in);
                    func.setSalario(sc.nextBigDecimal());

                    ger1.mensagemPolimorfica(func);

                    funcionarios.add(func);
                    for (Funcionario f:funcionarios) {
                        System.out.println(f.getMensagem() + " " + f.getNome() + " " + f.getSalario() + " " + f.getDataContratacao());
                    }
                    break;

                case 2:
                    Gerente ger = new Gerente(null, null, null);
                    System.out.println("Qual o nome do gerente?");
                    sc = new Scanner(System.in);
                    ger.setNome(sc.nextLine());
                    System.out.println("Qual a data de contratação do gerente? Ex.: 2018-02-12");
                    sc = new Scanner(System.in);
                    ger.setDataContratacao(LocalDate.parse(sc.nextLine()));
                    System.out.println("Qual o salario do gerente?");
                    sc = new Scanner(System.in);
                    ger.setSalario(sc.nextBigDecimal());

                    func1.mensagemPolimorfica(ger);

                    funcionarios.add(ger);
                    for (Funcionario f:funcionarios) {
                        System.out.println(f.getMensagem() + " " + f.getNome() + " " + f.getSalario() + " " + f.getDataContratacao());
                    }
                    break;

                case 3:
                    for (Funcionario f:funcionarios) {
                        System.out.println(f.getMensagem() + " " + f.getNome() + " " + f.getSalario() + " " + f.getDataContratacao());
                    }
                    break;
            }
        }
    }
}
