package KiberCW.class_pisces;

public class Crossopterygii extends Pisces {
    public Crossopterygii(String classOfPisces, String genus, String properties) {
        super(classOfPisces, genus, properties);
    }

    @Override
    public String eat() {
        return super.eat() + "рыбой и кальмарами";
    }
}
