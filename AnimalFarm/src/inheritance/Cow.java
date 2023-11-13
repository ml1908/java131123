package inheritance;

public class Cow extends Animal{
    protected String eat;
    protected int lenght;
    public Cow(String noise, String eat, int lenght) {
        super(noise);
        this.eat = eat;
        this.lenght = lenght;

    }
    public String getEat() {
        return eat;
    }
    public int getLenght() {
        return lenght;
    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Eat: " + eat);
        System.out.println("lenght: " + lenght + " m");
    }
}
