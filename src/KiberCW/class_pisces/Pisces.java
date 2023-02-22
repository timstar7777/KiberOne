package KiberCW.class_pisces;

public class Pisces implements Eatable {
    private String classOfPisces;
    private String genus;
    public String properties;


    public Pisces(String classOfPisces, String genus, String properties) {
        this.classOfPisces = classOfPisces;
        this.genus = genus;
        this.properties = properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Override
    public String eat() {
        return "Я питаюсь ";
    }

    public String getClassOfPisces() {
        return classOfPisces;
    }

    public void setClassOfPisces(String classOfPisces) {
        this.classOfPisces = classOfPisces;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getProperties() {
        return properties;
    }
}
