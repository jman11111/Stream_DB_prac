import java.util.Optional;

public class Card{

    private String name;
    private String rarity;
    private Optional<String> expansionName;
    private int value;

    public Card(String cardname,String cardrarity,String expansion,int cardval){
        this.name = cardname;
        this.rarity = cardrarity;
        this.expansionName = Optional.ofNullable(expansion);
        this.value = cardval;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public void setExpansionName(String expansionName) {
        this.expansionName = Optional.ofNullable(expansionName);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getRarity() {
        return rarity;
    }

    public String getExpansionName() {
        try {
            return expansionName.orElse("None Specified");
        }catch(Exception e){
            e.printStackTrace();
            return "We messed up";
        }
    }

    public int getValue() {
        return value;
    }

    public String toString(){
        if(this.expansionName.isPresent()){
            return "Name = " + this.name + ", Rarity = " + this.rarity + ", Expansion = " + this.expansionName.get() + ", Value = " + this.value;
        }else{
            return "Name = " + this.name + ", Rarity = " + this.rarity + ", Expansion = None Specified" + ", Value = " + this.value;
        }
    }
}