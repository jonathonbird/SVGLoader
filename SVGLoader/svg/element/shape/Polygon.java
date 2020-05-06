package svg.element.shape;

import svg.element.Element;

import java.util.ArrayList;
import java.util.List;

public class Polygon extends Shapes {

    private final String label = "polygon";
    private final List<Point2D> polygon = new ArrayList<>();

    public Polygon(String label) {
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
