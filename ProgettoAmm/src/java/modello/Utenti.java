/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modello;

/**
 *
 * @author Erica Manca
 */
public class Utenti {
    private int id;
    private String nome, cognome, email, password, urlpic;

    public Utenti() {
        id = 0;
        nome = "";
        cognome = "";
        email = "";
        password = "";
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getName() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setName(String name) {
        this.nome = nome;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return cognome;
    }

    /**
     * @param cognome the surname to set
     */
    public void setSurname(String surname) {
        this.cognome = surname;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public boolean equals(Object user) {
        if (user instanceof Utenti)
            if (this.getId() == ((Utenti)user).getId()) return true;
        return false;
    }

    /**
     * @return the url of the profile pic
     */
    public String getUrlPropic() {
        return urlpic;
    }

    /**
     * @param propic the url of the profile pic to set
     */
    public void setUrlPropic(String propic) {
        this.urlpic = propic;
    }
}
