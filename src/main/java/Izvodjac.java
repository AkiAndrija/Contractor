import java.io.Serializable;

public class Izvodjac implements Serializable {

    private int Id;
    private String nazivIzvodjaca;
    private String tipIzvodjaca;
    private int godinaFormacije;
    private Integer godinaRaspada;
    private String zvanicniSajt;


    public Izvodjac() {
    }

    public Izvodjac(int id, String nazivIzvodjaca, String tipIzvodjaca, int godinaFormacije, Integer godinaRaspada, String zvanicniSajt) {
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNazivIzvodjaca() {
        return this.nazivIzvodjaca;
    }

    public void setNazivIzvodjaca(String nazivIzvodjaca) {
        this.nazivIzvodjaca = nazivIzvodjaca;
    }

    public String getTipIzvodjaca() {
        return tipIzvodjaca;
    }

    public void setTipIzvodjaca(String tipIzvodjaca) {
        this.tipIzvodjaca = tipIzvodjaca;
    }

    public int getGodinaFormacije() {
        return godinaFormacije;
    }

    public void setGodinaFormacije(int godinaFormacije) {
        this.godinaFormacije = godinaFormacije;
    }

    public Integer getGodinaRaspada() {
        return godinaRaspada;
    }

    public void setGodinaRaspada(Integer godinaRaspada) {
        this.godinaRaspada = godinaRaspada;
    }

    public String getZvanicniSajt() {
        return zvanicniSajt;
    }

    public void setZvanicniSajt(String zvanicniSajt) {
        this.zvanicniSajt = zvanicniSajt;
    }

    @Override
    public String toString() {
        return getId() + "\t" + getNazivIzvodjaca() + "\t" + getTipIzvodjaca() + "\t" + getGodinaFormacije() + "\t" + getGodinaRaspada() + "\t" + getZvanicniSajt();
    }
}
