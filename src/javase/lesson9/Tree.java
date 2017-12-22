package javase.lesson9;

public class Tree {
    private Element main;

    public Tree(String value) {
        this.main = new Element(null, value);
    }

    public void add(Element parent, String value) {
        Element newElement = new Element(parent, value);
        parent.addChild(newElement);
    }

    public void printTree() {
        main.print();
    }
}
