package life;

public class Animal extends LivingBeing{
    private int animalId;

    @Override
    public void walk() {
        System.out.print("Animal walking....");
    }
}
