import life.Bird;
import life.LivingBeing;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void run(LivingBeing l)
    {
        if(l instanceof Bird)
            ((Bird) l).fly();
    }

    public static void main(String[] args) {
        LivingBeing l = new Bird();

        run(l);
    }
}