import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.stream.Stream;

//"INSERT INTO cards(cardname,cardrarity,expansion,cardvalue)"

public class DBtest {
    public static void main(String[] args){

        String queryStr = "select * from cards";
        ResultSet rs = dbQuery(queryStr);
        Card[] arrToStream = new Card[5];
        int counter = 0;

        try {
            while (rs.next()) {

                String cardname = rs.getString("cardname");
                String rarity = rs.getString("cardrarity");
                String expansion = rs.getString("expansion");
                int cardval = rs.getInt("cardvalue");

                Card cardStreamElement = new Card(cardname,rarity,expansion,cardval);
                arrToStream[counter] = cardStreamElement;
                counter++;

                //System.out.printf("Name = %s , Rarity = %s, Expansion = %s Value = %d", cardname, rarity, expansion, cardval);

                //System.out.println();

            }
        }catch(Exception e){

        }

        Stream<Card> testStream = Arrays.stream(arrToStream);
        Stream<Card> printStream = testStream.filter(c -> c.getExpansionName().equals("FanningFlames"));

        printStream.forEach(c -> System.out.println(c.toString()));

    }

    static public ResultSet dbQuery(String inputquery){

        Connection connection=null;
        ResultSet res;
        try{
            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");

            if(connection !=null){
                System.out.println("Good Connection");
            }

            try {
                String query = inputquery;
                Statement statement = null;
                statement = connection.createStatement();
                res = statement.executeQuery(query);
                return res;
            }catch (Exception e){
                System.out.println("failed to execute Query");
            }

        }catch(Exception e){
            System.out.println("failure");
        }
        return null;
    }
}
