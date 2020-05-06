package svg.element.shape;

import svg.element.Element;


public class MoveTo extends PathOp{
    private double x;
    private double y;

    protected char label = "MoveTo";
    protected boolean absolute;
}