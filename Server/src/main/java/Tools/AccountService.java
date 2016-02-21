package Tools;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.UserProfile;

public class AccountService {

    public static String Registration(HttpServletRequest request) throws IOException {
        String response = null;
        UserProfile user = new UserProfile();
        EmailValidator valid = new EmailValidator();
        if(valid.validate(request.getParameter("mail"))==false){
            response ="reg-false mail error";
            return response;
        }
        user.setPassword(request.getParameter("password"));
        user.setLogin(request.getParameter("login"));
        user.setMail(request.getParameter("mail"));
        response ="reg-ok login= "+user.getLogin()+"  password= "+user.getPassword()+"  mail= "+user.getMail();
        return response;
        
    }
    
}
