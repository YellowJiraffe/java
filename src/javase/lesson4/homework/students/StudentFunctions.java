package javase.lesson4.homework.students;

public class StudentFunctions {
    public static void main(String args[]) {
        System.out.println("Метод возвращает массив студентов, информация о студентах заполнена произвольным образом:");
        Student[] student = getArr();
        TaskUtils.printArr(student);
        System.out.println(" ");
        System.out.println("Метод принимает массив объектов и выводит на экран информацию о каждом из студентов:");
        getInformationAboutStudents(student);
        System.out.println(" ");
        System.out.println("Метод принимает объект студента и выводит информацию о нём на экран:");
        Student cleverBoy = new Student("Саша", "Иванов", 1, 2, 4);
        getInformationAboutOneStudent(cleverBoy);
        System.out.println(" ");
        System.out.println("Метод принимает студентов и число, возвращает список студентов со средним баллом больше заданного числа:");
        TaskUtils.printArr(getCoolStudents(student, 4));
        System.out.println(" ");
        System.out.println("Метод принимает студентов и отдельного студента и возвращает true если такой студент уже есть массиве:");
        System.out.println(getTrueOfFalse(student, cleverBoy));
        System.out.println(" ");
        System.out.println("Метод принимает студентов и возвращает массив, состоящий из студентов с составными фамилией или именем:");
        TaskUtils2.printStudentArray(getStudentsWithDash(student, "-"));
        System.out.println(" ");
        System.out.println("Метод принимает массив студентов и строку, возвращает массив студентов с именем, как в строке. регистр не имеет значения:");
        TaskUtils2.printStudentArray(getStudentsWithThisName(student, "максим"));
        System.out.println(" ");
        System.out.println("Метод принимает объект студента и возвращает true если он является валидным:");
        System.out.println(getValidStudent(cleverBoy));
        System.out.println(" ");
        System.out.println("Метод принимает студентов и возвращает массив невалидных студентов:");
        TaskUtils.printArr(getInValidStudents(student));
        System.out.println(" ");
        System.out.println("Метод принимает объект студента и число n, возвращает массив размером n, в каждой ячейке которого лежит данный студент:");
        TaskUtils.printArr(getStudentArrayWithLengthN(cleverBoy, 5));
    }

    // Метод возвращает массив студентов, информация о студентах заполнена произвольным образом
    public static Student[] getArr() {
        return new Student[]{new Student("Саша", "Иванов", 1, 2, 4),
                new Student("Анна-Мария", "Петрова", 2, 2, 5),
                new Student("Максим", "Максимов", 3, 5, 5),
        };
    }

    //Метод принимает массив объектов и выводит на экран информацию о каждом из студентов

    public static void getInformationAboutStudents(Student[] arr) {
        new Student("Саша", "Иванов", 1, 2, 4);
        new Student("Анна-Мария", "Петрова", 2, 2, 5);
        new Student("Максим", "Максимов", 3, 5, 5);
        for (Student a : arr) {
            //System.out.println(a.name + " " + a.surname + " " + a.studentNumber + " " + a.groupNumber + " " + a.averageScore);
            //String r = a.name +  " " + a.surname + " " + a.studentNumber + " " + a.groupNumber + " " + a.averageScore;
            System.out.println(a);
        }
    }
//Метод принимает объект студента и выводит информацию о нём на экран

    public static void getInformationAboutOneStudent(Student a) {
        // System.out.println(a.name + " " + a.surname + " " + a.studentNumber + " " + a.groupNumber + " " + a.averageScore);
        System.out.println(a);
    }

    //Метод принимает студентов и число, возвращает список студентов со средним баллом больше заданного числа
    public static Student[] getCoolStudents(Student[] arr, int averageScore) {
        int k = 0;
        for (Student a : arr) {
            if (a.averageScore > averageScore) {
                k++;
            }

        }
        Student arr1[] = new Student[k];
        int t = 0;
        for (Student a : arr) {
            if (a.averageScore > averageScore) {
                arr1[t] = a;
                t++;
            }
        }

        return arr1;
    }

    //Метод принимает студентов и отдельного студента и возвращает true если такой студент уже есть массиве.
    public static boolean getTrueOfFalse(Student[] arr, Student b) {
        for (Student a : arr) {
            if (a.equals(b)) {
                return true;
            }

        }
        return false;
    }

    // Метод принимает студентов и возвращает массив, состоящий из студентов с составными фамилией или именем (Анна-Мария, например), регистр не имеет значения
    public static Student[] getStudentsWithDash(Student[] arr, String dash) {
        int k = 0;
        for (Student a : arr) {
            if (a.name.contains(dash)) {
                k++;
            }
        }
        Student arr1[] = new Student[k];
        int t = 0;
        for (Student a : arr) {
            if (a.name.contains(dash)) {
                arr1[t] = a;
                t++;
            }
        }
        return arr1;
    }

    // Метод принимает массив студентов и строку, возвращает массив студентов с именем, как в строке. регистр не имеет значения

    public static Student[] getStudentsWithThisName(Student[] arr, String name) {
        int k = 0;
        for (Student a : arr) {
            if (a.name.equalsIgnoreCase(name)) {
                k++;
            }
        }
        Student arr1[] = new Student[k];
        int t = 0;
        for (Student a : arr) {
            if (a.name.equalsIgnoreCase(name)) {
                arr1[t] = a;
                t++;
            }
        }
        return arr1;
    }

    //Метод принимает объект студента и возвращает true если он является валидным  (невалидный - нет имени например
    // или номера студенческого, или средний балл выше/ниже допустимых значений, условия невалидности придумать самому)

    public static boolean getValidStudent(Student a) {
        if (a.averageScore < 5) {
            return false;
        }
        return true;
    }

    //Метод принимает студентов и возвращает массив невалидных студентов
    public static Student[] getInValidStudents(Student[] arr) {
        int k = 0;
        for (Student a : arr) {
            if (a.averageScore < 5) {
                k++;
            }
        }
        Student arr1[] = new Student[k];
        int t = 0;
        for (Student a : arr) {
            if (a.averageScore < 5) {
                arr1[t] = a;
                t++;
            }
        }
        return arr1;
    }

    // Метод принимает объект студента и число n, возвращает массив размером n, в каждой ячейке которого лежит данный студент
    public static Student[] getStudentArrayWithLengthN(Student a, int n) {
        Student array1[] = new Student[n];
        for (int i = 0; i < n; i++) {
            array1[i] = a;

        }
        return array1;
    }
}






