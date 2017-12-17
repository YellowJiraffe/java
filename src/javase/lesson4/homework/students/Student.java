package javase.lesson4.homework.students;

/**
 * Created by Жираф on 23.11.2017.
 */
public class Student {
    public String name;
    public String surname;
    public int studentNumber;
    public int groupNumber;
    public int averageScore;

    public Student(String name, String surname, int studentNumber, int groupNumber, int averageScore) {
        this.name = name;
        this.surname = surname;
        this.studentNumber = studentNumber;
        this.groupNumber = groupNumber;
        this.averageScore = averageScore;
    }

    public String toString() {

        return name + " " + surname + " " + studentNumber + " " + groupNumber + " " + averageScore;
    }
    @Override
    public boolean equals(Object b) {
        if (!(b instanceof Student)) {
            throw new RuntimeException("I don't know, what to do");
        }

        Student object = (Student) b;
        return this.name.equals(object.name) && this.surname.equals(object.surname) &&
                this.studentNumber == object.studentNumber && this.groupNumber == object.groupNumber
                && this.averageScore == object.averageScore;
    }
}
