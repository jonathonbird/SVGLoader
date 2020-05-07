package svg.element.shape.path;

public class CubicTo extends PathOp {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    protected String label = "CubicTo";
    protected boolean absolute;

    public CubicTo(String label) {
        super(label);
    }


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

        if (expr.contains(" x3=")) {
            final Double result = SVGParser.extractDouble(expr, " x3=")[0];
            if (result != null)
                x3 = result.doubleValue();
        }

        if (expr.contains(" y3=")) {
            final Double result = SVGParser.extractDouble(expr, " y3=")[0];
            if (result != null)
                y3 = result.doubleValue();
        }
        return true;
    }
}
