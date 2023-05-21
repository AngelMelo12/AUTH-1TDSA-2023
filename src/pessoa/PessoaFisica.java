package pessoa;

import java.time.LocalDate;
import java.util.Collection;

public class PessoaFisica extends Pessoa {

    private String CPF;

    private Collection<PessoaFisica> pessoasFisicas;

    public PessoaFisica() {
    }

    public PessoaFisica(String CPF, Collection<PessoaFisica> pessoasFisicas) {
        this.CPF = CPF;
        this.pessoasFisicas = pessoasFisicas;
    }

    public PessoaFisica(Long id, String nome, LocalDate nascimento, String CPF, Collection<PessoaFisica> pessoasFisicas) {
        super(id, nome, nascimento);
        this.CPF = CPF;
        this.pessoasFisicas = pessoasFisicas;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Collection<PessoaFisica> getPessoasFisicas() {
        return pessoasFisicas;
    }

    public void setPessoasFisicas(Collection<PessoaFisica> pessoasFisicas) {
        this.pessoasFisicas = pessoasFisicas;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "CPF='" + CPF + '\'' +
                "pessoasFisicas" + pessoasFisicas + '\'' +
                '}';
    }
}
