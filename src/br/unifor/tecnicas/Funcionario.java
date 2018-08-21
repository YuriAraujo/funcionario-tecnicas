package br.unifor.tecnicas;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private LocalDate dataContratacao;
    private BigDecimal salario;


    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public LocalDate getDataContratacao() {return dataContratacao;}

    public void setDataContratacao(LocalDate dataContratacao) {this.dataContratacao = dataContratacao;}

    public BigDecimal getSalario() {return salario;}

    public void setSalario(BigDecimal salario) {this.salario = salario;}

    public void aumentaSalario(BigDecimal percentual) {
        setSalario(getSalario().multiply(percentual.divide(new BigDecimal(100).add(new BigDecimal(1)))));
    }
}
