package KiberCW.class_10;

public class Tutor extends Person implements Callable {
    private int numberOfClasses = 7;

    public Tutor(String name, String surname, int age, String eyeColor, String colorOfHair, String firstStudent, String phoneNumber) {
        super(name, surname, age, eyeColor, colorOfHair, firstStudent, phoneNumber);
        this.numberOfClasses = numberOfClasses;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    @Override
    public String call() {
        return "Позвонить тьютору " + getName() + "можно по номеру " + getPhoneNumber();
    }

    public String call(Tutor anotherTutor) {
        if (this.getPhoneNumber().equals(anotherTutor.getPhoneNumber())) {
            return "Невозможно позвонить самому себе (номера совпадают)";
        } else {
            return "Тьютор" + this.getName() + " " + this.getSurname()
                    + " звонит тюьтору " + anotherTutor.getName()
                    + " " + anotherTutor.getSurname();
        }
    }

}
