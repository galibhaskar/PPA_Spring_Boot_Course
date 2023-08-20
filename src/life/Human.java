package life;

public class Human extends LivingBeing {

    private int uuid;

    private String gender;

    @Override
    public void walk() {
        System.out.print("Human walking....");
    }
}
