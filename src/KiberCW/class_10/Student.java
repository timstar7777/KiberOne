package KiberCW.class_10;

public class Student extends Person implements Callable {
    private int grade;


    public Student(String name, String surname, int age, String eyeColor, String colorOfHair, String firstStudent, String phoneNumber) {


        super(name, surname, age, eyeColor, colorOfHair, firstStudent, phoneNumber);
        this.grade = grade;
    }


    @Override
    public String call() {
        return "Позвонить студенту " + getName() + "можно по номеру " + getPhoneNumber();
    }

    public String call(Person person) {
        if (this.getPhoneNumber().equals(person.getPhoneNumber())) {
            return "Невозможно совершить звонок: номера совпадают.";
        } else {
            return "Студент " + this.getName()
                    + " " + this.getSurname()
                    + " звонит "
                    + person.getName()
                    + " " + person.getSurname();

        }

    }

    @Override
    public String print() {
        return super.print() + "\nКласс: " + grade;
    }
}

