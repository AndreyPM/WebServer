/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Test.TestUserBase;
import java.util.ArrayList;

/**
 *
 * @author exp
 */
public class Publicetion {
    private int id;
    private int idCat;
    private int idUser;
    private ArrayList<Integer> IdComment = new ArrayList<>();
    private int countUser;
    private String time;
    private String timeInWork;
    private String material;
    private int like=0;
    private String content;

    public ArrayList<Integer> getIdComment() {
        return IdComment;
    }

    public void setIdComment(int IdComment) {
        this.IdComment.add(IdComment);
    }

    
  
    public int getId() {
        return id;
    }

    public void setId() {
        this.id=TestUserBase.IdPublic();
    }

    
    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getCountUser() {
        return countUser;
    }

    public void setCountUser(int countUser) {
        this.countUser = countUser;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimeInWork() {
        return timeInWork;
    }

    public void setTimeInWork(String timeInWork) {
        this.timeInWork = timeInWork;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLike() {
        return like;
    }

    public void setLike() {
        this.like++;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
    
}
