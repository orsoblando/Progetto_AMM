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
public class Gruppi {
    private int id, membri;
    private String nome, creatore, urlpic;

    public Gruppi() {
        id = 0;
        membri = 0;
        nome = "";
        creatore = "";
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
     * @return the creator of the group
     */
    public String getCreator() {
        return creatore;
    }

    /**
     * @param creator the surname to set
     */
    public void setCreator(String creator) {
        this.creatore = creator;
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
    public String getUrlPic() {
        return urlpic;
    }

    /**
     * @param pic the url of the profile pic to set
     */
    public void setUrlPic(String pic) {
        this.urlpic = pic;
    }
    
    /**
     * @return number of the group's members
     */
    public int getMembers() {
        return membri;
    }

    /**
     * takes count of a new member of the group
     */
    public void addMember() {
        this.membri++;
    }
    
}
