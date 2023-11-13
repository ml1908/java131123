package inheritance;

public class Frog extends Animal{
    protected String jump;
    protected double lenght;
    public Frog(String noise, String jump, double lenght) {
        super(noise);
        this.jump = jump;
        this.lenght = lenght;

    }
    public String getJump() {
        return jump;
    }
    public double getLenght() {
        return lenght;
    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Jump: " + jump);
        System.out.println("lenght: " + lenght + " m");
    }
    public void printFrog() {
        System.out.println("Frog %s,%s he jumps and is: %f m long".formatted(noise, jump, lenght));
    }
}