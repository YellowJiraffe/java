package javase.lesson4.homework.animals;

public class Methods {
    public static void main(String args[]) {
        Animal[] animal = getArr();
        TaskUtils.printArr(animal);
        System.out.println(getAmount(animal));
        System.out.println(getOldestAnimal(animal));
        TaskUtils.printArr(getYoungestAnimal(animal, 9));
        System.out.println(getAnimal(animal, "Пушок"));
        System.out.println(amountOfAges(animal));
        System.out.println(getTrue(animal, 2));
        Animal cat = new Animal(1, 1, "Пушок");
        System.out.println(getTrueOfFalse(animal, cat));
        System.out.println(getAmountOfAnimals(animal, "sub"));
        getInformationAboutAnimals(animal);

    }

    //Метод возвращает массив объектов Animal, заполненный произвольным образом
    public static Animal[] getArr() {
        Animal cat = new Animal(1, 1, "Пушок");
        Animal dog = new Animal(2, 19, "Шарик");
        Animal pig = new Animal(3, 15, "Хрюня");
        Animal chicken = new Animal(4, 10, "Максим");
        Animal panda = new Animal(5, 7, "Соня");
        Animal[] animal = new Animal[5];
        animal[0] = cat;
        animal[1] = dog;
        animal[2] = pig;
        animal[3] = chicken;
        animal[4] = panda;
        return animal;
    }

    //Метод принимает массив объектов Animal и возвращает количество животных
    public static int getAmount(Animal[] arr) {
        return arr.length;
    }

    //Метод принимает массив объектов Animal и возвращает объект самого старшего животного
    public static Animal getOldestAnimal(Animal[] arr) {
        Animal a = arr[0];
        int n = a.age;
        for (int i = 0; i < arr.length; i++) {
            Animal b = arr[i];
            if (n < b.age) {
                n = b.age;
                a = arr[i];
            }
        }
        return a;
    }

    //Метод принимает массив Animal и число age и возвращает массив животных, которые моложе age
    public static Animal[] getYoungestAnimal(Animal[] arr, int age) {
        int k = 0;
        for (Animal a : arr) {
            if (a.age < age) {
                k++;
            }

        }
        Animal array1[] = new Animal[k];
        int t = 0;
        for (Animal a : arr) {
            if (a.age < age) {
                array1[t] = a;
                t++;
            }
        }

        return array1;
    }

    //Метод принимает массив Animal и строку name и возвращает объект животного с таким именем или null, если его нет
    public static Animal getAnimal(Animal[] arr, String name) {
        for (Animal a : arr) {
            if (a.name == name) {
                return a;
            }

        }
        return null;
    }

    // Метод принимает массив Animal и возвращает сумму лет животных
    public static int amountOfAges(Animal[] arr) {
        int sum = 0;
        for (Animal a : arr) {
            sum = sum + a.age;
        }
        return sum;
    }

    //Метод принимает массив Animal и id и возвращает true если есть в массиве животное с таким id
    public static boolean getTrue(Animal[] arr, int id) {
        for (Animal a : arr) {
            if (a.id == id) {
                return true;
            }

        }
        return false;
    }

    //Метод принимает массив Animal и другой объект типа Animal и возвращает true если в массиве есть такой объект, иначе false
    public static boolean getTrueOfFalse(Animal[] arr, Animal b) {
        for (Animal a : arr) {
            if (a.equals(b)) {
                return true;
            }

        }
        return false;
    }

    //  Метод принимает массив Animal и строку sub и возвращает количество животных, у которых имя начинается на sub

    public static int getAmountOfAnimals(Animal[] arr, String sub) {
        int k = 0;
        for (Animal a : arr) {
            if (a.name.startsWith(sub)) {
                k++;
            }
        }
        return k;
    }

    //Метод примимает массив Animal и выводит на экран информацию об этих животных.
    public static void getInformationAboutAnimals(Animal[] arr) {
        for (Animal a : arr) {
            System.out.println(a.name + " " + a.id + " " + a.age);
        }
    }
}





