import java.util.ArrayList;
import java.util.List;

public class Discography {

    private Izvodjac izvodjac;
    private List<Album> albumi;

    public Discography(Izvodjac izvodjac) {
        this.izvodjac = izvodjac;
        this.albumi = new ArrayList<>();
    }

    public void dodajAlbum(Album album) {
        albumi.add(album);
    }

    public void prikaziPodatke() {
        System.out.println("Izvođač: " + izvodjac.getNazivIzvodjaca() + " (" + izvodjac.getTipIzvodjaca() + ")");
        System.out.println("Albumi:");
        for (Album album : albumi) {
            System.out.println("  - Naslov: " + album.getNaslov());
            System.out.println("    Godina izdanja: " + album.getGodinaIzdanja());
            System.out.println("    Izdavačka kuća: " + album.getIzdavackaKuca());
        }
    }
}
