import java.util.Optional;

public class Card{

    private String name;
    private String rarity;
    private Optional<String> expansionName;
    private int value;

    public Card(String cardname,String cardrarity,Optional<String> expansion,int cardval){
        this.name = cardname;
        this.rarity = cardrarity;
        this.expansionName = expansion;
        this.value = cardval;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public void setExpansionName(Optional<String> expansionName) {
        this.expansionName = expansionName;
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
        if(expansionName.isPresent()){
            return expansionName.get();
        }else{
            return "None Specified";
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