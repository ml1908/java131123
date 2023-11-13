package inheritance;
import java.util.Objects;

public class Animal {

    protected String noise;


    public Animal (String noise) {
        this.noise = noise;
    }
    public void makeNoise(){
        System.out.println("Noise: " + noise);
    }


}
