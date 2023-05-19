package model;

import java.util.Collection;

public class User {

    private Long id;
    private String email;
    private String password;

    private Collection<Profile> profiles;

    public User() {
    }

    public User(Long id, String email, String password, Collection<Profile> profiles) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.profiles = profiles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(Collection<Profile> profiles) {
        this.profiles = profiles;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", profiles=" + profiles +
                '}';
    }

    public User buscaUsuario(String email, String password){
        if (this.email == email && this.password == password) {
            return this;
        } else {
            return null;
        }
    }
}
