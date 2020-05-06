package svg.element.shape.path;

import svg.element.shape.path.PathOp;

public class QuadTo extends PathOp {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    protected String label = "QuadTo";
    protected boolean absolute;
}