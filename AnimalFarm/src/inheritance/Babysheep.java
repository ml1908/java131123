package inheritance;

public class Babysheep extends Animal{
    protected String wool;
    protected int lenght;
    public Babysheep(String noise, String wool, int lenght) {
        super(noise);
        this.wool = wool;
        this.lenght = lenght;

    }
    public String getWool() {
        return wool;
    }
    public int getLenght() {
        return lenght;
    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("has wool: " + wool);
        System.out.println("lenght: " + lenght + " m");
    }
}
