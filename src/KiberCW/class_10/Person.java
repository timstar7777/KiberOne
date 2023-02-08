package KiberCW.class_10;

public abstract class Person implements Printable {

    private String name;
    private String surname;
    private int age;
    private String eyeColor;
    private String colorOfHair;
    private String firstStudent;
    private String phoneNumber;


    public Person(String name, String surname, int age, String eyeColor, String colorOfHair, String firstStudent, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.eyeColor = eyeColor;
        this.colorOfHair = colorOfHair;
        this.firstStudent = firstStudent;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getColorOfHair() {
        return colorOfHair;
    }

    public void setColorOfHair(String colorOfHair) {
        this.colorOfHair = colorOfHair;
    }

    public String getFirstStudent() {
        return firstStudent;
    }

    public void setFirstStudent(String firstStudent) {
        this.firstStudent = firstStudent;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract String call();

    @Override
    public String print() {
        return String.format("Имя: %s;\nФамилия: %s;\nНомер телефона: %s.", name, surname, phoneNumber);
    }
}
