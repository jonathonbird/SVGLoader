package svg.element.shape;

import svg.element.Element;

import java.util.ArrayList;
import java.util.List;

public class Polyline extends Shapes {
    private final String label = "polyline";
    private final List<Point2D> polyline = new ArrayList<>();

    public Polyline(String label) {
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
