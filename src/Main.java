import model.Profile;
import model.Role;
import model.Sistema;
import model.User;
import pessoa.Pessoa;
import pessoa.PessoaFisica;
import pessoa.PessoaJuridica;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Vector;

public class Main {

    public static Profile novoProfile(Long id, String nome, Collection<Role> roles){
        Profile profile = new Profile();
        profile.setId(id);
        profile.setNome(nome);
        profile.setRoles(roles);
        return profile;
    }

    public static Role novoRole(Long id, String nome, String descricao){
        Role role = new Role();
        role.setId(id);
        role.setDescricao(descricao);
        role.setNome(nome);
        return role;
    }

    public static Sistema novoSistema(Long id, String nome, String sigla, Collection<Pessoa> pessoas){
        Sistema sistema = new Sistema();
        sistema.setId(id);
        sistema.setNome(nome);
        sistema.setSigla(sigla);
        sistema.setPessoas(pessoas);
        return sistema;
    }

    public static User novoUser(Long id, String email, String password, Collection<Profile> profiles){
        User user = new User();
        user.setId(id);
        user.setEmail(email);
        user.setPassword(password);
        user.setProfiles(profiles);
        return user;
    }

    public static PessoaFisica novaPessoaFisica(String CPF, Long id, String nome, LocalDate nascimento, Collection<PessoaFisica> pessoasFisicas){
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setCPF(CPF);
        pessoaFisica.setId(id);
        pessoaFisica.setPessoasFisicas(pessoasFisicas);
        pessoaFisica.setNome(nome);
        pessoaFisica.setNascimento(nascimento);
        return pessoaFisica;
    }

    public static PessoaJuridica novaPessoaJuridica(String CNPJ, Long id, String nome, LocalDate nascimento, Collection<Pessoa> pessoas){
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setId(id);
        pessoaJuridica.setCNPJ(CNPJ);
        pessoaJuridica.setNome(nome);
        pessoaJuridica.setPessoa(pessoas);
        pessoaJuridica.setNascimento(nascimento);
        return pessoaJuridica;
    }

    public static void main(String[] args) {
        Profile profile = novoProfile(1L, "Beyoncé", new Vector<>());
        Role role = novoRole(2L, "Singer", "Beyoncé é uma das maiores cantoras da atualidade");
        Sistema sistema = novoSistema(3L, "Renaissance", "B", new Vector<>());
        User user = novoUser(4L, "beyonce@fiap.com.br", "blueivy", new Vector<>());
        PessoaFisica pessoaFisica = novaPessoaFisica("40982714866L", 5L, "Angel", LocalDate.of(1993,03,14), new Vector<>());
        PessoaJuridica pessoaJuridica = novaPessoaJuridica("12535412515",  6L, "lulu", LocalDate.of(1970,03,01), new Vector<>());

        System.out.println(profile);
        System.out.println(role);
        System.out.println(sistema);
        System.out.println(user);
        System.out.println(pessoaFisica);
        System.out.println(pessoaJuridica);


    }
}