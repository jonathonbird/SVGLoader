package svg.element.shape;

import svg.SVGParser;
import svg.element.BaseElement;
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
        return new Polyline(label);
    }

    @Override
    public boolean load(String expr) {
        if (expr.contains(" points=")) {
            final Double[] result = SVGParser.extractDouble(expr, " points=");
            if (result != null)
                for (int i = 0; i < result.length/2; i+=2) {
                    polyline.add(new Point2D(result[i].doubleValue(),result[i+1].doubleValue())) ;
                }
        }
        return true;
    }
}
