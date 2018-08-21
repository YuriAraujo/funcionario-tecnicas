package br.unifor.tecnicas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int option = 999;
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while (option != 0) {
            System.out.println("O que deseja fazer?");
            System.out.println("1) Cadastrar funcionario");
            System.out.println("2) Cadastrar gerente");
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

                    funcionarios.add(func);
                    for (Funcionario f:funcionarios) {
                        System.out.println(f.getNome() + " " + f.getSalario() + " " + f.getDataContratacao());
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

                    funcionarios.add(ger);
                    for (Funcionario f:funcionarios) {
                        System.out.println(f.getNome() + " " + f.getSalario() + " " + f.getDataContratacao());
                    }
            }
        }
    }
}
