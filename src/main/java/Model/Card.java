package Model;

public class Card {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //private String type;
    public enum types {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS
    }
    private types type;
    private int number;
    private int value;
    private String name;
    private boolean isVisible;
    private boolean isUsed;

    public Card(types type, String name, int number, int value, boolean isVisible, boolean isUsed){
        this.type = type;
        this.name = name;
        this.number = number;
        this.value = value;
        this.isVisible = isVisible;
        this.isUsed = isUsed;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }
}
