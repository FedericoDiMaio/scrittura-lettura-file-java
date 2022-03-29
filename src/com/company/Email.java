package com.company;

public class Email {
    private String nome;
    private String cognome;
    private String email;

    public Email(String nome, String cognome, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;

    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return nome + "," + cognome + "," + email;
    }
public static Email fromString(String str){
        String[] split =str.split(",");
        return new Email(split[0], split[1], split[2]);
}

}
