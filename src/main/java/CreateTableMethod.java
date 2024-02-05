import java.sql.*;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.StatementException;

public class CreateTableMethod {

    public void tabloYarat() {
        String url = "jdbc:mysql:sql11.freemysqlhosting.net:3306/sql11678198";
        String kullaniciadi = "sql11678198";
        String sifre = "wVJ6TIBGWB";

        // JDBI nesnesinin oluşturulması ve bağlantının alınması
        Jdbi jdbi = Jdbi.create(url, kullaniciadi, sifre);
        try (Handle handle = jdbi.open())  {
            handle.execute("CREATE TABLE IF NOT EXISTS semih_dinler (id SERIAL PRIMARY KEY, name VARCHAR(100))");
            handle.execute("INSERT INTO semih_dinler (name) VALUES (?)", "Semih Dinler");
            handle.execute("INSERT INTO semih_dinler (name) VALUES (?)", "Hande Dinler");
            handle.execute("INSERT INTO semih_dinler (name) VALUES (?)", "İrem Dinler");

            System.out.println("Tablo oluşturuldu.");
        }
        catch (StatementException e) {
            e.printStackTrace();
        }
    }
}

