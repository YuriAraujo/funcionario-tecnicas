package br.unifor.tecnicas;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Gerente extends Funcionario {

    public Gerente(String nome, BigDecimal salario, LocalDate dataContratacao) {
        setNome(nome);
        setSalario(salario);
        setDataContratacao(dataContratacao);
    }

    public void aumentaSalario(BigDecimal percentual) {
        if (LocalDate.now().getYear() - getDataContratacao().getYear() >= 10) {
            setSalario(getSalario().multiply(percentual.multiply(new BigDecimal(2)).divide(new BigDecimal(100))
                    .add(new BigDecimal(1))));
        } else {
            setSalario(getSalario().multiply(percentual.divide(new BigDecimal(100)).add(new BigDecimal(1))));
        }
    }

}
