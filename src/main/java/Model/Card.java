package Model;

public class Card {

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
    private boolean isVisible;
    private boolean isUsed;

    public Card(types type, int number, int value, boolean isVisible, boolean isUsed){
        this.type = type;
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
