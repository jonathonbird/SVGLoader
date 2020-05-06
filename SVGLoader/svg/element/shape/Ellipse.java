package svg.element.shape;

import svg.element.Element;

public class Ellipse extends Shapes {
    private double cx;
    private double cy;
    private double rx;
    private double ry;

    public Ellipse(String label) {
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
