package KiberCW.class_pisces;

public class ChondrichthyesFish extends Pisces {
    public ChondrichthyesFish(String classOfPisces, String genus, String properties) {
        super(classOfPisces, genus, properties);
    }

    @Override
    public String eat() {
        return super.eat() + "моллюсками и прочими безпозвоночными.";
    }


}
