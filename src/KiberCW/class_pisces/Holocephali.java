package KiberCW.class_pisces;

public class Holocephali extends Pisces {
    public Holocephali(String classOfPisces, String genus, String properties) {
        super(classOfPisces, genus, properties);
    }

    @Override
    public String eat() {
        return super.eat() + "организмами бентоса";
    }
}
