package br.unifor.tecnicas;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Random;

public class Funcionario {

    private String nome;
    private LocalDate dataContratacao;
    private BigDecimal salario;
    private int mensagem;


    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public LocalDate getDataContratacao() {return dataContratacao;}

    public void setDataContratacao(LocalDate dataContratacao) {this.dataContratacao = dataContratacao;}

    public BigDecimal getSalario() {return salario;}

    public void setSalario(BigDecimal salario) {this.salario = salario;}

    public void setMensagem(int mensagem) {this.mensagem = mensagem;}

    public int getMensagem() {return mensagem;}

    public void aumentaSalario(BigDecimal percentual) {
        setSalario(getSalario().multiply(percentual.divide(new BigDecimal(100).add(new BigDecimal(1)))));
    }

    public void mensagemPolimorfica(Funcionario f) {
        f.setMensagem(new Random().nextInt((10 - 1) + 1) + 1);
    }

}
