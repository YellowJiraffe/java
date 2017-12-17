package javase.lesson3.homework.notebook;

/**
 * Created by Жираф on 04.11.2017.
 */
public class Notebook { public Note[] text;
    public int emptyNumber;

    public Notebook() {
        text = new Note[5];
        emptyNumber = 0;
    }

    public void add(String line) {
        if (emptyNumber > text.length - 1) {
            System.err.println("I cant!!!");
        } else {
            text[emptyNumber] = new Note(line);
            emptyNumber++;
        }
    }

    public void update(int number, String newLine) {
        if (number >= emptyNumber ) {
            System.err.println("I cant update empty Note");
        } else {
            text[number] = new Note(newLine);
        }
    }

    public void delete(int number) {
        text[number] = null;
    }

    public void show() {
        for (int a = 0; a < text.length; a++) {
            if (text[a] != null) {
                System.out.println(text[a].string);
            } else {
                System.out.println("Empty note");
            }
        }
    }
}
