import com.google.gson.Gson;

import java.io.FileReader;

public class GSONtest {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("src/main/java/Card.json");
            Gson gson = new Gson();
            Card card = gson.fromJson(file, Card.class);
            System.out.println(card.getName());
            System.out.println(card.getRarity());
            System.out.println(card.getValue());
            //FAILS here, seems that the Optional is breaking something
            System.out.println(card.getExpansionName());
            //System.out.println(card.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
