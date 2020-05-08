package svg.element.shape;

import svg.SVGParser;
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
    public Element newInstance(){
        return new Line(label);
    }

    @Override
    public boolean load(String expr) {
        if (expr.contains(" x1=")) {
            final Double result = SVGParser.extractDouble(expr, " x1=")[0];
            if (result != null)
                x1 = result.doubleValue();
        }
        if (expr.contains(" y1=")) {
            final Double result = SVGParser.extractDouble(expr, " y1=")[0];
            if (result != null)
                y1 = result.doubleValue();
        }
        if (expr.contains(" x2=")) {
            final Double result = SVGParser.extractDouble(expr, " x2=")[0];
            if (result != null)
                x2 = result.doubleValue();
        }
        if (expr.contains(" y2=")) {
            final Double result = SVGParser.extractDouble(expr, " y2=")[0];
            if (result != null)
                y2 = result.doubleValue();
        }
        return true;
    }
}
