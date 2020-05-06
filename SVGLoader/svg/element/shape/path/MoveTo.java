package svg.element.shape.path;

import svg.element.shape.path.PathOp;


public class MoveTo extends PathOp {
    private double x;
    private double y;

    protected String label = "MoveTo";
    protected boolean absolute;
}