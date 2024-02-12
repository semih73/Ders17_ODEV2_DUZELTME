import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTableMethod {
    public void degistir()

    {
        String url = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11683450";
        String kullaniciadi = "sql11683450";
        String sifre = "zJJDHznSQU";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, kullaniciadi, sifre);
            String guncelle = "UPDATE semih_dinler SET AD = ?, Soyad = ? WHERE id= ?";
            PreparedStatement preparedStatement = connection.prepareStatement(guncelle);
            preparedStatement.setString(1, "Deniz");
            preparedStatement.setString(2, "Dinler");
            preparedStatement.setString(3, "3");
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Veri güncellendi.");
            } else {
                System.out.println("Veri güncellenemedi.");
            }
            preparedStatement.close();
            connection.close();
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
}


