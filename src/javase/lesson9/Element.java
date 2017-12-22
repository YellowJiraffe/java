package javase.lesson9;

import java.util.ArrayList;
import java.util.List;

public class Element {
    private Element parent;
    private List<Element> childs;
    private String value;

    public Element(Element parent, String value) {
        this.parent = parent;
        this.childs = new ArrayList<>();
        this.value = value;
    }

    public void addChild(Element element) {
        childs.add(element);
    }

    public void print() {
        System.out.println(value);
        for (Element child : childs) {
            child.print();
        }
    }
}
