import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Izvodjac izvodjac = new Izvodjac(1, "JohnBonJovi", "Band", 1980, 2000, "https://www.bonjovi.com/");
        Izvodjac izvodjac2 = new Izvodjac(2, "MichaelJackson", "Solo", 1982, 2007, "https://www.michaeljackson.com/");
        Izvodjac izvodjac3 = new Izvodjac(3, "Sting", "Band", 1985 , 2005, "https://www.sting.com/");



        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root")) {
            String query = "INSERT INTO izvodjac (id, nazivIzvodjaca, tipIzvodjaca, godinaFormacije, godinaRaspada, zvanicanSajt) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, izvodjac.getId());
            st.setString(2, izvodjac.getNazivIzvodjaca());
            st.setString(3, izvodjac.getTipIzvodjaca());
            st.setInt(4, izvodjac.getGodinaFormacije());
            st.setNull(5, Types.INTEGER);
            st.setString(6, izvodjac.getZvanicniSajt());

            st.execute();
        } catch (SQLException ex) {
            System.out.println("Greška u konekciji sa bazom podataka:\n" + ex.getMessage());
        }
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root")) {
            String query = "INSERT INTO izvodjac (id, nazivIzvodjaca, tipIzvodjaca, godinaFormacije, godinaRaspada, zvanicanSajt) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, izvodjac2.getId());
            st.setString(2, izvodjac2.getNazivIzvodjaca());
            st.setString(3, izvodjac2.getTipIzvodjaca());
            st.setInt(4, izvodjac2.getGodinaFormacije());
            st.setNull(5, Types.INTEGER);
            st.setString(6, izvodjac2.getZvanicniSajt());

            st.execute();
        } catch (SQLException ex) {
            System.out.println("Greška u konekciji sa bazom podataka:\n" + ex.getMessage());
        }
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root")) {
            String query = "INSERT INTO izvodjac (id, nazivIzvodjaca, tipIzvodjaca, godinaFormacije, godinaRaspada, zvanicanSajt) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, izvodjac3.getId());
            st.setString(2, izvodjac3.getNazivIzvodjaca());
            st.setString(3, izvodjac3.getTipIzvodjaca());
            st.setInt(4, izvodjac3.getGodinaFormacije());
            st.setNull(5, Types.INTEGER);
            st.setString(6, izvodjac3.getZvanicniSajt());

            st.execute();
        } catch (SQLException ex) {
            System.out.println("Greška u konekciji sa bazom podataka:\n" + ex.getMessage());
        }
    }
}