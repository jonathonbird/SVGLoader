package svg.element.shape;

import svg.element.Element;

public class QuadTo extends PathOp{
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    protected char label = "QuadTo";
    protected boolean absolute;
}