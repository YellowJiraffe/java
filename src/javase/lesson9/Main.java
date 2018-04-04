package javase.lesson9;

public class Main {
    public static void main(String[] args) {
        Element element = new Element(null, "Hello");

        Element child1 = new Element(element, "1");
        element.addChild(child1);
        Element child2 = new Element(element, "2");
        element.addChild(child2);
        Element child3 = new Element(element, "3");
        element.addChild(child3);

        Element child4 = new Element(child2, "asfasf");
        child2.addChild(child4);

        element.print();


    }
}
