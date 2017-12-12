package DSA.Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;
import Class.*;

public class UserManager {
    final static Logger logger = Logger.getLogger(String.valueOf(UserManager.class));

    public void Template(int UserId, HashMap<Integer,User> UserList){
        try {
            logger.info("Entrando ListarProductosPorPrecio");
            if (UserList.containsKey(UserId)) {
                User usuario = UserList.get(UserId);



                return;
            } else {
                logger.warning("Sorry, something wrong!");
                return;
            }
        }
        catch(Exception ex){
            logger.warning("Sorry, something wrong:    "+ex);
            return;
        }
    }

    public boolean RegisterUser(String UserName, String Email, String Password, HashMap<String,User> UserList){
        try {
            logger.info("Registrando user" + Email);
            if (!UserList.containsKey(Email)) {
                User newUser = new User(UserName, Email, Password);
                UserList.put(Email, newUser);
                return true;
            } else {
                logger.warning("Sorry, something wrong!");
                return false;
            }
        }
        catch(Exception ex){
            logger.warning("Sorry, something wrong:    "+ex);
            return false;
        }
    }

    public boolean LoginUser(String Email, String Password, HashMap<String,User> UserList){
        try {
            logger.info("Logueando user" + Email);
            if (UserList.containsKey(Email)) {
                if(UserList.get(Email).getPassword()==Password)
                return true;
                else return false;
            } else {
                logger.warning("Sorry, something wrong!");
                return false;
            }
        }
        catch(Exception ex){
            logger.warning("Sorry, something wrong:    "+ex);
            return false;
        }
    }


}
