package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int randomIndex = random.nextInt(Ball.ColorEnum.values().length);
        return Ball.ColorEnum.values()[randomIndex].name();
    }
}
