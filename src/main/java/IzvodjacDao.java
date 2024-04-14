import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IzvodjacDao {

    private final String url = "jdbc:mysql://localhost:3306/test";
    private final String username = "root";
    private final String password = "root";

    public Izvodjac dohvatiIzvodjaca(int id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "SELECT * FROM izvodjaci WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String nazivIzvodjaca = resultSet.getString("naziv");
                String tipIzvodjaca = resultSet.getString("tip");
                int godinaFormacije = resultSet.getInt("godina");
                Integer godinaRaspada = resultSet.getInt("godina_raspada");
                String zvanicniSajt = resultSet.getString("zvanican_sajt");
                return new Izvodjac(id, nazivIzvodjaca, tipIzvodjaca, godinaFormacije, godinaRaspada, zvanicniSajt);
            }
        } catch (SQLException e) {
        }
        return null;
    }


    public void dodajIzvodjaca(Izvodjac izvodjac) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "INSERT INTO izvodjaci (ime, prezime) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, izvodjac.getNazivIzvodjaca());
            statement.setString(2, izvodjac.getTipIzvodjaca());
            statement.setInt(3, izvodjac.getGodinaFormacije());
            statement.setInt(4, izvodjac.getGodinaRaspada());
            statement.setString(5, izvodjac.getZvanicniSajt());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void azurirajIzvodjaca(Izvodjac izvodjac) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "UPDATE izvodjaci SET ime = ?, prezime = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, izvodjac.getNazivIzvodjaca());
            statement.setString(2, izvodjac.getTipIzvodjaca());
            statement.setInt(3, izvodjac.getGodinaFormacije());
            statement.setInt(4, izvodjac.getGodinaRaspada());
            statement.setString(5, izvodjac.getZvanicniSajt());
            statement.setInt(3, izvodjac.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void obrisiIzvodjaca(int id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "DELETE FROM izvodjaci WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Izvodjac> dohvatiSoloIzvodjace() {
        List<Izvodjac> soloIzvodjaci = new ArrayList<>();
        String query = "SELECT DISTINCT nazivIzvodjaca FROM Izvodjac WHERE tipIzvodjaca = 'Solo'";
        return soloIzvodjaci;
    }

    public List<Izvodjac> prikazIzvodjacaPosleGodine(int godina) {
        List<Izvodjac> izvodjaciPosleGodine = new ArrayList<>();
        String query = "SELECT nazivIzvodjaca,godinaFormiranja FROM Izvodjac WHERE godinaFormiranja > 2000";
        return izvodjaciPosleGodine;
    }
    Izvodjac izvodjac = new Izvodjac();
    Discography discography = new Discography(izvodjac);




}
