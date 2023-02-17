package set;


import java.util.HashSet;
import java.util.Set;

public class Mainbow {
    public static void main(String[] args) {
        Set<Raindbow> myRaindbow = new HashSet<>(){{
            add(new Raindbow("vermelha"));
            add(new Raindbow("vermelha"));
        }};
        System.out.println(myRaindbow);

    }
}


class Raindbow{
 private String color;

    public Raindbow(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Raindbow{" +
                "color='" + color + '\'' +
                '}';
    }
}