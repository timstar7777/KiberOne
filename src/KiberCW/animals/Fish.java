package KiberCW.animals;

public class Fish extends Animals {
    private Boolean isMammal;

    public Boolean getMammal() {
        return isMammal;
    }

    public void setMammal(Boolean mammal) {
        isMammal = mammal;
    }

    public Fish(String family, String genus, String species, Boolean isMammal, Boolean doesHaveLimbs) {
        super(family, genus, species, doesHaveLimbs);
        this.isMammal = isMammal;

    }

    @Override
    public String voice() {
        return super.voice() + ": буль-буль";
    }
}
