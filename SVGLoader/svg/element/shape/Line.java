package svg.element.shape;

import svg.element.Element;

public class Line extends Shapes {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private final String label = "line";

    public Line(String label) {
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
