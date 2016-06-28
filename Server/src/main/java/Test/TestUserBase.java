/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import main.Comment;
import main.Publicetion;
import main.UserProfile;

/**
 *
 * @author exp
 */
public class TestUserBase {
    public static Map<String,UserProfile> UserList=new HashMap<>();
    public static Map<Integer,Publicetion> PublicationList = new HashMap<>();
    public static Map<Integer,Comment> ComentList = new HashMap<>();
   public static int id = 0;
   public static int idp = 0;
   public static int idc = 0;

    public static int plus() {
        id++;
        return id;
    }
    
    public static int IdPublic(){
        idp++;
        return idp;
    }
    
    public static int IdComment(){
        idc++;
        return idc;
    }
    
    }
    
    
    
    
    
