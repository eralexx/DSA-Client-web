package Class;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class User {

    //Start of Attributes
    private static final AtomicInteger count = new AtomicInteger(0);
    private int Id;
    private String UserName;
    private String Email;
    private String Password;
    private int Nivel;
    private int Ataque;
    private int Defensa;
    private int Vida;
    private List<Item> Items;


    //End of Attributes
    //Start of Getters And Setters

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int nivel) {
        Nivel = nivel;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int ataque) {
        Ataque = ataque;
    }

    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int defensa) {
        Defensa = defensa;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public List<Item> getItems() {
        return Items;
    }

    public void setItems(List<Item> items) {
        Items = items;
    }


    //End of Getters And Setters
    //Start of Constructors

    public User(int Id, String UserName, String Email, String Password, List<Item> Items){
        this.Id=Id;
        this.UserName=UserName;
        this.Email=Email;
        this.Password=Password;
        this.Items=Items;
    }
    public User(String UserName, String Email, String Password){
        this.UserName=UserName;
        this.Email=Email;
        this.Password=Password;
    }

    //End of Constructors
}
