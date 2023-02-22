package KiberCW.class_pisces;

public class Osteichthyes extends Pisces {
    public Osteichthyes(String classOfPisces, String genus, String properties) {
        super(classOfPisces, genus, properties);
    }

    @Override
    public String eat() {
        return super.eat() + "планктоном.";
    }


}
