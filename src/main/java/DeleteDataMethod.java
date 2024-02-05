import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.*;

public class DeleteDataMethod {
    public void VeriSil() {
        String url = "jdbc:mysql:sql11.freemysqlhosting.net:3306/sql11678198";
        String kullaniciadi = "sql11678198";
        String sifre = "wVJ6TIBGWB";

        // JDBI nesnesinin oluşturulması ve bağlantının alınması
        Jdbi jdbi = Jdbi.create(url, kullaniciadi, sifre);

        try (Handle handle = jdbi.open()) {
            // Tablo oluşturmak için SQL sorgusu
            // Veri silmek için PreparedStatement kullanımı
            String deleteDataSQL = "DELETE FROM semih_dinler WHERE id = ?";
            int rowsAffected;
            rowsAffected = handle.createUpdate(deleteDataSQL)
                    .bind(0, 9)
                    .execute();

            System.out.println(rowsAffected + " row(s) deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }
