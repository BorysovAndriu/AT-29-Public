package HomeWork_7;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.List;
import java.util.stream.Collectors;

public class Json {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/bank";
    static final String USER = "root";
    static final String PASSWORD = "192837465";

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException{

        Currency currency = new Currency();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        URL url = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=&json");

        List<Currency> listCurrrencies = objectMapper.readValue(url, new TypeReference<List<Currency>>(){});
        List<Currency> listCurrrenciesSort = listCurrrencies.stream()
                .filter(s->s.getRate() > (double)15)
                .collect(Collectors.toList());

        System.out.println(listCurrrenciesSort);

        //Set to DataBase
        Connection connection = null;
        Statement readData = null;
        System.out.println("Registering JDBC driver...");
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Creating database connection...");
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        System.out.println("Executing statement...");

        for(int i = 0 ; i<listCurrrenciesSort.size(); i++){

            PreparedStatement writeQuery = connection
                    .prepareStatement("INSERT INTO `developers` (`value`, `txt`,`rate`,`cc`,`exchangedate`) VALUES (?,?,?,?,?)");
            writeQuery.setInt(1, listCurrrenciesSort.get(i).getR030());
            writeQuery.setString(2, listCurrrenciesSort.get(i).getTxt());
            writeQuery.setDouble(3, listCurrrenciesSort.get(i).getRate());
            writeQuery.setString(4, listCurrrenciesSort.get(i).getCc());
            writeQuery.setString(5, listCurrrenciesSort.get(i).getExchangedate());
            writeQuery.execute();
        }

        readData = connection.createStatement();
        ResultSet resultSet = readData.executeQuery("SELECT * FROM developers");

        System.out.println("Retrieving data from database...");
        System.out.println("\nDevelopers:");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int r030 = resultSet.getInt("value");
            String txt = resultSet.getString("txt");
            Double rate = resultSet.getDouble("rate");
            String cc = resultSet.getString("cc");
            String exchangedate = resultSet.getString("exchangedate");
            System.out.println("\n================\n");
            System.out.println("id: " + id);
            System.out.println("value: " + r030);
            System.out.println("txt: " + txt);
            System.out.println("rate: " + rate);
            System.out.println("cc: " + cc);
            System.out.println("exchangedate: " + exchangedate);
        }

        System.out.println("Closing connection and releasing resources...");
        resultSet.close();
        readData.close();
        connection.close();
    }
}
