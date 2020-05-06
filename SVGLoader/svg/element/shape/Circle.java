package svg.element.shape;

import svg.element.Element;

public class Circle extends Shapes {
    private double cx;
    private double cy;
    private double r;
    private String label = "circle";

    public Circle(String label) {
        super(label);
    }

    @Override
    public Element newInstance() {
        return null;
    }

    @Override
    public boolean load(String expr) {
        return false;
    }


}
