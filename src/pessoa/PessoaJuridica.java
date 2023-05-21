package pessoa;

import java.time.LocalDate;
import java.util.Collection;

public class PessoaJuridica extends Pessoa {

    private String CNPJ;

    private Collection<Pessoa> pessoas;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String CNPJ, Collection<Pessoa> pessoas) {
        this.CNPJ = CNPJ;
        this.pessoas = pessoas;
    }

    public PessoaJuridica(Long id, String nome, LocalDate nascimento, String CNPJ, Collection<Pessoa> pessoas) {
        super(id, nome, nascimento);
        this.CNPJ = CNPJ;
        this.pessoas = pessoas;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public Collection<Pessoa> getPessoa() {
        return pessoas;
    }

    public void setPessoa(Collection<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }


    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "CNPJ='" + CNPJ + '\'' +
                ", pessoas=" + pessoas +
                "} " + super.toString();
    }
}
