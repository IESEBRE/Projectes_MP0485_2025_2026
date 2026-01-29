package mvc.model;

public class Pojo implements java.io.Serializable{

    private String nom;
    private int curs;

    public Pojo(String nom, int curs) {
        this.nom = nom;
        this.curs = curs;
    }

    public Pojo(String nom) {
        this.nom = nom;
    }

    public Pojo(int curs) {
        this.curs = curs;
    }

    public Pojo(){}

    //getters i setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }
}
