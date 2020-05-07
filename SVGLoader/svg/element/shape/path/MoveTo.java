package svg.element.shape.path;

import svg.element.shape.path.PathOp;


public class MoveTo extends PathOp {
    private double x;
    private double y;

    protected String label = "MoveTo";
    protected boolean absolute;

    public MoveTo(String label) {
        super(label);
    }

    public boolean load(String expr) {
        if (expr.contains(" x=")) {
            final Double result = SVGParser.extractDouble(expr, " x=")[0];
            if (result != null)
                x = result.doubleValue();
        }
        if (expr.contains(" y=")) {
            final Double result = SVGParser.extractDouble(expr, " y=")[0];
            if (result != null)
                y = result.doubleValue();
        }

        return false;
    }
}