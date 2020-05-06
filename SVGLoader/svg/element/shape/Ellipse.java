package svg.element.shape;

import svg.SVGParser;
import svg.element.Element;

public class Ellipse extends Shapes {
    private double cx;
    private double cy;
    private double rx;
    private double ry;
    private final String label = "ellipse";

    public Ellipse(String label) {
        super(label);
    }

    @Override
    public Element newInstance() {
        return null;
    }

    @Override
    public boolean load(String expr) {
        if (expr.contains(" cx=")) {
            final Double result = SVGParser.extractDouble(expr, " cx=");
            if (result != null)
                cx = result.doubleValue();
        }
        if (expr.contains(" cy=")) {
            final Double result = SVGParser.extractDouble(expr, " cy=");
            if (result != null)
                cy = result.doubleValue();
        }
        if (expr.contains(" rx=")) {
            final Double result = SVGParser.extractDouble(expr, " rx=");
            if (result != null)
                rx = result.doubleValue();
        }
        if (expr.contains(" ry=")) {
            final Double result = SVGParser.extractDouble(expr, " ry=");
            if (result != null)
                ry = result.doubleValue();
        }
        return true;
    }
}
