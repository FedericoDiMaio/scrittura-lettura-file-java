package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
Scrivere un programma che prenda in input da tastiera n.3 account e scriverli in un file con le seguenti proprietà (nome, cognome ed email).
Leggere il file stampando a video esclusivamente le email inserite.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner tastiera = new Scanner(System.in);

        System.out.println("inserisci nome file:");
        String nomeFile = tastiera.nextLine();
        File java = new File("/users/Federico/desktop/" + nomeFile);
        PrintWriter scrivo = new PrintWriter(java);

        ArrayList<Email> posta = new ArrayList<>();

        for (int i = 0; i <3; i++) {
            System.out.println("inserisci nome: ");
            String nome = tastiera.nextLine();
            System.out.println("inserisci cognome: ");
            String cognome = tastiera.nextLine();
            System.out.println("inserisci email: ");
            String email = tastiera.nextLine();
            Email email1 = new Email(nome, cognome, email);
            posta.add(email1);
        }
        for (Email uno : posta) {
            scrivo.println(uno.toString());
        }
        scrivo.close();

        BufferedReader leggo = new BufferedReader(new FileReader(java));
        ArrayList<Email> lettura = new ArrayList<>();
        String riga;
        while ((riga = leggo.readLine()) != null) {
            Email email = Email.fromString(riga);
            lettura.add(email);
        }
    System.out.println("le email inserite sono:");
        for (Email uno : lettura){
            System.out.println(uno.getEmail());
        }

    leggo.close();
    }
}