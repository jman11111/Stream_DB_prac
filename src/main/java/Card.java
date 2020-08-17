public class Card{

    private String name;
    private String rarity;
    private String expansionName;
    private int value;

    public Card(String cardname,String cardrarity,String expansion,int cardval){
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

    public void setExpansionName(String expansionName) {
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
        return expansionName;
    }

    public int getValue() {
        return value;
    }

    public String toString(){
        return "Name = " + this.name + ", Rarity = " + this.rarity + ", Expansion = " + this.expansionName + ", Value = " + this.value;
    }
}