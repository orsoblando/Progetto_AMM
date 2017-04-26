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
public class Post {
    public enum Type {
        TEXT, IMAGE
    };

    protected int id;
    protected Utenti user;
    private String content;
    private Type postType;

    public Post() {
        id = 0;
        user = null;
        content = "";
        postType = Type.TEXT;
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
     * @return the user
     */
    public Utenti getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Utenti user) {
        this.user = user;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the postType
     */
    public Type getPostType() {
        return postType;
    }

    /**
     * @param postType the postType to set
     */
    public void setPostType(Type postType) {
        this.postType = postType;
    }
}
