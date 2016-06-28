package Tools;

import Test.TestUserBase;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.util.Map.Entry;
import javax.servlet.http.HttpServletRequest;
import main.UserProfile;

public class AccountService {

    public static String Registration(HttpServletRequest request) throws IOException {
        String response = null;
        for (Entry entry : TestUserBase.UserList.entrySet()) {
            UserProfile users = (UserProfile) entry.getValue();
            if (users.getToken().equals(request.getParameter("token"))) {
                UserProfile user = new UserProfile();
                user.setToken(request.getParameter("token"));
                System.out.println(user.getToken());
                user.setBackgroundFoto(request.getParameter("backgroundfoto"));
                user.setFoto(request.getParameter("foto"));
                user.setUserName(request.getParameter("username"));
                user.setId(TestUserBase.plus());
                TestUserBase.UserList.put(request.getRequestedSessionId(), user);
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                response = gson.toJson(user);
                break;
            } else {
                users.setToken(request.getParameter("token"));
                users.setBackgroundFoto(request.getParameter("backgroundfoto"));
                users.setFoto(request.getParameter("foto"));
                users.setUserName(request.getParameter("username"));
                TestUserBase.UserList.put(request.getRequestedSessionId(), users);
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                response = gson.toJson(users);
                break;
            }
        }
        return response;

    }

}
