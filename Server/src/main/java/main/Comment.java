/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Test.TestUserBase;

/**
 *
 * @author exp
 */
public class Comment {
    private int id;
    private int idUser;
    private int id_post;
    private String comment;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = TestUserBase.IdComment();
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getId_post() {
        return id_post;
    }

    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
}
