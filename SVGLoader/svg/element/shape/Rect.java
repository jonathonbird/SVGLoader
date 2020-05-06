package svg.element.shape;

import svg.element.Element;

public class Rect extends Shapes {
    private double x;
    private double y;
    private double rx;
    private double ry;
    private double width;
    private double height;
    private final String label = "rect";

    public Rect(String label) {
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
