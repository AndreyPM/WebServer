package main;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Random;

public class UserProfile {

    
    private int id;
    private String userName;
    @SerializedName("favoriteId")
    private ArrayList<Integer> fpub = new ArrayList<>();
    private ArrayList<Integer> likespost = new ArrayList<>();
    private String foto;
    private String backgroundFoto;
    private String token;

    public ArrayList<Integer> getLikespost() {
        return likespost;
    }

    public void setLikespost(int likepost) {
        this.likespost.add(likepost);
    }

    
    
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<Integer> getFpub() {
        return fpub;
    }

    public void setFpub(int idfpub) {
        fpub.add(idfpub);
    }



 

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getBackgroundFoto() {
        return backgroundFoto;
    }

    public void setBackgroundFoto(String backgroundFoto) {
        this.backgroundFoto = backgroundFoto;
    }
    

   
}
