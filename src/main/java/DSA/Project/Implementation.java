package DSA.Project;
import Class.*;

import java.util.HashMap;

public class Implementation {

    UserManager Manager= new UserManager();
    HashMap<Integer, User> AllUsers = new HashMap<Integer, User>();
    HashMap<Integer, User> OnlineUsers = new HashMap<Integer, User>();

    private static Implementation ourInstance = new Implementation();

    public static Implementation getInstance() {
        return ourInstance;
    }

    private Implementation() {
    }
}
