package svg.element.shape;

import svg.SVGParser;
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
        if (expr.contains(" x=")) {
            final Double result = SVGParser.extractDouble(expr, " x=");
            if (result != null)
                x = result.doubleValue();
        }
        if (expr.contains(" y=")) {
            final Double result = SVGParser.extractDouble(expr, " y=");
            if (result != null)
                y = result.doubleValue();
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
        if (expr.contains(" width=")) {
            final Double result = SVGParser.extractDouble(expr, " width=");
            if (result != null)
                width = result.doubleValue();
        }
        if (expr.contains(" height=")) {
            final Double result = SVGParser.extractDouble(expr, " height=");
            if (result != null)
                height = result.doubleValue();
        }
        return true;
    }
}
