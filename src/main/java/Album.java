import java.io.Serializable;

public class Album implements Serializable {

    private int id;
    private int IdIzvodjaca;
    private String naslov;
    private int godinaIzdanja;
    private String izdavackaKuca;


    public Album() {
    }
    public Album(int id, int IdIzvodjaca,String naslov,int godinaIzdanja,String izdavackaKuca){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdIzvodjaca() {
        return IdIzvodjaca;
    }

    public void setIdIzvodjaca(int idIzvodjaca) {
        IdIzvodjaca = idIzvodjaca;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getIzdavackaKuca() {
        return izdavackaKuca;
    }

    public void setIzdavackaKuca(String izdavackaKuca) {
        this.izdavackaKuca = izdavackaKuca;
    }
    @Override
    public String toString() {
        return getId() + "\t" + getIdIzvodjaca() + "\t" + getNaslov() + "\t" + getGodinaIzdanja() + "\t" + getIzdavackaKuca();
    }

}
