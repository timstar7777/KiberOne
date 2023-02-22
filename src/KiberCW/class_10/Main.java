package KiberCW.class_10;

import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {

        //Person firstPerson = new Person("Anna" ,"James" , 12 , "Blue" , "Blonde", "gfdgg", "421451");

        //System.out.println(firstPerson.name);

        // Person secondPerson = new Person("Ivan" ,"Ivanov" , 20 , "Green" , "Brown" );
        //System.out.println(secondPerson.age);
        // secondPerson.setEyeColor("Brown");
        //   System.out.println(secondPerson.getEyeColor());

        Student firstStudent = new Student("Ruslan", "Ruslanov", 15, "blue", "Brown", "53252", "53252352");
        // System.out.println(firstStudent.getName());
        // System.out.println(firstStudent.getGrade());

        Tutor tutor = new Tutor("Alex", "Volkov", 30, "Brown", "Brown", "gfdgdfg", "5325135");
        //Tutor tutor2 = new Tutor2("Anna", "Gamarova", 26 , "Blue", "Blonde",  "gfdgdfg" , "5325135");
        System.out.println("Новый тьютор " + tutor.getName() + " преподает " + tutor.getNumberOfClasses() + " занятий в неделю.");


        System.out.println(tutor.call(tutor));
        System.out.println(firstStudent.print());
        System.out.println(firstStudent.call(tutor));


    }
}


